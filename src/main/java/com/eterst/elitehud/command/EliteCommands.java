/*
 * Copyright (c) 2023 Jonder Hernández Gutiérrez
 *
 * This Minecraft plugin and its source code are subject to the terms of the GNU General Public License version 3.0 ("GPLv3") of the Free Software Foundation, either in its original version or any later version published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.
 *
 * The source code for this plugin is available at https://github.com/Eterst/EliteHUD.
 *
 * If you have any questions about the license or use of this plugin, please contact the copyright holder at mjonder09@gmail.com.
 */

package com.eterst.elitehud.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.permission.Permission;
import org.bukkit.plugin.java.annotation.permission.Permissions;

/**
 * Implementation of {@link CommandExecutor} for the plugin {@link com.eterst.elitehud.EliteHUD}
 * @author Eterst
 */
@Commands(@org.bukkit.plugin.java.annotation.command.Command(
        name = "elitehud",
        aliases = { "eh", "eliteh", "ehud" },
        permission = "elitehud.command",
        usage = "Usage: /ehud <command>"
))

@Permissions(@Permission(
        name = "elitehud.command",
        desc = "Basic command permission",
        defaultValue = PermissionDefault.TRUE
))
public class EliteCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            return processPlayerCommand(player, command, label, args);
        }

        return false;
    }

    /**
     * Process the command of a Player
     * @param player player of the command
     * @param command command to be executed
     * @param label label of the command
     * @param args arguments of the commands
     * @return whether if the command was executed or not
     */
    private boolean processPlayerCommand(Player player, Command command, String label, String[] args) {
        player.sendMessage("Command: " + command);
        player.sendMessage("Label: " + label);
        player.sendMessage("Args: " + args);
        return true;
    }
}
