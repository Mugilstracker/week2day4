package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://leaftaps.com/opentaps/control/logout");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mugil");
    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("stracker");
    driver.findElement(By.xpath("//button[contains(@class,'x-btn-text')and contains(@id,'ext-gen334')]")).click();
    driver.findElement(By.xpath("//a[text()='Mugil']")).click();
    driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
    driver.findElement(By.className("inputBox")).clear();
    driver.findElement(By.className("inputBox")).sendKeys("Testingcircle");
    driver.findElement(By.className("smallSubmit")).click();
    driver.close();
	
	
}

}
