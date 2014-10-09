package co.gibar.examples.jenkins.matrix;

import org.junit.Assert;
import org.junit.Test;

public class JDK7OnlyScriptTest {

  @Test public void testInstanceJDK7Script(){
    try{
      new JDK7OnlyScript();
    } catch(Exception e){
      Assert.fail("new JDK7OnlyScript() FAILED. CauseBy:" + e.getMessage() );
    }
    
  }
  
}
