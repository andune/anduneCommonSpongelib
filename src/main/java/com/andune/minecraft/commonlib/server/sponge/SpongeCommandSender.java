/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (c) 2015 Andune (andune.alleria@gmail.com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
package com.andune.minecraft.commonlib.server.sponge;

import com.andune.minecraft.commonlib.i18n.Colors;
import com.andune.minecraft.commonlib.server.api.CommandSender;
import org.spongepowered.api.util.command.CommandSource;

/**
 * @author andune
 */
public class SpongeCommandSender implements CommandSender {
    // the Sponge CommandSource that this object wraps
    private final CommandSource commandSource;
    private final Colors colors;

    public SpongeCommandSender(CommandSource source, Colors colors) {
        this.commandSource = source;
        this.colors = colors;
    }

    @Override
    public void sendMessage(String message) {
        commandSource.sendMessage(colors.applyColors(message));
    }

    @Override
    public void sendMessage(String[] messages) {
        if( messages != null && messages.length > 0 ) {
            String[] coloredMessages = new String[messages.length];
            for(int i=0; i < messages.length; i++) {
                coloredMessages[i] = colors.applyColors(messages[i]);
            }
            commandSource.sendMessage(coloredMessages);
        }
    }

    @Override
    public String getName() {
        // TODO: not clear that this is possible right now. Sponge rightly
        // separates CommandSender from Entity's - I suspect a player object
        // will be a Mixin that we can detect and return name for, but it's
        // not clear to me yet how this would be done.
        return "NoName";
    }

    public CommandSource getSpongeSource() {
        return commandSource;
    }
}
