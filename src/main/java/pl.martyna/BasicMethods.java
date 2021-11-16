package pl.martyna;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static pl.martyna.InitialMethods.driver;

public class BasicMethods {

    InitialMethods initialMethods = new InitialMethods();

    public void clickButton(String button) {
        driver.findElement(By.xpath("//button[text()='" + button + "']")).click();
    }

    public void checkIfAddedButtonIsVisible() {
        Assertions.assertTrue(driver.findElement(By.cssSelector("div button.added-manually")).isDisplayed());
    }

    public void checkNumberOfButtons(int number) {
        List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
        Assertions.assertEquals(number, buttons.size(), "List of buttons contains more elements than expected");
    }

    public void checkIfWelcomeMessageIsDisplayed(String message) {
        WebElement welcomeMessage = driver.findElement(By.xpath("//p[contains(text(), '" + message + "')]"));
        Assertions.assertTrue(welcomeMessage.isDisplayed(), "Welcome message does not appear");
    }

    public void selectCheckbox(int checkbox) {
        driver.findElement(By.cssSelector("input:nth-of-type(" + checkbox + ")")).click();
    }

    public void checkIfCheckboxIsSelected(int checkbox) {
        boolean isCheckboxSelected = driver.findElement(By.cssSelector("input:nth-of-type(" + checkbox + ")")).isSelected();
        Assertions.assertTrue(isCheckboxSelected, "Checkbox is not selected");
    }

    public void checkIfCheckboxIsNotSelected(int checkbox) {
        boolean isCheckboxSelected = driver.findElement(By.cssSelector("input:nth-of-type(" + checkbox + ")")).isSelected();
        Assertions.assertFalse(isCheckboxSelected, "Checkbox is selected");
    }

}
