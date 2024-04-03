package org.frame;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Frames {
public static void main (String[]args)throws InterruptedException{
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
driver.get("htts://chercher.tech/practices/frames-example-selenium-webdriver");
////total frame

//List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
//System.out.println("total frame.."+totalframe.size());

////switch to frame1 using webelement ref

//WebElement frame1=driver.findElement(By.id("frame1"));
//driver.switchTo().frame(frame1);
//WebElement topic = driver.findElement(By.xpath("//b[@id='topic']//following::input"));
//topic.sendKeys("sera");

////come out from frame1

//driver.switchTo().defaultContent();

////switch frame2 using id or name

//driver.switchTo().frame("frame2");
//WebElement drop = driver.findElement(By.id("animals"));
//Select s = new Select(drop);
//s.selectByIndex(2);

////come out from frame2

//driver.switchTo().defaultContent();

////switch to frame1 using index

//driver.switchTo().frame(0);

////switch to frame3 using index

//driver.switchTo().frame(0);
//WebElement check = driver.findElement(By.id("a"));
//check.click();

////back to parent frame

//driver.switchTo().parentFrame();
//topic.clear();
//topic.sendKeys("sera");

}}
