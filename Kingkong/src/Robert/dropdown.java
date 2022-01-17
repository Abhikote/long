package Robert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Files/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/shiv_kb/Desktop/abhishek/dropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='nalapak']"));
		Select s= new Select(ele);
		ArrayList <String> list = new ArrayList<String>();
		
		List<WebElement> opt = s.getOptions();
		
		for(WebElement text : opt);
		{
			String al = ele.getText();
			list.add(al);
			
		}
		if(list.contains("ice cream"))
		{
			System.out.println("s");
		}
		else
		{ 
			System.out.println("no");
		}
		
		}
		
		
	} 


