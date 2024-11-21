package com.wanyang.tutorialmod.item;

import com.wanyang.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    //实列物品
    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new Item.Settings()));
    public static final Item  Heart= registerItems("heart",new Item(new Item.Settings()));
    //注册方法
    public static Item registerItems(String id, Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),Identifier.of(TutorialMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,id), item);
    }

//    初始化Mod
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Items");
    }
}
