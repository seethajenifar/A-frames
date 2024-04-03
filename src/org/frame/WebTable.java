package org.frame;
import java.util.List;
import javax.swing.text.TableView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable{
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https\\www.w3schools.com/html/html-tables.as/");
List<WebElement>totaltable = driver.findElements(By.tagName("table"));
System.out.println("total table"+totaltable.size());
//all text from table
System.out.println("all text from table");
WebElement table1 = driver.findElement(By.id("customers"));
String text = table1.getText();
System.out.println(text);
//all text from table in row wise
System.out.println("all text from table in row wise");
List<WebElement>tablerow = table1.findElements(By.tagName("tr"));
for(int i=0;i<tablerow.size();i++) {
WebElement w = tablerow.get(i);
String text2 = w.getText();
System.out.println(text2);
}
//only heading from table
System.out.println("only heading from table");
List<WebElement>tablehead = table1.findElements(By.tagName("th"));
for(int i=0;i<tablehead.size();i++) {
WebElement w = tablehead.get(i);
String text2 = w.getText();
System.out.println(text2);
//only heading from table in row wise
System.out.println("only heading from table row wise");
for(int i1=0;i<tablerow.size();i++) {
WebElement head = tablerow.get(i);
List<WebElement> heading=head.findElements(By.tagName("th"));
for(int j=0;j<heading.size();j++) {
WebElement w1 = heading.get(j);
String text3 = w.getText();
System.out.println(text);
//}}}}}
/////////////////////
//only data from table
System.out.println("only heading from table");
List<WebElement>tabledate = tabledate.findElements(By.tagName("td"));
for (int i2=0;i<tabledate.size();i++) {
WebElement w11 = tabledate.get(i);
String Text2 = w.getText();
System.out.println(text2);
}}
//only data from table in row wise
System.out.println("only heading from row wise");
for (int i11=0;i<tablerow.size();i++) {
WebElement data = TableView.get(i);
List<WebElement>datas = data.findElements(By.tagName("td"));
for(int j=0;j<data.size();ij++) {
WebElement w1 = datas.get(j);
String Text2=w.getText();
System.out.println(text2);
}}}
//get particular data
System.out.println("get particular data");
for (int i1=0;i<tablerow.size();i++) {
WebElement data = tablerow.get(i);
List<WebElement>datas = data.findElements(By.tagName("td"));
for(int j =0;j<datas.size();j++) {
WebElement w1 = datas.get(j);
String Text2=w.getText();
if(text2.equals("uk")) {
//text
System.out.println(text2);
//entire row
System.out.println(data.getText());
}}}
//last row
System.out.println("lastrow");
WebElement lastrow = tablerow.get(tablerow.size()-1);
String Text2 = lastrow.getText();
System.out.println(text2);
List<WebElement>row =lastrow.findElements(By.tagName("td"));
for(int ia=0;i<row.size();i++) {
WebElement wa = row.get(i);
String text3 = w.getText();
System.out.println(text3);
}}}}