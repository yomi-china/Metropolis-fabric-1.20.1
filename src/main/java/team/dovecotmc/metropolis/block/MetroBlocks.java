package team.dovecotmc.metropolis.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import team.dovecotmc.metropolis.Metropolis;

/**
 * @author Arrokoth
 * @project Metropolis
 * @copyright Copyright © 2023 Arrokoth All Rights Reserved.
 */
@SuppressWarnings("unused")
public class MetroBlocks {
    // Cables
    public static final Block BLOCK_CABLE = register("cable", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, false, false));
    public static final Block BLOCK_CABLE_HORIZONTAL = register("cable_horizontal", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, false, false));
    public static final Block BLOCK_CABLE_INNER_CORNER_LEFT = register("cable_inner_corner_left", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), true, false, false));
    public static final Block BLOCK_CABLE_INNER_CORNER_RIGHT = register("cable_inner_corner_right", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), true, false, true));
    public static final Block BLOCK_CABLE_OUTER_CORNER_LEFT = register("cable_outer_corner_left", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, true, false));
    public static final Block BLOCK_CABLE_OUTER_CORNER_RIGHT = register("cable_outer_corner_right", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, true, true));
    public static final Block BLOCK_CABLE_DOWN_LEFT = register("cable_down_left", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, false, false));
    public static final Block BLOCK_CABLE_DOWN_RIGHT = register("cable_down_right", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, false, false));
    public static final Block BLOCK_CABLE_UP_LEFT = register("cable_up_left", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, false, false));
    public static final Block BLOCK_CABLE_UP_RIGHT = register("cable_up_right", new BlockCable(FabricBlockSettings.of(Material.METAL, MaterialColor.STONE).strength(2.0f).noCollission().noOcclusion(), false, false, false));
    // Tunnel light
//    public static final Block BLOCK_TUNNEL_LIGHT_A = register("tunnel_light_a", new BlockTunnelLight(FabricBlockSettings.of(Material.METAL, MapColor.STONE_GRAY).nonOpaque()));

    // Ticket Vendor Decos
    public static final Block BLOCK_TICKET_VENDOR_UP_1 = register("ticket_vendor_up_1", new BlockTicketVendorUp());
    public static final Block BLOCK_TICKET_VENDOR_UP_EM10 = register("ticket_vendor_up_em10", new BlockTicketVendorUp());
    public static final Block BLOCK_TICKET_VENDOR_UP_EV23 = register("ticket_vendor_up_ev23", new BlockTicketVendorUp());
    public static final Block BLOCK_TICKET_VENDOR_UP_EV23_GREEN = register("ticket_vendor_up_ev23_green", new BlockTicketVendorUp());
    public static final Block BLOCK_TICKET_VENDOR_UP_EV23_YELLOW = register("ticket_vendor_up_ev23_yellow", new BlockTicketVendorUp());

    public static final Block BLOCK_TICKET_VENDOR_TOP = register("ticket_vendor_top", new BlockTicketVendorTop());

    // Ticket Vendor
    public static final Block BLOCK_TICKET_VENDOR_PANEL = register("ticket_vendor_panel", new BlockTicketVendor(false));
    public static final Block BLOCK_TICKET_VENDOR_EM10 = register("ticket_vendor_em10", new BlockTicketVendor(true, BLOCK_TICKET_VENDOR_UP_EM10));
    public static final Block BLOCK_TICKET_VENDOR_EV23 = register("ticket_vendor_ev23", new BlockTicketVendor(true, BLOCK_TICKET_VENDOR_UP_EV23_GREEN));
    public static final Block BLOCK_FARE_ADJ_EV23_YELLOW = register("fare_adj_ev23", new BlockFareAdjMachine(BLOCK_TICKET_VENDOR_UP_EV23_YELLOW));

    // Ceiling
    public static final Block BLOCK_CEILING_A = register("ceiling_a", new BlockCeilingA(FabricBlockSettings.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(6.0f).noOcclusion().lightLevel((blockState) -> 1)));

    // Lamp
    public static final Block BLOCK_FLUORESCENT_LAMP = register("fluorescent_lamp", new BlockFluorescentLamp());
    // Train bumpers
    public static final Block BLOCK_BUMPER = register("bumper", new BlockBumper());
    // Cameras
    public static final Block BLOCK_CAMERA_CEILING = register("camera_ceiling", new BlockCameraCeiling());

    // Turnstile
    public static final Block BLOCK_TURNSTILE = register("turnstile", new BlockTurnstile(false));
    public static final Block BLOCK_TURNSTILE_IC_ONLY = register("turnstile_ic_only", new BlockTurnstile(true));

    // Sign
    public static final Block BLOCK_SIGN_NO_PHOTO = register("sign_no_photo", new BlockSign(BlockBehaviour.Properties.of(Material.METAL).strength(6.0f)));

    // PIDS
//    public static final Block BLOCK_PIDS_1 = register("pids_1", new BlockMetroPIDSOne());

    // Platform Fence door
    public static final Block BLOCK_PSD_JR_DOOR_1 = register("psd_jr_door_1", new BlockPSDSmallDoorSemiAuto(BlockBehaviour.Properties.of(Material.METAL).strength(6.0f)));
    public static final Block BLOCK_PSD_JR_DOOR_2 = register("psd_jr_door_2", new BlockPSDSmallDoorSemiAuto(BlockBehaviour.Properties.of(Material.METAL).strength(6.0f)));
    public static final Block BLOCK_PSD_JR_FENCE_1 = register("psd_jr_fence_1", new BlockPSDSmallFenceSemiAuto(BlockBehaviour.Properties.of(Material.METAL).strength(6.0f)));
    public static final Block BLOCK_PSD_JR_FENCE_2 = register("psd_jr_fence_2", new BlockPSDSmallFenceSemiAuto(BlockBehaviour.Properties.of(Material.METAL).strength(6.0f)));

    // Monitor
    public static final Block BLOCK_ITV_MONITOR = register("itv_monitor", new BlockITVMonitor());

    // Security instruments
    public static final Block BLOCK_SECURITY_DOOR = register("security_door", new BlockSecurityDoor());
    public static final Block BLOCK_SECURITY_INSPECTION_MACHINE = register("security_inspection_machine", new BlockSecurityInspectionMachine());

    /* =========== *
     * Decorations *
     * =========== */
    // Concrete
    public static final Block BLOCK_CONCRETE = register("concrete", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.LIGHT_GRAY).strength(6.0f)));

    // Platform
    public static final Block BLOCK_PLATFORM_A = register("platform_a", new BlockMetroPlatform(BlockBehaviour.Properties.of(Material.STONE, DyeColor.LIGHT_GRAY).strength(6.0f)));

    // Tiles
    // White
    public static final Block BLOCK_TILES_WHITE = register("tiles_white", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.WHITE).strength(6.0f)));
    public static final Block BLOCK_TILES_LARGE_WHITE = register("tiles_large_white", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.WHITE).strength(6.0f)));
    public static final Block BLOCK_TILES_HORIZONTAL_WHITE = register("tiles_horizontal_white", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.WHITE).strength(6.0f)));
    public static final Block BLOCK_TILES_SMALL_WHITE = register("tiles_small_white", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.WHITE).strength(6.0f)));
    // Gray
    public static final Block BLOCK_TILES_GRAY = register("tiles_gray", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.GRAY).strength(6.0f)));
    public static final Block BLOCK_TILES_HORIZONTAL_GRAY = register("tiles_horizontal_gray", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.GRAY).strength(6.0f)));
    public static final Block BLOCK_TILES_SMALL_GRAY = register("tiles_small_gray", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.GRAY).strength(6.0f)));
    // Cordon line
    public static final Block BLOCK_CORDON_YELLOW_BLACK = register("cordon_yellow_black", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.YELLOW).strength(6.0f)));
    public static final Block BLOCK_CORDON_YELLOW_WHITE = register("cordon_yellow_white", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.YELLOW).strength(6.0f)));
    public static final Block BLOCK_CORDON_RED_BLACK = register("cordon_red_black", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.RED).strength(6.0f)));
    public static final Block BLOCK_CORDON_RED_WHITE = register("cordon_red_white", new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.RED).strength(6.0f)));

    // Bench
    public static final Block BLOCK_BENCH = register("bench", new BlockBench(BlockBehaviour.Properties.of(Material.METAL, DyeColor.LIGHT_GRAY).strength(6.0f)));

    // TODO: Blind path
//    public static final Block BLOCK_BLIND_PATH_STRIP = register("blind_path_strip", new BlockHorizontalAxis(AbstractBlock.Settings.of(Material.STONE, DyeColor.YELLOW)));
//    public static final Block BLOCK_BLIND_PATH_POINT = register("blind_path_point", new Block(AbstractBlock.Settings.of(Material.STONE, DyeColor.YELLOW)));

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(Metropolis.MOD_ID, id), block);
    }

    public static void initialize() {
        Metropolis.LOGGER.info("Initializing Blocks");
    }
}
