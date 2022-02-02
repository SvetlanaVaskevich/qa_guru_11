package vaskevich.assertions_test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class IkeaSearchTest {

    @Test
    public void searchIkeaProduct(){
      open("https://www.ikea.com/ru/ru/");
    }
}
