package day01_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*En ilkel haliyle bir otomasyon yapmak için
        classimiza otomasyon için gerekli olan webdriverin yerini göstermemiz gerekir
        bunun için java kütüphanesinden System.Property() methodu kullaniriz.
        ilki kullanacagimiz driver:webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu: */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.twitter.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");

        driver.quit();
    }


}
