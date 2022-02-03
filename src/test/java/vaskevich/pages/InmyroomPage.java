package vaskevich.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InmyroomPage {

    public String inmyroomUrl = "https://www.inmyroom.ru/";

    private static SelenideElement
            inmyroomPageFieldInput = $("input[type='text']"),
            inmyroomResultTitle = $("div.s-Search_b-Title").$("h1");


    public InmyroomPage openInmyroomPage(){
        open(inmyroomUrl);
        return this;
    }

    public InmyroomPage searchInmyroomProduct(String data){
        inmyroomPageFieldInput.setValue(data).pressEnter();
        return this;
    }

    public InmyroomPage checkInmyroomResult(String data){
        inmyroomResultTitle.shouldHave(Condition.text(data));
        return this;
    }
}
