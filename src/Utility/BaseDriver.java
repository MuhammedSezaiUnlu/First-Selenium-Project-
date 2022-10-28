package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

 public static WebDriver driver;
 static {
     // ilk adımda çalışan kod kısmı
     Logger logger=Logger.getLogger("");
             logger.setLevel(Level.SEVERE);
     System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, String.valueOf(true));



     System.setProperty("webdriver.chrome.driver", "Drivers/chromedrivers.exe");
      driver = new ChromeDriver();



      driver.manage().deleteAllCookies();//sitenin senin bilgisayarında yaptığı attığı çerezleri siliyor

     Duration dr=Duration.ofSeconds(30);
      driver.manage().timeouts().pageLoadTimeout(dr);//Sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili
     //Bu eklenmezse Selenium sayfayı yükleyene kadar(sonsuza)bekler.:30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
     //eger 2 sn de yüklerse 30 saniye beklemez.

     driver.manage().timeouts().implicitlyWait(dr);//Bütün webelementlerin  element bazında elemente özel işlem yapılmadan önce
     //hazır hale gelmesi verilen mühlet yani süre.
 }
public static void driverBekleKapat()
{
    MyFunc.Bekle(10);
    driver.quit();
}

}
