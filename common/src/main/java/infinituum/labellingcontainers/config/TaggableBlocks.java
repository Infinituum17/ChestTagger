package infinituum.labellingcontainers.config;

import com.google.common.collect.ImmutableSet;

import java.util.Set;


public class TaggableBlocks {
    /**
     * '{@code true}' if only certain blocks can be tagged, '{@code false}' otherwise<br/>
     * <b>Default</b>: {@code true}
     */
    private boolean hasTagsLimit = true;
    /**
     * If {@link TaggableBlocks#hasTagsLimit} is '{@code true}', then only this variable's ids are taggable
     */
    private Set<String> taggableIds = ImmutableSet.<String>builder()
            // Minecraft
            .add("minecraft:chest")
            .add("minecraft:furnace")
            .add("minecraft:beacon")
            .add("minecraft:ender_chest")
            .add("minecraft:barrel")
            .add("minecraft:smoker")
            .add("minecraft:blast_furnace")
            .add("minecraft:dispenser")
            .add("minecraft:dropper")
            .add("minecraft:trapped_chest")
            .add("minecraft:conduit")
            .add("minecraft:brewing_stand")
            .add("minecraft:cauldron")
            .add("minecraft:shulker_box")
            .add("minecraft:white_shulker_box")
            .add("minecraft:orange_shulker_box")
            .add("minecraft:magenta_shulker_box")
            .add("minecraft:light_blue_shulker_box")
            .add("minecraft:yellow_shulker_box")
            .add("minecraft:lime_shulker_box")
            .add("minecraft:pink_shulker_box")
            .add("minecraft:gray_shulker_box")
            .add("minecraft:light_gray_shulker_box")
            .add("minecraft:cyan_shulker_box")
            .add("minecraft:purple_shulker_box")
            .add("minecraft:blue_shulker_box")
            .add("minecraft:brown_shulker_box")
            .add("minecraft:green_shulker_box")
            .add("minecraft:red_shulker_box")
            .add("minecraft:black_shulker_box")
            .add("minecraft:lectern")
            .add("minecraft:hopper")
            .add("minecraft:daylight_detector")
            .add("minecraft:beehive")
            // Iron Chests: Restocked
            .add("ironchests:copper_barrel")
            .add("ironchests:iron_barrel")
            .add("ironchests:gold_barrel")
            .add("ironchests:diamond_barrel")
            .add("ironchests:netherite_barrel")
            .add("ironchests:crystal_barrel")
            .add("ironchests:obsidian_barrel")
            .add("ironchests:dirt_chest")
            .add("ironchests:copper_chest")
            .add("ironchests:iron_chest")
            .add("ironchests:gold_chest")
            .add("ironchests:diamond_chest")
            .add("ironchests:netherite_chest")
            .add("ironchests:crystal_chest")
            .add("ironchests:obsidian_chest")
            // Echo Chest
            .add("echochest:echo_chest")
            // Nether Chested
            .add("netherchested:nether_chest")
            // More Chests
            .add("more_chests:acacia_plank_chest")
            .add("more_chests:birch_plank_chest")
            .add("more_chests:crimson_plank_chest")
            .add("more_chests:dark_oak_plank_chest")
            .add("more_chests:jungle_plank_chest")
            .add("more_chests:mangrove_plank_chest")
            .add("more_chests:oak_plank_chest")
            .add("more_chests:spruce_plank_chest")
            .add("more_chests:warped_plank_chest")
            .add("more_chests:light_gray_wool_chest")
            .add("more_chests:gray_wool_chest")
            .add("more_chests:pink_wool_chest")
            .add("more_chests:lime_wool_chest")
            .add("more_chests:yellow_wool_chest")
            .add("more_chests:light_blue_wool_chest")
            .add("more_chests:magenta_wool_chest")
            .add("more_chests:orange_wool_chest")
            .add("more_chests:white_wool_chest")
            .add("more_chests:exposed_copper_chest")
            .add("more_chests:copper_chest")
            .add("more_chests:black_wool_chest")
            .add("more_chests:red_wool_chest")
            .add("more_chests:green_wool_chest")
            .add("more_chests:brown_wool_chest")
            .add("more_chests:blue_wool_chest")
            .add("more_chests:purple_wool_chest")
            .add("more_chests:cyan_wool_chest")
            .add("more_chests:netherite_chest")
            .add("more_chests:diamond_chest")
            .add("more_chests:gold_chest")
            .add("more_chests:iron_chest")
            .add("more_chests:waxed_oxidized_copper_chest")
            .add("more_chests:waxed_weathered_copper_chest")
            .add("more_chests:waxed_exposed_copper_chest")
            .add("more_chests:waxed_copper_chest")
            .add("more_chests:oxidized_copper_chest")
            .add("more_chests:weathered_copper_chest")
            // More Chest Variants
            .add("lolmcv:crimson_chest")
            .add("lolmcv:bamboo_chest")
            .add("lolmcv:cherry_chest")
            .add("lolmcv:mangrove_chest")
            .add("lolmcv:dark_oak_chest")
            .add("lolmcv:acacia_chest")
            .add("lolmcv:jungle_chest")
            .add("lolmcv:birch_chest")
            .add("lolmcv:spruce_chest")
            .add("lolmcv:warped_chest")
            .add("lolmcv:warped_trapped_chest")
            .add("lolmcv:crimson_trapped_chest")
            .add("lolmcv:mangrove_trapped_chest")
            .add("lolmcv:dark_oak_trapped_chest")
            .add("lolmcv:acacia_trapped_chest")
            .add("lolmcv:jungle_trapped_chest")
            .add("lolmcv:birch_trapped_chest")
            .add("lolmcv:spruce_trapped_chest")
            .add("lolmcv:oak_trapped_chest")
            .add("lolmcv:oak_chest")
            // Variant Barrels
            .add("variantbarrels:acacia_barrel")
            .add("variantbarrels:birch_barrel")
            .add("variantbarrels:dark_oak_barrel")
            .add("variantbarrels:jungle_barrel")
            .add("variantbarrels:oak_barrel")
            .add("variantbarrels:mangrove_barrel")
            .add("variantbarrels:crimson_barrel")
            .add("variantbarrels:warped_barrel")
            // Compact Storage
            .add("compact_storage:compact_chest_yellow")
            .add("compact_storage:compact_barrel_light_blue")
            .add("compact_storage:compact_chest_light_blue")
            .add("compact_storage:compact_barrel_magenta")
            .add("compact_storage:compact_chest_magenta")
            .add("compact_storage:compact_barrel_orange")
            .add("compact_storage:compact_chest_orange")
            .add("compact_storage:compact_barrel_white")
            .add("compact_storage:compact_chest_white")
            .add("compact_storage:compact_barrel_light_gray")
            .add("compact_storage:compact_chest_light_gray")
            .add("compact_storage:compact_barrel_gray")
            .add("compact_storage:compact_chest_gray")
            .add("compact_storage:compact_barrel_pink")
            .add("compact_storage:compact_chest_pink")
            .add("compact_storage:compact_barrel_lime")
            .add("compact_storage:compact_chest_lime")
            .add("compact_storage:compact_barrel_yellow")
            .add("compact_storage:compact_chest_green")
            .add("compact_storage:compact_barrel_brown")
            .add("compact_storage:compact_chest_brown")
            .add("compact_storage:compact_barrel_blue")
            .add("compact_storage:compact_chest_blue")
            .add("compact_storage:compact_barrel_purple")
            .add("compact_storage:compact_chest_cyan")
            .add("compact_storage:compact_barrel_cyan")
            .add("compact_storage:compact_chest_purple")
            .add("compact_storage:compact_barrel_black")
            .add("compact_storage:compact_chest_black")
            .add("compact_storage:compact_barrel_red")
            .add("compact_storage:compact_chest_red")
            .add("compact_storage:compact_barrel_green")
            // Supplementaries
            .add("supplementaries:present_gray")
            .add("supplementaries:present_pink")
            .add("supplementaries:present_lime")
            .add("supplementaries:present_yellow")
            .add("supplementaries:present_light_blue")
            .add("supplementaries:present_magenta")
            .add("supplementaries:present_orange")
            .add("supplementaries:present_white")
            .add("supplementaries:present")
            .add("supplementaries:present_light_gray")
            .add("supplementaries:present_cyan")
            .add("supplementaries:present_purple")
            .add("supplementaries:present_brown")
            .add("supplementaries:present_blue")
            .add("supplementaries:present_red")
            .add("supplementaries:present_green")
            .add("supplementaries:present_black")
            .add("supplementaries:trapped_present_gray")
            .add("supplementaries:trapped_present_pink")
            .add("supplementaries:trapped_present_lime")
            .add("supplementaries:trapped_present_yellow")
            .add("supplementaries:trapped_present_light_blue")
            .add("supplementaries:trapped_present_magenta")
            .add("supplementaries:trapped_present_orange")
            .add("supplementaries:trapped_present_white")
            .add("supplementaries:trapped_present")
            .add("supplementaries:trapped_present_light_gray")
            .add("supplementaries:trapped_present_cyan")
            .add("supplementaries:trapped_present_purple")
            .add("supplementaries:trapped_present_brown")
            .add("supplementaries:trapped_present_blue")
            .add("supplementaries:trapped_present_red")
            .add("supplementaries:trapped_present_green")
            .add("supplementaries:trapped_present_black")
            .add("supplementaries:jar")
            .add("supplementaries:sack")
            .add("supplementaries:safe")
            .add("supplementaries:pedestal")
            .add("supplementaries:planter")
            .add("supplementaries:urn")
            .add("supplementaries:lock_block")
            // Iron Chest
            .add("ironchest:iron_chest")
            .add("ironchest:gold_chest")
            .add("ironchest:diamond_chest")
            .add("ironchest:copper_chest")
            .add("ironchest:crystal_chest")
            .add("ironchest:obsidian_chest")
            .add("ironchest:dirt_chest")
            .add("ironchest:trapped_iron_chest")
            .add("ironchest:trapped_gold_chest")
            .add("ironchest:trapped_diamond_chest")
            .add("ironchest:trapped_copper_chest")
            .add("ironchest:trapped_crystal_chest")
            .add("ironchest:trapped_obsidian_chest")
            .add("ironchest:trapped_dirt_chest")
            // Colossal Chests
            .add("colossalchests:chest_wall_wood")
            .add("colossalchests:chest_wall_copper")
            .add("colossalchests:chest_wall_iron")
            .add("colossalchests:chest_wall_silver")
            .add("colossalchests:chest_wall_gold")
            .add("colossalchests:chest_wall_diamond")
            .add("colossalchests:chest_wall_obsidian")
            .add("colossalchests:colossal_chest_wood")
            .add("colossalchests:colossal_chest_copper")
            .add("colossalchests:colossal_chest_iron")
            .add("colossalchests:colossal_chest_silver")
            .add("colossalchests:colossal_chest_gold")
            .add("colossalchests:colossal_chest_diamond")
            .add("colossalchests:colossal_chest_obsidian")
            .add("colossalchests:interface_wood")
            .add("colossalchests:interface_copper")
            .add("colossalchests:interface_iron")
            .add("colossalchests:interface_silver")
            .add("colossalchests:interface_gold")
            .add("colossalchests:interface_diamond")
            .add("colossalchests:interface_obsidian")
            .add("colossalchests:uncolossal_chest")
            .add("sophisticatedstorage:barrel")
            .add("sophisticatedstorage:copper_barrel")
            .add("sophisticatedstorage:iron_barrel")
            .add("sophisticatedstorage:gold_barrel")
            .add("sophisticatedstorage:diamond_barrel")
            .add("sophisticatedstorage:netherite_barrel")
            .add("sophisticatedstorage:limited_barrel_1")
            .add("sophisticatedstorage:limited_iron_barrel_1")
            .add("sophisticatedstorage:limited_copper_barrel_1")
            .add("sophisticatedstorage:limited_gold_barrel_1")
            .add("sophisticatedstorage:limited_diamond_barrel_1")
            .add("sophisticatedstorage:limited_netherite_barrel_1")
            .add("sophisticatedstorage:limited_barrel_2")
            .add("sophisticatedstorage:limited_copper_barrel_2")
            .add("sophisticatedstorage:limited_iron_barrel_2")
            .add("sophisticatedstorage:limited_gold_barrel_2")
            .add("sophisticatedstorage:limited_diamond_barrel_2")
            .add("sophisticatedstorage:limited_netherite_barrel_2")
            .add("sophisticatedstorage:limited_barrel_3")
            .add("sophisticatedstorage:limited_copper_barrel_3")
            .add("sophisticatedstorage:limited_iron_barrel_3")
            .add("sophisticatedstorage:limited_gold_barrel_3")
            .add("sophisticatedstorage:limited_diamond_barrel_3")
            .add("sophisticatedstorage:limited_netherite_barrel_3")
            .add("sophisticatedstorage:limited_barrel_4")
            .add("sophisticatedstorage:limited_copper_barrel_4")
            .add("sophisticatedstorage:limited_iron_barrel_4")
            .add("sophisticatedstorage:limited_gold_barrel_4")
            .add("sophisticatedstorage:limited_diamond_barrel_4")
            .add("sophisticatedstorage:limited_netherite_barrel_4")
            .add("sophisticatedstorage:chest")
            .add("sophisticatedstorage:copper_chest")
            .add("sophisticatedstorage:iron_chest")
            .add("sophisticatedstorage:gold_chest")
            .add("sophisticatedstorage:diamond_chest")
            .add("sophisticatedstorage:netherite_chest")
            .add("sophisticatedstorage:shulker_box")
            .add("sophisticatedstorage:copper_shulker_box")
            .add("sophisticatedstorage:iron_shulker_box")
            .add("sophisticatedstorage:gold_shulker_box")
            .add("sophisticatedstorage:diamond_shulker_box")
            .add("sophisticatedstorage:netherite_shulker_box")
            .build();

    public TaggableBlocks(boolean hasTagsLimit, Set<String> taggableIds) {
        this.hasTagsLimit = hasTagsLimit;
        this.taggableIds = taggableIds;
    }

    public TaggableBlocks() {
    }

    public boolean isLimited() {
        return hasTagsLimit;
    }

    public boolean hasId(String key) {
        return taggableIds.contains(key);
    }

    public void addId(String id) {
        taggableIds.add(id);
    }

    public void removeId(String id) {
        taggableIds.remove(id);
    }

    public Set<String> getIds() {
        return this.taggableIds;
    }

    public void setIds(Set<String> set) {
        this.taggableIds = set;
    }
}
