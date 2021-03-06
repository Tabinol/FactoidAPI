/*
 Factoid: Lands and Factions plugin for Minecraft server
 Copyright (C) 2014 Kaz00, Tabinol

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package me.tabinol.factoidapi.event;

import me.tabinol.factoidapi.lands.ILand;
import me.tabinol.factoidapi.playercontainer.IPlayerContainer;

import org.bukkit.event.HandlerList;


/**
 * The Class PlayerContainerAddNoEnterEvent. This event is called when a
 * player container is added to a disallow inside a land.
 */
public class PlayerContainerAddNoEnterEvent extends LandEvent {

    /** The Constant handlers. */
    private static final HandlerList handlers = new HandlerList();
    
    /** The player container. */
    IPlayerContainer playerContainer;

    /**
     * Instantiates a new player container add no enter event.
     *
     * @param land the land
     * @param playerContainer the player container
     */
    public PlayerContainerAddNoEnterEvent(final ILand land, final IPlayerContainer playerContainer) {

        super(land);
        this.playerContainer = playerContainer;
    }

    /* (non-Javadoc)
     * @see me.tabinol.factoidapi.event.LandEvent#getHandlers()
     */
    @Override
    public HandlerList getHandlers() {

        return handlers;
    }

    /**
     * Gets the handler list.
     *
     * @return the handler list
     */
    public static HandlerList getHandlerList() {

        return handlers;
    }

    /**
     * Gets the player container.
     *
     * @return the player container
     */
    public IPlayerContainer getPlayerContainer() {

        return playerContainer;
    }
}
