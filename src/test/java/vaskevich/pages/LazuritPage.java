package vaskevich.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LazuritPage {

    public String lazuritUrl = "https://lazurit.com/";

    private static SelenideElement
            lazuritFieldInput = $("#multisearch-input"),
            lazuritResultTitle = $(".c-fav__count").parent().$("h1");


    public LazuritPage openLazuritPage(){
        open(lazuritUrl);
        return this;
    }

    public LazuritPage searchLazuritProduct(String data){
        lazuritFieldInput.setValue(data).pressEnter();
        return this;
    }

    public LazuritPage checkLazuritResult(String data){
        lazuritResultTitle.shouldHave(Condition.text(data));
        return this;
    }
}
