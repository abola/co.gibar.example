/**
 * 利用JDK7才有的指令測試Matrix
 */
package co.gibar.examples.jenkins.matrix;


public class JDK7OnlyScript {

	// underscores
	int jennyPhone = 8_675_309;
	
	public Boolean isJennyPhone(int phoneNumber){
		return jennyPhone == phoneNumber;
	}
	
}
