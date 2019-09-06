import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HndM {
    public void HndMtest() {

        System.setProperty("webdriver.chrome.driver","/Users/mdrahul/IdeaProjects/WebAutomation/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www2.hm.com/en_us/index.html");
        driver.findElement(By.id("main-search")).sendKeys("pant");
        driver.findElement(By.className("menu__search_submit")).click();
        String actual=driver.findElement(By.className("new-product")).getText();
        String except="New Arrival";
    Assert.assertEquals(actual,except);
    driver.close();

    }
}
