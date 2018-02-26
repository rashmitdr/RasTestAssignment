package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tvMeter {
	private static WebElement element = null;
	
	public static WebElement LinkText(WebDriver driver, String linkText) {
		element = driver.findElement(By.linkText(linkText));
		return element;
	}

}
