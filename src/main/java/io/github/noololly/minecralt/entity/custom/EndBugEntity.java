package io.github.noololly.minecralt.entity.custom;

import io.github.noololly.minecralt.Minecralt;
import io.github.noololly.minecralt.entity.ModEntities;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class EndBugEntity extends AnimalEntity{

    //public final AnimationState ANIMATION_STATE = new AnimationState();
    //private int idleAnimationTimeout = 0;

    public EndBugEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 8.0D)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.5D)
                .add(EntityAttributes.ATTACK_DAMAGE, 1.0D)
                .add(EntityAttributes.FOLLOW_RANGE, 20.0D);
    }

    @Override
    protected void initGoals(){

        if(this.getWorld() == null){
            Minecralt.MINECRALT_LOGGER.error("EndBugEntity initGoals called before world was set!");
        } else{Minecralt.MINECRALT_LOGGER.info("EndBugEntity initGoals called!");}

        this.goalSelector.add(0, new SwimGoal(this));

        this.goalSelector.add(1, new AnimalMateGoal(this, 1.15D));

        this.goalSelector.add(2, new TemptGoal(this, 1.25D, Ingredient.ofItems(Items.CHORUS_FRUIT), false));

        this.goalSelector.add(3, new FollowParentGoal(this, 1.0D));

        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1.0D));

        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));

        this.goalSelector.add(6, new LookAroundGoal(this));
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.CHORUS_FRUIT);
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.END_BUG.create(world);

    }
}