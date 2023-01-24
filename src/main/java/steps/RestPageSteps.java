package steps;

import data.RestPageData;
import io.qameta.allure.Step;
import pages.RestPage;

public class RestPageSteps {
    RestPage restPage =new RestPage();
    RestPageData restPageData =new RestPageData();

    @Step ("set min pice")
    public RestPageSteps setMinPrice (){
        restPage.getMinPrice().sendKeys(String.valueOf(restPageData.getMinPrice()));
        return this;

    }
    @Step ("set max pice")
    public RestPageSteps setMaxPrice (){
        restPage.getMaxPrice().sendKeys(String.valueOf(restPageData.getMaxPrice()));
        return this;
    }
    @Step ("click on search")
    public RestPageSteps clickOnSearch (){
        restPage.getSearchButton().click();
        return this;
    }
}
