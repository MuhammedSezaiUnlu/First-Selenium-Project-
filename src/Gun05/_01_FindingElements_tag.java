package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedrivers.exe");
        WebDriver driver = new ChromeDriver();  // web sayfasını kontrol eden görevli
        driver.get("https://www.hepsiburada.com/"); //Web sayfasını aç

        List<WebElement> linkler = driver.findElements(By.tagName("a")); //kırık link yani ekranda gözüken kısmı yok

        for (WebElement e : linkler) {
            if (e.getText().equals("")) {
                System.out.println("link.getAttriute(href)= " + e.getAttribute("href"));
                System.out.println("link.getAttribute(title)= " + e.getAttribute("title"));
                System.out.println("link.getAttribute(rel)= " + e.getAttribute("rel"));
            }
        }

MyFunc.Bekle(10);
        driver.quit();
    }
}

