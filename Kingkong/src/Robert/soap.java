package Robert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class soap {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver" , "./Spider/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/shiv_kb/Desktop/king.html");
			driver.findElement(By.partialLinkText("ggle")).click();
			Thread.sleep(2000);
			
}
}