package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement rest = $(By.xpath("//ul[@class='category-navigation-ul']//li[contains(@class, 'cat-3')]"));
    private SelenideElement bakuriani = $(byText("ბაკურიანი"));
    private SelenideElement login = $(".swoop-login").$(new ByText("შესვლა"));

    public SelenideElement getBakuriani() {
        return bakuriani;
    }

    public SelenideElement getRest() {
        return rest;
    }
    public SelenideElement getLogin() {
        return login;
    }
}


