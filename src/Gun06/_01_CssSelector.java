package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtBox=driver.findElement(By.cssSelector("input[id=user-message]"));
        txtBox.sendKeys("merhaba selenium");

        WebElement btn=driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("span[id='display']"));

  //      if (msg.getText().contains("merhaba selenium"))
  //          System.out.println("test passed");
  //      else{
  //          System.out.println("test failed");

        Assert.assertTrue("Mesaj Bulunamad─▒",msg.getText().contains("merhaba selenium"));

        driverBekleKapat();
        }
    }
