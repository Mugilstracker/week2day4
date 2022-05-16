package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.linkText("Phone")).click();
    driver.findElement(By.name("phoneNumber")).sendKeys("8098048068");
    driver.findElement(By.xpath("//button[contains(@class,'x-btn-text')and contains(@id,'ext-gen334')]")).click();
    driver.findElement(By.xpath("(//a[text()='Mugil'])[1]")).click();
    driver.findElement(By.className("subMenuButtonDangerous")).click();
    
    driver.close();
    
}
}
