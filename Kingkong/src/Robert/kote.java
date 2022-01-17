package Robert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kote {
public static void main(String [] args) throws InterruptedException
{
String key ="webdriver.chrome.driver";
String value ="./Files/chromedriver.exe";
System.setProperty(key, value);
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
String title = driver.getTitle();
System.out.println(title);
/*String url= driver.getCurrentUrl();
System.out.println(url);*/
/*String src = driver.getPageSource();
System.out.println(src);*/
}
}
