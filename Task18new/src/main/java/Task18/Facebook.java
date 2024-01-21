package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
public static void main(String[] args) throws InterruptedException
{
	
	ChromeDriver driver;
	driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();	
       //driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("aishukaif43@gmail.com");
     //  driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Abcd@333");
       driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
       Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("shailu");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("R");
driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("aishukaif43@gmail.com");
driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("aishukaif43@gmail.com");
driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Abcd@333");
WebElement drop=driver.findElement(By.xpath("//select[@id=\"day\"]"));
Select select1= new Select(drop);
select1.selectByVisibleText("20");
WebElement drop1=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
Select select2= new Select(drop1);
select2.selectByVisibleText("Jun");
WebElement drop2= driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
Select select3 = new Select(drop2);
select3.selectByVisibleText("1997");

 driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();
 driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
}
}
