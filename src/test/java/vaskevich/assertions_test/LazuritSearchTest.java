package vaskevich.assertions_test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LazuritSearchTest {

    @Test
    public void searchInmyroomProductTest(){
        open("https://lazurit.com/");
        $("#multisearch-input").setValue("кухня").pressEnter();
        $(".c-fav__count").parent().$("h1").shouldHave(Condition.text("Поиск по запросу: «кухня»"));

    }
}
