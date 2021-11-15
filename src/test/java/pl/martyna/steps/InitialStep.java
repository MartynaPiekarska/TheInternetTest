package pl.martyna.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.martyna.InitialMethods;
import pl.martyna.BasicMethods;

public class InitialStep {

    InitialMethods initial = new InitialMethods();
    BasicMethods basic = new BasicMethods();

    @Given("I go to page TheInternet on Heroku")
    public void goToPageTheInternetOnHeroku() {
        initial.goToTheInternet();
    }


//    ______________ Basic methods ______________

    @When("I select exercise {string}")
    public void selectExercise(String exercise) {
        initial.selectPage(exercise);
    }

    @And("I click button {string}")
    public void clickButton(String button) {
        basic.clickButton(button);
    }

    @Then("I check if added button is visible")
    public void checkIfAddedButtonIsVisible() {
        basic.checkIfAddedButtonIsVisible();
    }

    @And("I check if number of buttons equals {int}")
    public void checkIfNumberOfButtonsEquals(int number) {
        basic.checkNumberOfButtons(number);
    }
}
