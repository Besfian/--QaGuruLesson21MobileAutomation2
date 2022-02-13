package tests.browserstack;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверка настройки страницы Wikipedia")
public class WikiTestsInBrowserstack extends TestBase {
    @Test
    @Tag("browserstack")
    @DisplayName("Проверяем, что язык сайта можно изменить на итальянский")
    void italianoLanguageTest() {
        step("Кликаем по меню в правом верхнем углу", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        });
        step("Кликаем Settings", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/explore_overflow_settings")).click();
        });
        step("Кликаем выбор языка", () -> {
            $(MobileBy.id("android:id/summary")).click();
        });
        step("В строке поиска вводим \"It\"", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/preference_languages_filter")).sendKeys("It");
        });
        step("Проверяем, что в выпадающем списке есть итальянский", () -> {
            $$(byClassName("android.widget.LinearLayout")).contains("Italiano");
        });
    }
}
