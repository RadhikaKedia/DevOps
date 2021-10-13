package appTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest 
{
  @Test(description = "Login with valid credentials")
  public void loginTest() throws Exception 
  {
	  App ap = new App();
	  
	  boolean status = ap.userLogin("userdemo","pass");    //It should match with the value written in file
	  
	  Assert.assertTrue(status);
  }
  
  @Test(description = "Login with invalid credentials")
  public void invalidLoginTest() throws Exception 
  {
	  App ap = new App();
	  
	  boolean status = ap.userLogin("userdemo","password467");
	  
	  Assert.assertFalse(status);    //Checking status is false or not
  }
  
}
