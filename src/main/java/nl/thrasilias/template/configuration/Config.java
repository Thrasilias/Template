package nl.thrasilias.template.configuration;

import nl.thrasilias.template.Template;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {
    public static boolean COLOR_LOGS;
    public static boolean DEBUG_MODE;
    public static String LANGUAGE_FILE;

    public static void reload(Template template) {
        template.saveDefaultConfig();
        template.reloadConfig();
        FileConfiguration config = template.getConfig();

        COLOR_LOGS = config.getBoolean("color-logs", true);
        DEBUG_MODE = config.getBoolean("debug-mode", false);
        LANGUAGE_FILE = config.getString("language-file", "lang-en.yml");

    }

}
