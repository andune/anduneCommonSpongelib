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

import com.andune.minecraft.commonlib.server.api.*;
import com.andune.minecraft.commonlib.server.api.impl.LocationAbstractImpl;
import com.flowpowered.math.vector.Vector3d;

/**
 * @author andune
 */
public class SpongeLocation extends LocationAbstractImpl implements Location {
    // the Sponge Location that this Location object wraps
    private final org.spongepowered.api.world.Location spongeLocation;

    public SpongeLocation(org.spongepowered.api.world.Location spongeLocation) {
        this.spongeLocation = spongeLocation;
    }

    public SpongeLocation(Location l) {
        // TODO: not clear yet how I would do this in Sponge
        spongeLocation = null;
    }

    public SpongeLocation(String worldName, double x, double y, double z, float yaw, float pitch) {
        // TODO: not clear yet how I would do this in Sponge
        spongeLocation = null;
    }

    public org.spongepowered.api.world.Location getSpongeLocation() {
        return spongeLocation;
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getBlock()
     */
    @Override
    public Block getBlock() {
        // TODO: implement me
//        spongeLocation.getBlock();

        return null;
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#setX(double)
     */
    @Override
    public void setX(double x) {
        Vector3d pos = spongeLocation.getPosition();
        // TODO: do something here, I hope we don't have to get old position
        // and subtract from new position to get X addition arg?
        spongeLocation.setPosition(pos);
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getX()
     */
    @Override
    public double getX() {
        return spongeLocation.getPosition().getX();
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getBlockX()
     */
    @Override
    public int getBlockX() {
        return spongeLocation.getPosition().getFloorX();
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#setY(double)
     */
    @Override
    public void setY(double y) {
        // TODO: implement me
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getY()
     */
    @Override
    public double getY() {
        return spongeLocation.getPosition().getY();
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getBlockY()
     */
    @Override
    public int getBlockY() {
        return spongeLocation.getPosition().getFloorY();
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#setZ(double)
     */
    @Override
    public void setZ(double z) {
        // TODO: implement me
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getZ()
     */
    @Override
    public double getZ() {
        return spongeLocation.getPosition().getZ();
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getBlockZ()
     */
    @Override
    public int getBlockZ() {
        return spongeLocation.getPosition().getFloorZ();
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#setYaw(float)
     */
    @Override
    public void setYaw(float yaw) {
        // TODO: Implement me
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getYaw()
     */
    @Override
    public float getYaw() {
        // TODO: Implement me
        return 0.0f;
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#setPitch(float)
     */
    @Override
    public void setPitch(float pitch) {
        // TODO: Implement me
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#getPitch()
     */
    @Override
    public float getPitch() {
        // TODO: Implement me
        return 0.0f;
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.Location#distance(com.andune.minecraft.hsp.server.api.Location)
     */
    @Override
    public double distance(Location o) {
        // we can only compare distance to other BukkitLocation objects.
        if( !(o instanceof SpongeLocation) )
            throw new IllegalArgumentException("invalid object class: "+o);

        // TODO: no distance calculation methods exist for Sponge yet
        return 0.0;
    }

    @Override
    public World getWorld() {
        // TODO: implement me
        return null;
    }

    @Override
    public void playEffect(Effect effect, int data) {
        // TODO: implement me
    }

    @Override
    public void playSound(Sound sound, float volume, float pitch) {
        // TODO: implement me
    }
}
