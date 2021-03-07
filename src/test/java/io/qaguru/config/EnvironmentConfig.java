package io.qaguru.config;

import org.aeonbits.owner.Config;

public interface EnvironmentConfig extends Config {

    @Key("remote.url")
    String webDriverUrl();

    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("video.storage")
    String videoStorage();
}
