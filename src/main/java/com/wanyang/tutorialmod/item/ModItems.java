package com.wanyang.tutorialmod.item;

import com.wanyang.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new FabricItem.Settings()));
//    物品注册方法
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(TutorialMod.MOD_ID,name),item);
    }
//    初始化Mod
    public static void registerModItems() {}
}
