package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RestPage {
    private SelenideElement minPrice = $(".clearfix").$("#minprice");
    private SelenideElement maxPrice = $(".clearfix").$("#maxprice");
    private SelenideElement searchButton = $(".clearfix").$(".submit-button");
    private ElementsCollection prices = $$(By.xpath("//div[@class= 'discounted-prices']//p[1]"));


    public SelenideElement getMinPrice() {
        return minPrice;
    }

    public SelenideElement getMaxPrice() {
        return maxPrice;
    }

    public SelenideElement getSearchButton() {
        return searchButton;
    }

    public ElementsCollection getPrices() {
        return prices;
    }

}
