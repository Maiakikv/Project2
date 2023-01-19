package tests;

import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import configuration.AllureSelenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.BakurianiPage;
import steps.BakurianiPageSteps;
import steps.HomePageSteps;

import static com.codeborne.selenide.Selenide.*;

@Listeners({ScreenShooter.class})
@Epic("test bakuriani page")
@Feature("sort prices")
@Story("click on bakuriani, sort prices desc, check results")
public class TestTwo {

    @BeforeClass
    public static void setUp() {
        closeWebDriver();
        Configuration.browser = Browsers.CHROME;
        Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @Test(testName = "testTwo", groups = "Resgression1")
    @Description ("check sorted prices")
    public void testTwo() throws InterruptedException {
        HomePageSteps homePagesteps = new HomePageSteps();
        BakurianiPage bakurianiPage = new BakurianiPage();
        BakurianiPageSteps bakurianiPageSteps = new BakurianiPageSteps();
        SoftAssert softAssert = new SoftAssert();

        open("https://swoop.ge");
        homePagesteps
                .hoverOnRest()
                .clickOnBakuriani();

        softAssert.assertEquals(bakurianiPage.getHighlightedCategory().getText(), "ბაკურიანი");
        softAssert.assertEquals(bakurianiPage.getLocation().getText(), "ბაკურიანი");


        bakurianiPageSteps
                .clickOnSortDropDown()
                .chooseDescPrice();

        $(".loader").should(Condition.disappear);


        String firstPrice = bakurianiPage.getFirstReturnedResult().getText();
        String secondPrice = bakurianiPage.getSecondReturnedResult().getText();


        String first = firstPrice.substring(0, firstPrice.length() - 1);
        String second = secondPrice.substring(0, secondPrice.length() - 1);

        int firstResult = Integer.parseInt(first);
        int secondResult = Integer.parseInt(second);

        System.out.println(firstResult + " " + secondResult);

        softAssert.assertTrue(firstResult > secondResult);


    }

    @AfterTest
    public void tearDown() {
        closeWebDriver();
    }
}
