package team.dovecotmc.metropolis;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import team.dovecotmc.metropolis.block.MetroBlocks;
import team.dovecotmc.metropolis.block.entity.MetroBlockEntities;
import team.dovecotmc.metropolis.config.MetroConfig;
import team.dovecotmc.metropolis.entity.EntitySittable;
import team.dovecotmc.metropolis.entity.MetroEntities;
import team.dovecotmc.metropolis.item.MetroItems;
import team.dovecotmc.metropolis.network.MetroServerNetwork;
import team.dovecotmc.metropolis.sittable.SittableRegistries;
import team.dovecotmc.metropolis.sittable.SittableRegistry;

import java.util.Optional;

/**
 * @author Arrokoth
 * @project Metropolis
 * @copyright Copyright © 2023 Arrokoth All Rights Reserved.
 */
public class Metropolis implements ModInitializer {
    public static final String MOD_ID = "metropolis";
    public static final Logger LOGGER = LogManager.getLogger("Metropolis");
    public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder()
            .title(Component.translatable("itemGroup." + MOD_ID + ".all")) // 添加标题
            .icon(() -> new ItemStack(MetroItems.ITEM_ITV_MONITOR))
            .displayItems((parameters, output) -> {
                output.accept(MetroItems.ITEM_CABLE);

                output.accept(MetroItems.ITEM_TICKET_VENDOR_TOP);
                output.accept(MetroItems.ITEM_TICKET_VENDOR_PANEL);
                output.accept(MetroItems.ITEM_TICKET_VENDOR_EM10);
                output.accept(MetroItems.ITEM_TICKET_VENDOR_EV23);
                output.accept(MetroItems.ITEM_FARE_ADJ_EV23);
                // Ceiling
                output.accept(MetroItems.ITEM_CEILING_A);

                // Lamp
                output.accept(MetroItems.ITEM_FLUORESCENT_LAMP);
                output.accept(MetroItems.ITEM_BUMPER);
                output.accept(MetroItems.ITEM_CAMERA);

                // Turnstile
                output.accept(MetroItems.ITEM_TURNSTILE_ENTER);
                output.accept(MetroItems.ITEM_TURNSTILE_EXIT);
                output.accept(MetroItems.ITEM_TURNSTILE_IC_ONLY_ENTER);
                output.accept(MetroItems.ITEM_TURNSTILE_IC_ONLY_EXIT);

                // Sign
                output.accept(MetroItems.ITEM_SIGN_NO_PHOTO);

                // PSD
                output.accept(MetroItems.ITEM_PSD_JR_DOOR_1);
                output.accept(MetroItems.ITEM_PSD_JR_DOOR_2);
                output.accept(MetroItems.ITEM_PSD_JR_FENCE_1);
                output.accept(MetroItems.ITEM_PSD_JR_FENCE_2);

                // Ticket
                output.accept(MetroItems.ITEM_SINGLE_TRIP_TICKET);
                output.accept(MetroItems.ITEM_SINGLE_TRIP_TICKET_USED);
                output.accept(MetroItems.ITEM_CARD);
                output.accept(MetroItems.ITEM_CREATIVE_CARD);
                output.accept(MetroItems.ITEM_EXIT_TICKET);

                // Monitor
                output.accept(MetroItems.ITEM_ITV_MONITOR);

                // Security instruments
                output.accept(MetroItems.ITEM_SECURITY_DOOR);
                output.accept(MetroItems.ITEM_SECURITY_INSPECTION_MACHINE);

                // Concrete
                output.accept(MetroItems.ITEM_CONCRETE);

                // Platform
                output.accept(MetroItems.ITEM_PLATFORM_A);

                // Tiles
                // White
                output.accept(MetroItems.ITEM_TILES_WHITE);
                output.accept(MetroItems.ITEM_TILES_LARGE_WHITE);
                output.accept(MetroItems.ITEM_TILES_HORIZONTAL_WHITE);
                output.accept(MetroItems.ITEM_TILES_SMALL_WHITE);

                // Gray
                output.accept(MetroItems.ITEM_TILES_GRAY);
                output.accept(MetroItems.ITEM_TILES_HORIZONTAL_GRAY);
                output.accept(MetroItems.ITEM_TILES_SMALL_GRAY);

                // Cordon blocks
                output.accept(MetroItems.ITEM_CORDON_YELLOW_BLACK);
                output.accept(MetroItems.ITEM_CORDON_YELLOW_WHITE);
                output.accept(MetroItems.ITEM_CORDON_RED_BLACK);
                output.accept(MetroItems.ITEM_CORDON_RED_WHITE);

                // Bench
                output.accept(MetroItems.ITEM_BENCH);
            })
            .build();
    public static final MetroConfig config = MetroConfig.load();

    @Override
    public void onInitialize() {
        MetroBlocks.initialize();
        MetroBlockEntities.initialize();
        MetroEntities.initialize();
        MetroItems.initialize();
        MetroServerNetwork.registerAll();
        SittableRegistries.registerSittable(new SittableRegistry(MetroBlocks.BLOCK_BENCH, (state, player, hit) -> Optional.of(new Vec3(0.5, 0.1, 0.5))));
//        MetroEnumUtil.addRailtype("rail_5", 5, MapColor.BLUE, false, true, true, RailType.RailSlopeStyle.CURVE);

        // TODO: Ask Haruka: Japanese localization!!!

        UseBlockCallback.EVENT.register(
                (player, world, hand, hitResult) -> !player.isShiftKeyDown() && EntitySittable.trySit(world, hitResult.getBlockPos(), world.getBlockState(hitResult.getBlockPos()), hitResult, player) ?
                        InteractionResult.SUCCESS :
                        InteractionResult.PASS
        );

    }
}
