package tests.selenoid;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WikiTestsInSelenoid extends SelenoidTestBase {

    @Test
    @Tag("selenoid")
    @DisplayName("Проверяем, что у Wikipedia есть пункт Donate")
    void donatePageExistTest() {
        step("Кликаем по пункту меню CONTINUE", () -> {
            $(MobileBy.xpath(("//*[@text='CONTINUE']"))).click();
        });
        step("Кликаем по пункту меню CONTINUE", () -> {
            $(MobileBy.xpath(("//*[@text='CONTINUE']"))).click();
        });
        step("Кликаем по пункту меню CONTINUE", () -> {
            $(MobileBy.xpath(("//*[@text='CONTINUE']"))).click();
        });
        step("Кликаем по пункту меню GET STARTED", () -> {
            $(MobileBy.xpath(("//*[@text='GET STARTED']"))).click();
        });
        step("Кликаем по меню в правом нижнем углу", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/menu_icon")).click();
        });
        step("Выбираем Donate", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_donate_container")).click();
        });
        step("Проверяем, что перешли на страницу Donate", () -> {
            $(MobileBy.xpath(String.format("//*[@text='%s']","https://donate.wikimedia.org/w/"))).exists();
        });
    }

}
