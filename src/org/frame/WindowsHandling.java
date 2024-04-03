package org.frame;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsHandling {
public static void main(String[] args)throws IOException, InterruptedException {
WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("htts:\\www.flipkart.com/");
	WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2kPZ61_2dOB4Z']"));
	btnclose.click();
	WebElement txtsearch = driver.findElement(By.name("q"));
	txtsearch.sendKeys("iphone",Keys.ENTER);;
	WebElement iphone = driver.findElement(By.xpath("//div[@class='_4rR01T'])[1]"));
	iphone.click();
//switch to 2nd window	
	//get current window id
	String parentid = driver.getWindowHandle(); //10
	System.out.println(parentid);
//get all window id
	Set<String> allid = driver.getWindowHandles(); //10,20
	System.out.println(allid);
// way 1
	for(String eachid:allid) {
	if (parentid.equals(eachid)) {
	driver.switchTo().window(eachid);
	}}
	int count = 1;
	for(String eachid: allid) {
	if(count == 2) {
	driver.switchTo().window(eachid);
	}
	count++;
	}
	WebElement addcart = driver.findElement(By.xpath("//button[text()='Add tocart']"));	
	addcart.click();
	WebElement help = driver.findElement(By.xpath("//a[text()'=helpcenter']"));
	help.click();
//switch to 3rd window	
	Set<String>allid2 = driver.getWindowHandles(); 
	List<String> li = new ArrayList<>();
	li.addAll(allid2);
	driver.switchTo().window(li.get(2));
	WebElement view = driver.findElement(By.xpath("//span[text()='view more']"));	
	view.click();
	Thread.sleep(5000);
//switch to 1st window	
	driver.switchTo().window(li.get(0));
	Thread.sleep(5000);
	driver.close();  // close particular window
//	Thread.sleep(5000);
//	driver.quit();  //  close all windows / browser
}}
