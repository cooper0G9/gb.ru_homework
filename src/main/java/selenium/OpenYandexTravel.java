package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYandexTravel {
    public static void main (String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://travel.yandex.ru/?utm_source=main_stripe_big");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@type='text' and @class='w_eHd input_center']")).click();
        driver.findElement(By.xpath(".//*[@type='text' and @class='w_eHd input_center']")).sendKeys("Сочи Парк Отель");
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@class='GxV0a' and text()='Сочи Парк Отель']")).click();
        driver.findElement(By.xpath(".//*[@class='nAZcZ SGaYr' and text()='Заезд']")).click();
        driver.findElement(By.xpath(".//*[@class='k1xu8' and text()='Ноябрь']")).click();
        Thread.sleep(300);
        driver.findElement(By.xpath(".//html/body/div[5]/div/div/div[2]/div[1]/div[2]/div[6]/div/div[3]/div[3]")).click();
        Thread.sleep(300);
        driver.findElement(By.xpath(".//div[6]/div/div[5]/div[3]")).click();
        Thread.sleep(300);
        driver.findElement(By.xpath(".//*[@type='submit']")).click();


        Thread.sleep(15000);

        driver.quit();
    }


}
