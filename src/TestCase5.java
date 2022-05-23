import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

            WebElement checkBoxText = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/p"));
            WebElement checkBoxInput = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/input"));
            WebElement checkBoxDiv = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/div"));


        System.out.println(checkBoxText.getText().equals("Sign up for our email list for updates, promotions, and more.") );


        System.out.println(checkBoxInput.isSelected() ? "PASSED" : "FAILED");


            checkBoxDiv.click();
            Thread.sleep(1000);
        System.out.println(checkBoxInput.isSelected() ? "PASSED" : "FAILED");


            checkBoxDiv.click();
            Thread.sleep(1000);
        System.out.println(checkBoxInput.isSelected() ? "PASSED" : "FAILED");
        Driver.quitDriver();
        }

    }

