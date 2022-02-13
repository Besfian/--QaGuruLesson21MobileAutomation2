package tests.browserstack;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверка поиска на странице Wikipedia")
public class ExampleTest extends TestBase {
    @Test
    @DisplayName("Проверяем выполнение поиска по запросу \"Russia\"")
    void searchTest() {
        step("Кликаем в  поле поиска", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        });
        step("Вводим в поле поиска строку \"Russia\"", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Russia");
        });
        step("Проверяем, что найдено ссылок больше, чем 0", () -> {
            $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));
        });
    }
}
