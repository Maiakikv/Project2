package steps;


import io.qameta.allure.Step;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

   @Step ("Hover on დასვენება")
    public HomePageSteps hoverOnRest (){
       homePage.getRest().hover();
        return this;
    }
   @Step ("Go to დასვენება")
    public HomePageSteps clickOnRest (){
        homePage.getRest().click();
        return this;
    }
    @Step ("Click on first returned element ბაკურიანი")
    public HomePageSteps clickOnBakuriani (){
        homePage.getBakuriani().click();
        return this;
    }
    @Step ("click on შესვლა")
    public HomePageSteps clickOnLogin (){
        homePage.getLogin().click();
        return this;
    }










}
