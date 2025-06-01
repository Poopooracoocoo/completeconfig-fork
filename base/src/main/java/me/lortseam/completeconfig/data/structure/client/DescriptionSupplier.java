package me.lortseam.completeconfig.data.structure.client;

import me.lortseam.completeconfig.text.TranslationKey;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.Text;

import java.util.Optional;

public interface DescriptionSupplier {

    Optional<TranslationKey> getDescriptionTranslation();

    default Optional<Text> getDescription() {
        return getDescriptionTranslation().map(TranslationKey::toText);
    }

}
