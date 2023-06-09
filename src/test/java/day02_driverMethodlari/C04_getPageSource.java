package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        //amazon sitesine gidip Kaynak Kodlarında "Gateway" yazdığını test edin.
        //site kaynak kodu manuel : ctrl+u
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari=driver.getPageSource();
        String arananKelime="Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak kodu testi passed");
        }else {
            System.out.println("Kaynak kodu testi failed");
        }
        driver.close();

    }
}
