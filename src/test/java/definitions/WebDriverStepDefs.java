package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class WebDriverStepDefs {
    @Given("I go to {string} and print details")
    public void iGoToAndPrintDetails(String page) {
       // getDriver().get("https://www.google.com/");
        if(page.equals("google")) {
            getDriver().get("https://www.google.com");
        }
        else if (page.equals("sample")) {
            getDriver().get("http://skryabin.com/webdriver/html/sample.html");
        }
        else {
            System.out.println("Unknown page");
        }
        System.out.println("The title of the page is "+getDriver().getTitle());
        System.out.println("The current URL is "+getDriver().getCurrentUrl());
        }

    @And("I go back and forward, then refresh")
    public void iGoBackAndForwardThenRefresh() {
        getDriver().navigate().back();
        getDriver().navigate().forward();
        getDriver().navigate().refresh();
        getDriver().navigate().to("https://selenium.dev/downloads/");
        System.out.println(getDriver().getTitle());
    }

    @Given("I go to {string}")
    public void iGoTo(String arg0) {
        getDriver().get("http://skryabin.com/webdriver/html/sample.html");
        System.out.println();
        System.out.println(getDriver().getTitle());
    }

    @When("I fill out first name {string} and last name {string}")
    public void iFillOutFirstNameAndLastName(String firstName, String lastName) {
        getDriver().findElement(By.xpath("//input[@id='name']")) .click();
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
        getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
        getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();



    }

    @And("I fill out all required fields")
    public void iFillOutAllRequiredFields() {
        WebElement userName=getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("po");
        WebElement email=getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("po@abc.com");
        WebElement Password=getDriver().findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("12345");
        WebElement ConfirmPassword=getDriver().findElement(By.xpath("//input[@id='confirmPassword']"));
        ConfirmPassword.sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Privacy Policy.')]")).click();
        getDriver().findElement(By.xpath("//button[@id='formSubmit']")).submit();

    }
}
