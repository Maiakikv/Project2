package tests;

import SQLdata.DataProvider;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import configuration.AllureSelenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.RegistrationPage;
import steps.HomePageSteps;
import steps.RegistrationPageSteps;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class})
@Epic("Registration page test")
@Feature("fill the form with DB data")
@Story("fill the form, dont't ccheck on gender and ensure, error message is correct")
public class TestThree {
    @BeforeClass
    public static void setUp() {
        closeWebDriver();
        Configuration.browser = Browsers.CHROME;
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    HomePageSteps homePageSteps = new HomePageSteps();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();


    @Test(testName = "DB test", groups = "Resgression2", dataProvider = "DB", dataProviderClass = DataProvider.class)
    @Description("fill the form with dataprovider")
    public void testThree(String firstname, String lastName, String phone, String email, String date, String password) {
        open("https://swoop.ge");
        homePageSteps.clickOnLogin();
        registrationPageSteps.clickOnRegister()
                .setFirstName(firstname)
                .setLastName(lastName)
                .setMobile(phone)
                .setEmail(email)
                .setDate(date)
                .setPassword(password)
                .confirmPassword(password)
                .checkTerms()
                .registerNewAccount();
        Assert.assertEquals(registrationPage.getMessageChooseGender().getText(), "გთხოვთ აირჩიოთ სქესი!");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

}
