package Scenarios;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.HomePage;
import org.openqa.selenium.support.ui.Select;


public class Scenario1 {
	private static WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty(utility.Constant.GECKO_DRIVER, utility.Constant.FIREFOX_PATH);
		//utility.Utils.SetUpFireFox();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(utility.Constant.URL);
		driver.manage().window().maximize();
		
	}
	@Test
	  public void testScenario1() {	
		// Use page Object library now
			
		HomePage.txtbx_search(driver).sendKeys("Walking Dead");
		
		Select drpValue = new Select(HomePage.drpdwn_list(driver));
		drpValue.selectByVisibleText("TV Episodes");

		HomePage.btn_Search(driver).click();
		
		String pageSource = driver.getPageSource();
		if(pageSource.contains(utility.Constant.TVEPISODE)){
            System.out.println(utility.Constant.TVEPISODE + " is listed. Verified");
        }else{
            System.out.println(utility.Constant.TVEPISODE + " does not exists on list");;
        }
	}
	
	  @AfterClass
	  
	  public void afterClass() 
	  {

		//close Firefox
		driver.quit();
		}
}	


