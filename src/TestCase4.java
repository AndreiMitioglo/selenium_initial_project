import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

        List<WebElement> inputInfoBoxes = driver.findElements(By.xpath("//div[@data-ux='InputFloatLabel']/input"));
        List<WebElement> inputInfoLabels = driver.findElements(By.xpath("//div[@data-ux='InputFloatLabel']/label"));

        WebElement messageInfoBox = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));

        String[] userInfo = {"John", "Doe", "johndoe@gmail.com", "My message"};
        String[] expectedLabels = {"First Name*", "Last Name*", "Email*", "Message*"};

        for(int i = 0; i < inputInfoBoxes.size(); i++){
            // First two validation
            System.out.println("Is displayed and enabled " + (inputInfoBoxes.get(i).isDisplayed() && inputInfoBoxes.get(i).isEnabled() ? "PASSED" : "FAILED"));
            // Third validation
            inputInfoBoxes.get(i).sendKeys(userInfo[i]);
            System.out.println("Input keys match " +( (inputInfoBoxes.get(i).getAttribute("value").equals(userInfo[i]))? "PASSED" : "FAILED"));
            //Forth validation
            System.out.println(inputInfoLabels.get(i).getText().equals(expectedLabels[i])? "PASSED" : "FAILED");


            System.out.println(messageInfoBox.isDisplayed() && messageInfoBox.isEnabled() ?  "PASSED" : "FAILED");

            messageInfoBox.sendKeys(userInfo[3]);
            System.out.println((messageInfoBox.getText().equals(userInfo[3]) ?  "PASSED" : "FAILED"));

            System.out.println((messageInfoBox.getAttribute("placeholder").equals( expectedLabels[3])) ?  "PASSED" : "FAILED");
        }
        Driver.quitDriver();
    }
}
