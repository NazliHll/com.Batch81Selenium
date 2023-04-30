package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
      /*
        1- "https://the-internet.herokuapp.com/add_remove_elements/" adresine gidin
        2- Add Element butonuna basın.
        3- Delete butonunun görünür olduğunu test edin
        4- Delete tuşuna basın
        5- "Add/Remove Elements yazısının görünür olduğunu test edin
         */
      public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
          driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

          WebElement deleteButonu=driver.findElement(By.xpath("//button[@ class='added-manually']"));
          if (deleteButonu.isDisplayed()){
              System.out.println("delete butonu testi PASSED");
          }else{
              System.out.println("delete butonu testi FAILED");
          }
          deleteButonu.click();

          WebElement addRemoveElement= driver.findElement(By.xpath("//h3"));
          if (addRemoveElement.isDisplayed()){
              System.out.println("add remove butonu testi PASSED");
          }else{
              System.out.println("add remove butonu testi FAILED");
          }
          driver.close();


      }
}
