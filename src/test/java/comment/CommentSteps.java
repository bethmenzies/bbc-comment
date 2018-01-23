package comment;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions; 

import cucumber.api.java.Before; 
import cucumber.api.java.After; 
import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When; 

import static org.junit.Assert.assertTrue;

public class CommentSteps {
	WebDriver driver = null;

    @Before
    public void setChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void closeChromeDriver() {
        driver.close();
    }

    @Given("^I am an audience member$")
    public void i_am_an_audience_member() {
    	driver.get("http://www.bbc.co.uk/blogs/test/entries/f5f3031a-1a29-44ee-b2f8-86e78bfd57b0");
    }

    @When("^I want to add a comment to a BBC News article$")
    public void i_want_to_add_a_comment() {
        driver.switchTo().frame(driver.findElement(By.id("bbc-blogs-comments-iframe")));
    	new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("blogs-comments-container")));
    }

    @When("^I want to sign in to my account$")
    public void i_want_to_sign_in() {
        driver.findElement(By.className("id4-cta-signin")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("page__content")));
    }

    @Then("^Sign in button should exist$")
    public void sign_in_button() {
    	assertTrue("Sign in button exists", driver.findElement(By.className("id4-cta-signin")).isDisplayed());
    }

    @Then("^Register link should exist$")
    public void register_link() {
		assertTrue("Register link exists", driver.findElement(By.className("id4-cta-register")).isDisplayed());
    }

    @Then("^Username field should exist$")
    public void username_field() {
    	assertTrue("Username field exists", driver.findElement(By.id("user-identifier-input")).isDisplayed());
    }

    @Then("^Password field should exist$")
    public void password_field() {
        assertTrue("Password field exists", driver.findElement(By.id("password-input")).isDisplayed());
    }

    @Then("^Sign in page button should exist$")
    public void sign_in_page_button() {
        assertTrue("Sign in page button exists", driver.findElement(By.id("submit-button")).isDisplayed());
    }
}