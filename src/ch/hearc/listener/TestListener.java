package ch.hearc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        System.out.println("Listener instanci�");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Listener d�truit");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("Listener initialis�");
    }
	
}
