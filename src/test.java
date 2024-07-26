import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args)
    {
        String url = "https://www.virgingames.com";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//label[@for='privacy_pref_optin']")).click();

        String expectedText = "Welcome to Virgin Games";
        String actualText = driver.findElement(By.tagName("h1")).getText();

        System.out.println(actualText);

        Assert.assertEquals(expectedText,actualText);
    }
}
