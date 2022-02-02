package vaskevich.assertions_test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoffSearchTest {

    @Test
    public void searchHoffProduct(){
        open("https://hoff.ru/");
        $("input[name='search']").setValue("гостиная");
        $("h1.page-title").shouldHave(Condition.text("Гостиная"));
    }
}
