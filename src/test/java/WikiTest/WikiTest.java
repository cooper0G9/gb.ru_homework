package WikiTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;



public class WikiTest {
    WebDriver driver;


    void TargetSait() {
        driver.get("https://ru.wikipedia.org");
    }

    WebElement getSearchField() {
        return driver.findElement(By.xpath(".//*[@type='search']"));
    }

    WebElement getTargetOfSearch() {
        return driver.findElement(By.xpath(".//*[@title='Apache Maven']"));
    }

    WebElement getFinalElement() {
        return driver.findElement(By.xpath(".//*[@data-wikidata-property-id='P856']"));
    }


    @BeforeAll
    static void LocateDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeEach
    void InitDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void main() throws InterruptedException {


        TargetSait();
        getSearchField().click();
        getSearchField().sendKeys("Maven" + Keys.ENTER);
        getTargetOfSearch().click();


        Assertions.assertTrue(getFinalElement().isDisplayed(), "Сайт есть");

        Thread.sleep(5000);

        driver.quit();
    }

    @AfterEach
    void killDriver() {
        driver.quit();
    }
}

