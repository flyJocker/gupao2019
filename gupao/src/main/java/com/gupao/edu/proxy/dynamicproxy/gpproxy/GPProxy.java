package com.gupao.edu.proxy.dynamicproxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * JDK动态原理实现原理
 *  1、 拿到被代理类的引用，并且获取他的所有接口（反射获取）
 *  2、JDK Proxy类重新生成一个新的类，实现了杯代理类所有接口的方法
 *  3、动态生成Java代码，吧增强逻辑加入到新生成的方法中
 *  4、编译生成新的Java代码的class文件
 *  5、加载并重新运行新的class，得到的类就是全新的类
 */

public class GPProxy {

    private static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h){
        try{
            //1、动态生成源代码
            String src = generateSrc(interfaces);

            //2、Java文件输出到磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            Class proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            return c.newInstance(h);

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        //用代码写代码
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupao.edu.proxy.dynamicproxy.gpproxy;" + ln);
        sb.append("import com.gupao.edu.proxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

            sb.append("GPInvocationHandler h;" + ln);
            sb.append("public $Proxy0(GPInvocationHandler h) {" + ln);

                sb.append("this.h = h;" + ln);

            sb.append("}");

            for(Method m : interfaces[0].getMethods()){
                sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);
                    sb.append("try{" + ln);
                        sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
                        sb.append("this.h.invoke(this, m, null);" + ln);
                    sb.append("} catch (Throwable throwable){" + ln);
                        sb.append("throwable.printStackTrace();" + ln);
                    sb.append("}" + ln);
                sb.append("}" + ln);
            }

        sb.append("}");
        return sb.toString();
    }
}
