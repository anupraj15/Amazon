package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	
public static void main(String args[])
{
	
	System.setProperty("webdriver.chrome.driver","D:\\Anup\\Automation testing\\software\\chromedriver_win321\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	text.sendKeys("Realme Mobile");
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     System.out.println("New file send 11");
     System.out.println("New file send 22");
}
}
