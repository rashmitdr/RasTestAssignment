package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUser {
	private static WebElement element = null;
	
	 public static WebElement txtbx_name(WebDriver driver){
		 element = driver.findElement(By.id("ap_customer_name"));
		 return element;

	 }
	 
	 public static WebElement txtbx_email(WebDriver driver){
		 element = driver.findElement(By.id("ap_email"));
		 return element;

	 }
	 
	 public static WebElement txtbx_password(WebDriver driver){
		 element = driver.findElement(By.id("ap_password"));
		 return element;

	 }
	 
	 public static WebElement txtbx_password_chk(WebDriver driver){
		 element = driver.findElement(By.id("ap_password_check"));
		 return element;

	 }
	
	 public static WebElement btn_CreateAccount(WebDriver driver){
		    element = driver.findElement(By.id("continue"));
		    return element;

	}

}
