package tests;

import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import configuration.AllureSelenide;
import data.RestPageData;
import io.qameta.allure.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.RestPage;
import steps.HomePageSteps;
import steps.RestPageSteps;

import static com.codeborne.selenide.Selenide.*;

@Listeners({ScreenShooter.class})
@Epic("test RestPage")
@Feature("check prices")
@Story("click on rest, In 'ფასი' element put range from 200 to 230, Check that all returned elements are in selected range")
public class TestOne {

    @BeforeClass
    public static void setUp() {
        Configuration.browser = Browsers.CHROME;
        Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }


    SoftAssert softAssert = new SoftAssert();
    HomePageSteps homePageSteps = new HomePageSteps();
    RestPageSteps restPageSteps = new RestPageSteps();
    RestPageData restPageData = new RestPageData();
    RestPage restPage = new RestPage();


    @Test(testName = "testOne", groups = "Resgression1")
    @Description("check prices in range")
    public void testOne() {
        open("https://swoop.ge");
        homePageSteps.clickOnRest();

        restPageSteps.setMinPrice()
                .setMaxPrice()
                .clickOnSearch();

        $(".loader").should(Condition.disappear);


        ElementsCollection allPrices = restPage.getPrices();
        for (SelenideElement item : allPrices) {
            String items = item.getText();
            String sub = items.substring(0, items.length() - 1);
            int price = Integer.parseInt(sub);
            System.out.println(sub);
            softAssert.assertTrue(restPageData.getMinPrice() < price);
            softAssert.assertTrue(price < restPageData.getMaxPrice());

            softAssert.assertAll();

        }
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
