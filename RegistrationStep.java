package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationStep {
    WebDriver driver;
    @Given("^The Dealer portal$")
    public void theDealerPortal() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gboyega.Oladipo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
        driver.manage().window().maximize();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter the Following OV(\\d+)UYY as ENTER REG$")
    public void iEnterTheFollowingOVUYYAsENTERREG(int arg0) throws Throwable {
        driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @And("^I click on Find vehicle button$")
    public void iClickOnFindVehicleButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[3]/form/button")).click();
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }


    @Then("^The result should be displayed with the Cover start and Cover end date and time$")
    public void theResultShouldBeDisplayedWithTheCoverStartAndCoverEndDateAndTime() throws Throwable {
        System.out.println("Result Page");
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
