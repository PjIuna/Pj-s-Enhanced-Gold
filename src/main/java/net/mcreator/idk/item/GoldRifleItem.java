package net.mcreator.idk.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;

public class GoldRifleItem extends Item {

    public GoldRifleItem(Properties properties) {
        super(properties);
    }

    public void onUsingTick(ItemStack stack, Level world, LivingEntity entity, int count) {
        // stub
    }
}
