package vaskevich.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IkeaPage {

    public String ikeaUrl = "https://www.ikea.com/ru/ru/";

    private static SelenideElement
            ikeaFieldInput = $("input[type='search']"),
            ikeaResultTitle = $("b.notranslate");


    public IkeaPage openIkeaPage(){
        open(ikeaUrl);
        return this;
    }

    public IkeaPage searchIkeaProduct(String data){
        ikeaFieldInput.setValue(data).pressEnter();
        return this;
    }

    public IkeaPage checkIkeaResult(String data){
        ikeaResultTitle.shouldHave(Condition.text(data));
        return this;
    }

}
