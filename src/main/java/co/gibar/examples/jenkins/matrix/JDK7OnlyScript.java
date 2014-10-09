/**
 * 利用JDK7才有的指令測試Matrix
 */
package co.gibar.examples.jenkins.matrix;

import java.util.HashMap;
import java.util.Map;


public class JDK7OnlyScript extends Thread {

	// JDK7 new feature
	Map<String, Integer> generic = new HashMap<>();
	
	public JDK7OnlyScript(){
	    Thread jdk8stop = new JDK7OnlyScript("JDK8 stop test");
	    jdk8stop.start();
	    try {
	    	jdk8stop.join();
	    } catch (InterruptedException e) {}	
	}
	
	public JDK7OnlyScript(String name){
	    super(name);
	}
	
	public void run() {
	    System.out.println(getName());
            try {
		sleep((int)(2 * 1000));
		// JDK8 stop API
		Thread.currentThread().stop( new Exception() );
	    } catch (InterruptedException e) {}	
	}
	
}
