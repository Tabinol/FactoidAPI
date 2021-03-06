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
package me.tabinol.factoidapi.config.players;

import me.tabinol.factoidapi.lands.IDummyLand;
import me.tabinol.factoidapi.playercontainer.IPlayerContainerPlayer;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * The Interface IPlayerConfEntry. Contains diver Factoid informations from a
 * player.
 */
public interface IPlayerConfEntry {

	/**
	 * Gets the player container from this player.
	 *
	 * @return the player container
	 */
	public IPlayerContainerPlayer getPlayerContainer();

	/**
	 * Gets the command sender from this player.
	 *
	 * @return the sender
	 */
	public CommandSender getSender();

	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	public Player getPlayer();

	/**
	 * Checks if the player is in admin mod.
	 *
	 * @return true, if is in admin mod
	 */
	public boolean isAdminMod();

	/**
	 * Gets the last move update from the border control.
	 *
	 * @return the last move update in millisecond
	 */
	public long getLastMoveUpdate();

	/**
	 * Gets the last land take from the border control.
	 *
	 * @return the last land
	 */
	public IDummyLand getLastLand();

	/**
	 * Gets the last location take from the border control.
	 *
	 * @return the last location
	 */
	public Location getLastLoc();

}