package Scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import pageObjects.HomePage;
import pageObjects.SignInPage;
import pageObjects.RegisterUser;;


public class Scenario3 {
private static WebDriver driver = null;
	
	
	@BeforeClass
	public void beforeClass() throws Exception {
	System.setProperty(utility.Constant.GECKO_DRIVER, utility.Constant.FIREFOX_PATH);
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(utility.Constant.URL);
	driver.manage().window().maximize();
	
	}
	
	@Test
	  public void testScenario3() throws Exception { 
	// Use page Object library now
		
	HomePage.LinkText(driver, "Other Sign in options").click();
	SignInPage.NewUser(driver).click();
	
	
	RegisterUser.txtbx_name(driver).sendKeys("Scenario3Test");
	RegisterUser.txtbx_email(driver).sendKeys("Scenario3Test@nec.com");
	RegisterUser.txtbx_password(driver).sendKeys("Password1");
	RegisterUser.txtbx_password_chk(driver).sendKeys("Password1");
	
	RegisterUser.btn_CreateAccount(driver).click();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	HomePage.VerifyLogin(driver, "Scenario3Test");
	
	HomePage.MenuBar(driver, "#navUserMenu > span:nth-child(2)").click();
	
	 Thread.sleep(5000);
	 System.out.println("Logging out now .... ");;
	 
	 HomePage.LinkText(driver, "Log Out").click();
	 
	// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 Thread.sleep(10000);
	
	 HomePage.VerifyLogin(driver, "Scenario3Test");
	 
	}
	
	  @AfterClass
	  
	  public void afterClass() 
	  {
	 
	//close Firefox
	
	driver.quit();

	}
}

