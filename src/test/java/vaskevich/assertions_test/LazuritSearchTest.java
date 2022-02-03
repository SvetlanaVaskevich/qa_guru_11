package vaskevich.assertions_test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import vaskevich.pages.LazuritPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LazuritSearchTest {

    LazuritPage lazuritPage = new LazuritPage();

    String data = "кухня";
    String resultData = "Поиск по запросу: «кухня»";

    @Test
    public void searchLazuritProductTest(){
        lazuritPage
                .openLazuritPage()
                .searchLazuritProduct(data)
                .checkLazuritResult(resultData);
    }
}
