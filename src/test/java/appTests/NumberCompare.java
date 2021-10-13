package appTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberCompare {
  @Test
  public void intComparison() 
  {
	  Assert.assertTrue(5>4);
  }
}
