package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BakurianiPage {
    private SelenideElement highlightedCategory = $(".category-filter-desk").$(".searched-category");
    private SelenideElement location = $("#sidebar-container").$(".location-filter").$("label");
    private SelenideElement sortDropDown = $("#sort");
    private SelenideElement descPrice = $("#sort").$(byText("ფასით კლებადი"));
    private SelenideElement firstReturnedResult = $(".discounted-prices", 0).$(By.tagName("p"), 0);
    private SelenideElement secondReturnedResult = $(".discounted-prices", 1).$(By.tagName("p"), 0);

    public SelenideElement getFirstReturnedResult() {
        return firstReturnedResult;
    }

    public SelenideElement getSecondReturnedResult() {
        return secondReturnedResult;
    }

    public SelenideElement getHighlightedCategory() {
        return highlightedCategory;
    }

    public SelenideElement getLocation() {
        return location;
    }

    public SelenideElement getSortDropDown() {
        return sortDropDown;
    }

    public SelenideElement getDescPrice() {
        return descPrice;
    }


}
