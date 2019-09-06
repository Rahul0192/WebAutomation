import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Demo {
    public void find() {

        System.setProperty("webdriver.chrome.driver", "/Users/mdrahul/IdeaProjects/WebAutomation/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.id("search_query_top")).sendKeys("T shirt");
        driver.findElement(By.name("submit_search")).click();
     String actualResultult= driver.findElement(By.className("product-count")).getText();
     String exceptResult="Showing 1 - 1 of 1 item";
        Assert.assertEquals(actualResultult,exceptResult);
        driver.close();

    }
}