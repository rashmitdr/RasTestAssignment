package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignInPage {
	private static WebElement element = null;
	
	
	 public static WebElement NewUser(WebDriver driver){
		    element = driver.findElement(By.linkText("Create a New Account"));
		    return element;

	}

}
