package vaskevich.assertions_test;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import vaskevich.pages.IkeaPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IkeaSearchTest {

    IkeaPage ikeaPage = new IkeaPage();
    String data  = "стол";

    @Test
    public void searchIkeaProductTest(){
        ikeaPage
                .openIkeaPage()
                .searchIkeaProduct(data)
                .checkIkeaResult(data);
    }
}
