package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    /*
        1-Main method oluşturun ve aşağıdaki görevi tamamlayın
        a. https://amazon.com sayfasına gidin.
        b. Search "city bike"
        c. Amazonda görüntülenen ilgili sonuçların görüntülerini yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElement=istenenElementListesi.get(0);
        System.out.println(sonucYazisiElement.getText());

        List<WebElement>urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleriList.get(0);
        ilkUrunResmi.click();

    }
}
