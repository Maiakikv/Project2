package steps;

import io.qameta.allure.Step;
import pages.BakurianiPage;

public class BakurianiPageSteps {
    BakurianiPage bakurianiPage = new BakurianiPage();


    @Step("click on sort")
    public BakurianiPageSteps clickOnSortDropDown (){
        bakurianiPage.getSortDropDown().click();
        return this;
    }
    @Step("choose ფასით კლებადი")
    public BakurianiPageSteps chooseDescPrice (){
        bakurianiPage.getDescPrice().click();
        return this;
    }



}
