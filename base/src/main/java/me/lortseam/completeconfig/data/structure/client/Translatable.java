package me.lortseam.completeconfig.data.structure.client;

import me.lortseam.completeconfig.text.TranslationKey;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.Text;

public interface Translatable {

    TranslationKey getNameTranslation();

    default Text getName() {
        return getNameTranslation().toText();
    }

}
