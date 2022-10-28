package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);
        WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl());// o anda bulunduğu URL yi veriyor

        MyFunc.Bekle(3);
        driver.navigate().back();

        MyFunc.Bekle(3);
        driver.navigate().forward();

        System.out.println(driver.getCurrentUrl());

        driverBekleKapat();
    }
}
