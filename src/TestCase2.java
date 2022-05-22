import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

        WebElement logo= driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        System.out.println(logo.isDisplayed()?"PASSED":"FAILED");

        WebElement heading=driver.findElement(By.xpath("//h2[@data-ux='SectionHeading']"));
        System.out.println(heading.isDisplayed() && heading.getText().equals("Contact Us")?"PASSED":"FAILED");


        WebElement instaIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
        System.out.println(instaIcon.getAttribute("href"));
        System.out.println(instaIcon.isDisplayed()&& instaIcon.getAttribute("href").
                        equals("https://www.instagram.com/comfyelite")?  "PASSED" : "FAILED");

        WebElement facebookIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        System.out.println(facebookIcon.getAttribute("href"));
        System.out.println(facebookIcon.isDisplayed()&& facebookIcon.getAttribute("href").
                equals("https://www.facebook.com/103179127717601")?  "PASSED" : "FAILED");
        Driver.quitDriver();
    }
    }

