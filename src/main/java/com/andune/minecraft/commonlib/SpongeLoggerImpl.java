package com.andune.minecraft.commonlib;

import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.plugin.PluginManager;

import javax.inject.Inject;

/**
 * @author andune
 */
public class SpongeLoggerImpl extends LoggerSlf4jImpl implements Logger {
    @Inject
    public SpongeLoggerImpl(PluginManager pm, PluginContainer pc) {
        // not sure why passing the slf4j Logger to the super constructor
        // isn't working (getting odd maven dependency errors), so I'll
        // have to debug that later. TODO
//        super(pm.getLogger(pc));

        super("test", "test2");
    }
}
