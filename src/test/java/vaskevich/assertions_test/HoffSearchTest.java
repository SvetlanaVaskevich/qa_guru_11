package vaskevich.assertions_test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoffSearchTest {

    @Test
    public void searchHoffProduct(){
        //открываем главную страницу
        open("https://hoff.ru/");
        //в поле поиска заносим товар
        $("input[name='search']").setValue("гостиная");
        //проверяем, что получили запрашиваемую категорию товара
        $("h1.page-title").shouldHave(Condition.text("Гостиная"));
    }
}
