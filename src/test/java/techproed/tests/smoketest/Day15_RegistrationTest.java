package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;
public class Day15_RegistrationTest {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void registrationTest(){
//        Driver.getDriver().get("https://www.gmibank.com/account/register");
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_registration_url"));
//        Driver.getDriver().findElement(By.id("ssn")).sendKeys("111111111");
        registrationPage.ssn.sendKeys("111111111");
//        HOMEWORK : complete the test of the test case
//        Enter all fields and click register
//        Create page objects in the page class
//        Then use it in the test class
//        DO MANUAL TESTING FIRST
    }
}