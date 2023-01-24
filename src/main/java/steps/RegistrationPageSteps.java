package steps;

import io.qameta.allure.Step;
import pages.RegistrationPage;

public class RegistrationPageSteps {
    RegistrationPage registrationPage = new RegistrationPage();


    @Step ("click on რეგისტრაცია")
    public RegistrationPageSteps clickOnRegister (){
        registrationPage.getRegisterNewAccount().click();
        return this;
    }
    @Step ("set firstname")
    public RegistrationPageSteps setFirstName (String fname){
        registrationPage.getFirstName().sendKeys(fname);
        return this;
    }
    @Step ("set lastname")
    public RegistrationPageSteps setLastName (String lname){
        registrationPage.getLastName().sendKeys(lname);
        return this;
    }
    @Step ("set mobile number")
    public RegistrationPageSteps setMobile (String mobile){
        registrationPage.getPhone().sendKeys(mobile);
        return this;
    }
    @Step ("set email")
    public RegistrationPageSteps setEmail (String email){
        registrationPage.getMail().sendKeys(email);
        return this;
    }
    @Step ("set date")
    public RegistrationPageSteps setDate (String date){
        registrationPage.getDateOfBirth().sendKeys(date);
        return this;
    }
    @Step ("set password")
    public RegistrationPageSteps setPassword (String pass){
        registrationPage.getPassword().sendKeys(pass);
        return this;
    }
    @Step ("conform password")
    public RegistrationPageSteps confirmPassword (String pass){
        registrationPage.getConfirmPassword().sendKeys(pass);
        return this;
    }
    @Step ("check terms checkbox")
    public RegistrationPageSteps checkTerms (){
        registrationPage.getAgreeTerms().click();
        return this;
    }
    @Step ("click on რეგისტრაცია")
    public RegistrationPageSteps registerNewAccount (){
        registrationPage.getRegister().scrollTo().click();
        return this;
    }
}
