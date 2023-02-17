package net.notbaka.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.notbaka.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static ItemGroup CITRINE;

    public static void registerItemGroups() {
        CITRINE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup.citrine"))
                .icon(() -> new ItemStack(Moditems.CITRINE)).build();
    }
}
