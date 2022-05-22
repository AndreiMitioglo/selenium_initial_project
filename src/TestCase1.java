import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {

    public static void main(String[] args)  {


        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

        WebElement logo= driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        System.out.println(logo.isDisplayed()?"PASSED":"FAILED");

        WebElement heading=driver.findElement(By.xpath("//h2[@data-aid='HEADER_TAGLINE_RENDERED']"));
        System.out.println(heading.isDisplayed() && heading.getText().equals("High quality comfy pillows and accessories for travel, office and home.")?"PASSED":"FAILED");
        System.out.println(heading.getText());

        Driver.quitDriver();
    }
}
