package co.gibar.examples.jenkins.matrix;

import org.junit.Assert;
import org.junit.Test;

public class JDK7OnlyScriptText {

  @Test public void testInstanceJDK7Script(){
    Assert.asssertNotNull("new JDK7OnlyScript() 不應為null", new JDK7OnlyScript() );
  }
  
}
