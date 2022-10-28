package Proje03;

import Utility.BaseDriver;
import Utility.MyFunc;
import javafx.scene.control.Menu;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Test1 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");

        WebElement hesapAc=driver.findElement(By.linkText("Hesap Aç"));
        hesapAc.click();

        MyFunc.Bekle(1);
        WebElement ad= driver.findElement(By.id("rnufn"));
        ad.sendKeys("Ali");

        MyFunc.Bekle(1);
        WebElement soyad=driver.findElement(By.id("rnufs"));
        soyad.sendKeys("Kacan");

        MyFunc.Bekle(1);
        WebElement fEmail=driver.findElement(By.id("rnufe1"));
        fEmail.sendKeys("abcrock@gmail.com");

        MyFunc.Bekle(1);
        WebElement rEmail=driver.findElement(By.id("rnufe2"));
        rEmail.sendKeys("abcrock@gmail.com");

        MyFunc.Bekle(1);
        WebElement passWord=driver.findElement(By.id("rnufp1"));
        passWord.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement repassword=driver.findElement(By.id("rnufp2"));
        repassword.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement cinsiyet=driver.findElement(By.xpath("//label[text()='Ad *']//following::input[8]"));
        cinsiyet.click();

        MyFunc.Bekle(1);
        WebElement menu=driver.findElement(By.xpath("//span/select[@id='locpr']"));
        Select ilMenu=new Select(menu);
        ilMenu.selectByValue("35");

        WebElement menu2 =driver.findElement(By.xpath("//span/select[@id='locds']"));
        Select ilceMenu=new Select(menu2);
        ilceMenu.selectByValue("466");

        MyFunc.Bekle(1);
        WebElement menu3= driver.findElement(By.xpath("//select[@id='bd']"));
        Select dGun=new Select(menu3);
        dGun.selectByValue("10");

        MyFunc.Bekle(1);
        WebElement menu4=driver.findElement(By.id("bm"));
        Select mAy=new Select(menu4);
        mAy.selectByValue("6");

        MyFunc.Bekle(1);
        WebElement menu5=driver.findElement(By.id("by"));
        Select yil=new Select(menu5);
        yil.selectByValue("1995");

        MyFunc.Bekle(1);
        WebElement check1=driver.findElement(By.id("rnufpca"));
        check1.click();

        MyFunc.Bekle(1);
        WebElement check2=driver.findElement(By.id("rnufnee"));
        check2.click();

        MyFunc.Bekle(1);
        WebElement submit=driver.findElement(By.id("rfb"));
        submit.click();

    }
@Test
    public void Test2(){
       girisYap();

       MyFunc.Bekle(1);
        WebElement confirmLogin=driver.findElement(By.linkText("Ali"));
        Assert.assertTrue("Giris Basarısız",confirmLogin.getText().contains("Ali"));

        MyFunc.Bekle(1);
         WebElement account=driver.findElement(By.linkText("Ali"));
         account.click();

         MyFunc.Bekle(1);
         WebElement siparislerim = driver.findElement(By.xpath("//li[@class='order first']/a[1]"));
        siparislerim.click();

        MyFunc.Bekle(1);
        WebElement kayitliSiparis=driver.findElement(By.cssSelector("div[class='no-record'"));
        Assert.assertTrue("Sipariş Hata",kayitliSiparis.getText().contains("Kayıtlı siparişiniz bulunmuyor."));

        MyFunc.Bekle(1);
        account=driver.findElement(By.linkText("Ali"));
        account.click();

        MyFunc.Bekle(1);
        WebElement mesaj=driver.findElement(By.xpath("//li[@class='order first']/a[2]"));
        mesaj.click();

        MyFunc.Bekle(1);
        WebElement mesajKontrol = driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue("Mesaj Hata",mesajKontrol.getText().contains("bulunamadı"));

        MyFunc.Bekle(1);
        WebElement anaSayfa=driver.findElement(By.xpath("//*[text()='Akakce.com']"));
        anaSayfa.click();




    }
    @Test
   public void Test3(){
        girisYap();

        MyFunc.Bekle(1);
        WebElement account=driver.findElement(By.linkText("Ali"));
        account.click();

        MyFunc.Bekle(1);
        WebElement hesabıSil=driver.findElement(By.xpath("//*[text()='Hesabımı Sil']"));
        hesabıSil.click();

        MyFunc.Bekle(1);
        WebElement sifreSil=driver.findElement(By.id("p"));
        sifreSil.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement silButton=driver.findElement(By.id("u"));
        silButton.click();



    }


    public void girisYap(){
       driver.navigate().to("https://www.akakce.com/");

       WebElement girisYap=driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();

        MyFunc.Bekle(1);
        WebElement loginEmail= driver.findElement(By.id("life"));
        loginEmail.sendKeys("abcrock@gmail.com");

        MyFunc.Bekle(1);
        WebElement loginPass=driver.findElement(By.id("lifp"));
        loginPass.sendKeys("@Ab123456");

        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.id("lfb"));
        login.click();

    }
}
