package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {

        /*
        1- amazon.com a gidip arama kutusunu locate edin
        2- arama kutusunun tagname inin input olduğunu test edin
        3- arama kutusunun name attribute'nun değerinin field-keywords olduğunu test edin
         */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("tagname testi passed");
        }else{
            System.out.println("tagname testi failed");
        }

        String expectedNameDegeri="field-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attribute testi passed");
        }else {
            System.out.println("name attribute testi failed");

        }

        System.out.println(aramaKutusu.getLocation());
        System.out.println(aramaKutusu.getSize().height);

        driver.close();
        /*
    <input type="text" id="twotabsearchtextbox" value=""
    name="field-keywords" autocomplete="off" placeholder="Search Amazon"
    class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon" spellcheck="false">
    webElementIsmi.getTagName()-->daha önce locate ettiğimiz bir webelemetin tagname'ini döndürür
    webElementIsmi.getAttribute(attributeIsmi)--> daha önce locate ettiğimiz  bir webelemetin istediğim attribute değerini döndürür.
    */
    }
}
