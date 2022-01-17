package Robert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class troll {
public static void main( String [] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Spider/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/shiv_kb/Desktop/3.html");
	 driver.findElement(By.cssSelector("input[name='s2']")).sendKeys("world");
}
}