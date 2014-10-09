/**
 * 利用JDK7才有的指令測試Matrix
 */
package co.gibar.examples.jenkins.matrix;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import java.util.Map;


public class JDK7OnlyScript {

	// JDK7 new feature
	Map<String, Integer> generic = new HashMap<>();
	
	public JDK7OnlyScript(){
		// http://bugs.java.com/bugdatabase/view_bug.do?bug_id=8021591
		CopyOnWriteArrayList cp = new CopyOnWriteArrayList();
		cp.removeAll(  null );
	}
}
