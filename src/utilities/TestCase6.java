package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

        WebElement sendButton = driver.findElement(By.xpath("//button[@tccltracking='click']"));
        System.out.println(sendButton.isDisplayed() ? "PASSED":"FAILED");


        sendButton.click();
        Thread.sleep(3000);
        System.out.println(sendButton.isSelected() ? "PASSED" : "FAILED");

        System.out.println(sendButton.getText().equals("SEND"));
        System.out.println(sendButton.getText());
        Driver.quitDriver();
    }
}
