package vaskevich;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchWeatherForCityTest {

    @CsvSource(value = {
            "Екатеринбург, Погода в Екатеринбурге",
            "Нижний Тагил, Погода в Нижнем Тагиле"
    })
    @ParameterizedTest(name = "Поиск погоды городов на Урале: {0}")
    public void serchWeatherUralCitiesTest(String city,String expected){
        open("https://rp5.ru/");
        $("#searchStr").setValue(city);
        $("#searchButton").click();
        $(".innerTextResult a").click();
        $("#pointNavi-container h1").shouldHave(Condition.text(expected));
    }

    static Stream<Arguments> nameCity() {
        return Stream.of(
                Arguments.of("Москва","Погода в Москве"),
                Arguments.of("Псков","Погода в Пскове")
        );
    }

    @ParameterizedTest(name="Поиск погоды городов Центральной России")
    @MethodSource("nameCity")
    public void serchWeatherCitiesTest(String city,String expected){
        open("https://rp5.ru/");
        $("#searchStr").setValue(city);
        $("#searchButton").click();
        $(".innerTextResult a").click();
        $("#pointNavi-container h1").shouldHave(Condition.text(expected));
    }
}

