package Scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import pageObjects.tvMeter;



public class Scenario2 {
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
	  public void testScenario2()  throws Exception {	
		// Use page Object library now
		HomePage.MenuBar(driver, "#navTitleMenu > span").click();
	      
	      Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	      
		HomePage.LinkText(driver, "Most Popular TV Shows").click();
	      
		tvMeter.LinkText(driver, "The Walking Dead").click();  
		
		String pageSource = driver.getPageSource();
		if(pageSource.contains(utility.Constant.CREATOR)){
            System.out.println("Creator: " + utility.Constant.CREATOR + ". Verified");
        }else{
            System.out.println(utility.Constant.CREATOR + " is not creator");;
        }
	}
	
	  @AfterClass
	  
	  public void afterClass() 
	  {

		//close Firefox
		driver.quit();

		
	}
	

}
