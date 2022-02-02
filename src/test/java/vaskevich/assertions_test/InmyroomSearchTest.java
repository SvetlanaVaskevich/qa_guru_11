package vaskevich.assertions_test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InmyroomSearchTest {

    @Test
    public void searchInmyroomProductTest(){
        open("https://www.inmyroom.ru/");
        $("input[type='text']").setValue("стол").pressEnter();
    }
}
