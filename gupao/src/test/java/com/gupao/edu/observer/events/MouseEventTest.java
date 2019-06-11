package com.gupao.edu.observer.events;

import com.gupao.edu.observer.events.mouseevent.Mouse;
import com.gupao.edu.observer.events.mouseevent.MouseEventCallback;
import com.gupao.edu.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {

    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK, callback);

        mouse.click();

    }

}
