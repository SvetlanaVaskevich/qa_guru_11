package vaskevich.assertions_test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IkeaSearchTest {

    @Test
    public void searchIkeaProductTest(){
        open("https://www.ikea.com/ru/ru/");
        $("input[type='search']").setValue("стол").pressEnter();
        $("b.notranslate").shouldHave(Condition.text("стол"));
    }

}
