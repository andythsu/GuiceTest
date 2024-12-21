package org.example.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.example.Config;

public class ConfigModule
        extends AbstractModule
{
    @Provides
    public Config getConfig() {
        return new Config();
    }
}
