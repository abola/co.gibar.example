/**
 * 利用JDK7才有的指令測試Matrix
 */
package co.gibar.examples.jenkins.matrix;

import java.util.HashMap;
import java.util.Map;


public class JDK7OnlyScript {

	// JDK7 new feature
	Map<String, Integer> generic = new HashMap<>();
	
	public JDK7OnlyScript(){
		// JDK8 stop API
		Thread.currentThread().stop();
	}
	
}
