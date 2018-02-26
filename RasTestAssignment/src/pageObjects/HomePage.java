package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	private static WebElement element = null;

	
	 public static WebElement btn_Search(WebDriver driver){
		    element = driver.findElement(By.id("navbar-submit-button"));
		    return element;

	}
	 
	 public static WebElement txtbx_search(WebDriver driver){
		 element = driver.findElement(By.id("navbar-query"));
		 return element;

	 }
	 
	 public static WebElement drpdwn_list(WebDriver driver){
		 element = driver.findElement(By.id("quicksearch"));
		 return element;

	 }
	 
	public static WebElement LinkText(WebDriver driver, String linkText) {
		element = driver.findElement(By.linkText(linkText));
		return element;
	}
	
	public static WebElement MenuBar(WebDriver driver, String cssValue) {
		element = driver.findElement(By.cssSelector(cssValue));
		return element;		
	}
	
	public static void VerifyLogin(WebDriver driver, String LoginUser) {
		String pageSource = driver.getPageSource();
		if(pageSource.contains(LoginUser)){
            System.out.println(LoginUser + " is successfully logged in");
        }else{
            System.out.println("User is no longer logged in");;
        }
		
	//	return element;	
		
	}

	 
}
