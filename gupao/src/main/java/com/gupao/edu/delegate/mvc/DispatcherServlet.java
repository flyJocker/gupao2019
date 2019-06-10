package com.gupao.edu.delegate.mvc;

import com.gupao.edu.delegate.mvc.controllers.MemberController;
import com.gupao.edu.delegate.mvc.controllers.OrderController;
import com.gupao.edu.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


//简单模仿spring中委派模式
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> memberControllerClass = MemberController.class;
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

        // 当有非常多的链接时，if...else...就不适用了
//    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String uri = req.getRequestURI();
//        String mid = req.getParameter("mid");
//
//        if("getMemberById".equals(uri)){
//            new MemberController().getMemberById(mid);
//        }else if("getOrderById".equals(uri)){
//            new OrderController().getOrderById(mid);
//        }else if("logout".equals(uri)){
//            new SystemController().logout();
//        }else {
//            resp.getWriter().write("404 Not Found!!!");
//        }
//
//    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        String uri = req.getRequestURI();
        Handler handler = null;
        for(Handler h : handlerMapping){
            if(uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        try {
            Object obj = handler.getMethod().invoke(handler.getController(), req.getParameter("mid"));
            resp.getWriter().write(obj.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
