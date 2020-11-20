package nl.thrasilias.template;

import nl.thrasilias.template.configuration.Config;
import nl.thrasilias.template.configuration.Data;
import nl.thrasilias.template.configuration.Lang;
import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {

    private static Template instance;


    public Template() {
        instance = this;
    }

    @Override
    public void onEnable() {
        Config.reload(this);
        Lang.reload(this);
        Data.getInstance();


        Logger.info(getName() + " v" + getDescription().getVersion() + " enabled!");
    }

    @Override
    public void onDisable() {
        Logger.info(getName() + " disabled!");
    }

    public static Template getInstance() {
        return instance;
    }

}
