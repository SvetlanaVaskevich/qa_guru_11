package vaskevich.assertions_test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import vaskevich.pages.InmyroomPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InmyroomSearchTest {

    InmyroomPage inmyroomPage = new InmyroomPage();

    String data = "диван";

    @Test
    public void searchInmyroomProductTest(){
        inmyroomPage
                .openInmyroomPage()
                .searchInmyroomProduct(data)
                .checkInmyroomResult(data);
    }
}
