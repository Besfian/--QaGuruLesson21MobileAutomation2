package tests.localdevice;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WikiTestsInLocalDevice extends LocalTestBase {

    private String searchText = "Благодарим вас за ваш интерес к поддержке Фонда Викимедиа. " +
            "К сожалению, в настоящий момент мы не можем принимать пожертвования из России. " +
            "Мы ценим вашу поддержку, ибо наша цель – нести знания в каждый уголок мира.";
    @Test
    @Tag("local")
    @DisplayName("Проверяем, что у Wikipedia есть пункт Donate")
    void donatePageExistTest() {
        step("Кликаем по меню в правом нижнем углу", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/menu_icon")).click();
        });
        step("Выбираем Donate", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_donate_container")).click();
        });
        step("Выбираем в качестве способа выполнения Chrome", () -> {
            $(MobileBy.xpath(("//*[@text='Chrome']"))).click();
        });
        step("Проверяем, что перешли на страницу Donate", () -> {
            $(MobileBy.id("com.android.chrome:id/url_bar")).shouldHave(text("https://donate.wikimedia.org/w/index.php?" +
                    "title=Special:LandingPage&country=RU&uselang=en&utm_medium=WikipediaApp"));
        });
        step("Проверяем, что перешли на страницу Donate", () -> {
            $(MobileBy.xpath(String.format("//*[@text='%s']",searchText))).exists();
        });
    }
}
