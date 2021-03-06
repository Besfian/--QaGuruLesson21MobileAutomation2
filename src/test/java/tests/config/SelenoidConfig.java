package tests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/selenoid.properties"
})
public interface SelenoidConfig extends Config {
    @Key("login")
    @DefaultValue("user1")
    String login();

    @Key("password")
    @DefaultValue("1234")
    String password();

    @Key("apk_url")
    @DefaultValue("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk")
    String apkUrl();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("os_version")
    @DefaultValue("9.0")
    String getOSVersion();

    @Key("test_url")
    String testUrl();
}
