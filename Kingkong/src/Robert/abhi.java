package Robert;

import org.openqa.selenium.chrome.ChromeDriver;

public class abhi {
	public static void main(String[] args)throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String value = "./Spider/chromedriver.exe";
		System.setProperty(key,value);
ChromeDriver driver= new ChromeDriver();
/*Thread.sleep(2000);
driver.close();
driver.quit();*/
}
	

}
