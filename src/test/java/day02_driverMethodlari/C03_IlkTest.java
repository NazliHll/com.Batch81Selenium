package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*https://www.amazon.com urline gidin
        basligin Amazon kelimesi icerdigini test edin
        url'in https://www.amazon.com'a esit oldugunu test edin
        sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        String actualTtle=driver.getTitle();
        String arananKelime="Amazon";
        if (actualTtle.contains(arananKelime)){
            System.out.println("Title testi passed");
        }else{
            System.out.println("Title "+arananKelime+"'yi icermiyo,title testi failed");
        }
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi passed");
        }else{
            System.out.println("actual url "+actualUrl+" beklenen Urlden farkli,test failed");
        }

        driver.close();
    }
}
