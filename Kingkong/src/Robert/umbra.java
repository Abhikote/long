package Robert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class umbra {
public static void main(String [] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Spider/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/shiv_kb/Desktop/1.html");
	Thread.sleep(2000);
	
	 

}
}
