package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp{
public static void main (String [] agrs) {
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedrivers.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");


    }
}}