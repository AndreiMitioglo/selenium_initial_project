import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

        WebElement logo= driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        System.out.println(logo.isDisplayed()?"PASSED":"FAILED");

        WebElement heading2=driver.findElement(By.xpath("//h2[@data-ux='SectionHeading']"));
        System.out.println(heading2.isDisplayed() && heading2.getText().equals("Contact Us")?"PASSED":"FAILED");

        WebElement heading4=driver.findElement(By.xpath("//h4[@data-ux='HeadingMinor']"));
        System.out.println(heading4.getText());
        System.out.println(heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE")?"PASSED":"FAILED");

        Driver.quitDriver();
    }
}
