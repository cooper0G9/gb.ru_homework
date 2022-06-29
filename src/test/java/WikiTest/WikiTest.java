package WikiTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;



public class WikiTest {


    @Test
    public static void main (String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://ru.wikipedia.org");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@type='search']")).click();
        driver.findElement(By.xpath(".//*[@type='search']")).sendKeys("Maven"+ Keys.ENTER);
        driver.findElement(By.xpath(".//*[@title='Apache Maven']")).click();
        Assertions.assertTrue(driver.findElement(By.xpath(".//*[@data-wikidata-property-id='P856']")).isDisplayed(),"Сайт есть");

        Thread.sleep(5000);

        driver.quit();
    }


}
