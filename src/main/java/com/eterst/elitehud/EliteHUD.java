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

package com.eterst.elitehud;

import com.eterst.elitehud.command.EliteCommands;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.dependency.Dependency;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

/**
 * Plugin to show a EliteMobs HUD with ItemsAdder
 * @author Eterst
 */
@Plugin(name = "EliteHUD", version = "0.1.0")
@ApiVersion(ApiVersion.Target.v1_19)
@Description("HUD for EliteMobs plugin")
@Author("mjonder09@gmail.com")
@Dependency("EliteMobs")
@Dependency("ItemsAdder")
public final class EliteHUD extends JavaPlugin {

    @Override
    public void onEnable() {
        var command = this.getCommand("elitehud");

        if (command != null) {
            command.setExecutor(new EliteCommands());
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
