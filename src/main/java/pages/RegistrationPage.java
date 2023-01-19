package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {


    private SelenideElement registerNewAccount =$(".register");
    private SelenideElement firstName = $("#pFirstName");
    private SelenideElement lastName =$("#pLastName");
    private SelenideElement phone =$("#pPhone");
    private SelenideElement mail = $("#pEmail");
    private SelenideElement dateOfBirth = $("#pDateBirth");
    private SelenideElement password = $("#pPassword");
    private SelenideElement confirmPassword = $("#pConfirmPassword");
    private SelenideElement agreeTerms = $("#pIsAgreeTerns");
    private SelenideElement register = $ (By.xpath("//a[@onclick='checkPhysicalFormSubmit()']//div[@class='dashbord-registration']"));
    private SelenideElement messageChooseGender = $("#physicalInfoMassage");

    public SelenideElement getRegisterNewAccount() {
        return registerNewAccount;
    }

    public SelenideElement getFirstName() {
        return firstName;
    }

    public SelenideElement getLastName() {
        return lastName;
    }

    public SelenideElement getPhone() {
        return phone;
    }

    public SelenideElement getMail() {
        return mail;
    }

    public SelenideElement getDateOfBirth() {
        return dateOfBirth;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getConfirmPassword() {
        return confirmPassword;
    }

    public SelenideElement getAgreeTerms() {
        return agreeTerms;
    }

    public SelenideElement getRegister() {
        return register;
    }

    public SelenideElement getMessageChooseGender() {
        return messageChooseGender;
    }
}

