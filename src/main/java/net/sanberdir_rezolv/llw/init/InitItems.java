package net.sanberdir_rezolv.llw.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir_rezolv.llw.LLW;
import net.sanberdir_rezolv.llw.init.customitems.*;
import net.sanberdir_rezolv.llw.init.customitems.PotionsMod;
import net.sanberdir_rezolv.llw.init.sound.InitSounds;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LLW.MODID);

    // Добавление блока\предмета

    // Калитки
    // Азуровое дерево
    public static final RegistryObject<Item> AZURE_HARD_BARK_FENCE = ITEMS.register("azure_hard_bark_fence",
            () -> new BurnFences(InitBlocks.AZURE_HARD_BARK_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> AZURE_HARD_BARK_FENCE_GATE = ITEMS.register("azure_hard_bark_fence_gate",
            () -> new BurnFences(InitBlocks.AZURE_HARD_BARK_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Брандросс
    public static final RegistryObject<Item> BRANDRHOSS_FENCE = ITEMS.register("brandrhoss_fence",
            () -> new BurnFences(InitBlocks.BRANDRHOSS_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> BRANDRHOSS_FENCE_GATE = ITEMS.register("brandrhoss_fence_gate",
            () -> new BurnFences(InitBlocks.BRANDRHOSS_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Мирталий
    public static final RegistryObject<Item> MIRTALIY_FENCE = ITEMS.register("mirtaliy_fence",
            () -> new BurnFences(InitBlocks.MIRTALIY_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> MIRTALIY_FENCE_GATE = ITEMS.register("mirtaliy_fence_gate",
            () -> new BurnFences(InitBlocks.MIRTALIY_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Тёмная берёза
    public static final RegistryObject<Item> DARK_BIRCH_FENCE = ITEMS.register("dark_birch_fence",
            () -> new BurnFences(InitBlocks.DARK_BIRCH_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> DARK_BIRCH_FENCE_GATE = ITEMS.register("dark_birch_fence_gate",
            () -> new BurnFences(InitBlocks.DARK_BIRCH_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар
    public static final RegistryObject<Item> ELENGAR_FENCE = ITEMS.register("elengar_fence",
            () -> new BurnFences(InitBlocks.ELENGAR_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> ELENGAR_FENCE_GATE = ITEMS.register("elengar_fence_gate",
            () -> new BurnFences(InitBlocks.ELENGAR_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный киноварью
    public static final RegistryObject<Item> SOAKED_IN_CINNABAR_ELENGAR_FENCE = ITEMS.register("soaked_in_cinnabar_elengar_fence",
            () -> new BurnFences(InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SOAKED_IN_CINNABAR_ELENGAR_FENCE_GATE = ITEMS.register("soaked_in_cinnabar_elengar_fence_gate",
            () -> new BurnFences(InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный медью
    public static final RegistryObject<Item> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE = ITEMS.register("soaked_with_copper_sediment_elengar_fence",
            () -> new BurnFences(InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE_GATE = ITEMS.register("soaked_with_copper_sediment_elengar_fence_gate",
            () -> new BurnFences(InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Нажимные плиты
    // Эленгар
    public static final RegistryObject<Item> ELENGAR_PRESSURE_PLATE = ITEMS.register("elengar_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.ELENGAR_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный киноварью
    public static final RegistryObject<Item> SOAKED_IN_CINNABAR_ELENGAR_PRESSURE_PLATE = ITEMS.register("soaked_in_cinnabar_elengar_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.SOAKED_IN_CINNABAR_ELENGAR_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар пропитанный медью
    public static final RegistryObject<Item> SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PRESSURE_PLATE = ITEMS.register("soaked_with_copper_sediment_elengar_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.SOAKED_WITH_COPPER_SEDIMENT_ELENGAR_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Брандросс
    public static final RegistryObject<Item> BRANDRHOSS_PRESSURE_PLATE = ITEMS.register("brandrhoss_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.BRANDRHOSS_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Азуровый
    public static final RegistryObject<Item> AZURE_HARD_BARK_PRESSURE_PLATE = ITEMS.register("azure_hard_bark_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.AZURE_HARD_BARK_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Азуровый
    public static final RegistryObject<Item> DARK_BIRCH_PRESSURE_PLATE = ITEMS.register("dark_birch_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.DARK_BIRCH_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Мирталий
    public static final RegistryObject<Item> MIRTALIY_PRESSURE_PLATE = ITEMS.register("mirtaliy_pressure_plate",
            () -> new BurnPressurePlates(InitBlocks.MIRTALIY_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Деревья
    // Азуровое дерево
    public static final RegistryObject<Item> AZURE_HARD_BARK_SAPLING = ITEMS.register("azure_hard_bark_sapling",
            () -> new BurnSapling(InitBlocks.AZURE_HARD_BARK_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> AZURE_HARD_BARK_LEAVES = ITEMS.register("azure_hard_bark_leaves",
            () -> new BurnLeaves(InitBlocks.AZURE_HARD_BARK_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Брандроссовое дерево
    public static final RegistryObject<Item> BRANDRHOSS_SAPLING = ITEMS.register("brandrhoss_sapling",
            () -> new BurnSapling(InitBlocks.BRANDRHOSS_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> BRANDRHOSS_LEAVES = ITEMS.register("brandrhoss_leaves",
            () -> new BurnLeaves(InitBlocks.BRANDRHOSS_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Мирталиевое дерево
    public static final RegistryObject<Item> MIRTALIY_SAPLING = ITEMS.register("mirtaliy_sapling",
            () -> new BurnSapling(InitBlocks.MIRTALIY_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> MIRTALIY_LEAVES = ITEMS.register("mirtaliy_leaves",
            () -> new BurnLeaves(InitBlocks.MIRTALIY_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Тёмная берёза
    public static final RegistryObject<Item> DARK_BIRCH_SAPLING = ITEMS.register("dark_birch_sapling",
            () -> new BurnSapling(InitBlocks.DARK_BIRCH_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> DARK_BIRCH_LEAVES = ITEMS.register("dark_birch_leaves",
            () -> new BurnLeaves(InitBlocks.DARK_BIRCH_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Эленгар
    public static final RegistryObject<Item> ELENGAR_SAPLING = ITEMS.register("elengar_sapling",
            () -> new BurnSapling(InitBlocks.ELENGAR_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> ELENGAR_LEAVES = ITEMS.register("elengar_leaves",
            () -> new BurnLeaves(InitBlocks.ELENGAR_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Семена
    public static final RegistryObject<Item> PURE_FRUIT_SEEDS = ITEMS.register("pure_fruit_seeds",
            () -> new ItemNameBlockItem(InitBlocks.PURE_FRUIT_SEEDS.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS))));

    // Добавление предмета
    // Еда
    public static final RegistryObject<Item> PURE_FRUIT = ITEMS.register("pure_fruit",
            () -> new Item (new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(6).build())
                    .tab(ModCreativeModeTab.LLW_ITEMS)));

    // Пластинки
    // Зов предков
    public static final RegistryObject<Item> MUSIC_DISC_THE_CALL_OF_THE_ANCESTORS = ITEMS.register("music_disc_the_call_of_the_ancestors",
            () -> new RecordItem(4, InitSounds.DISC_THE_CALL_OF_THE_ANCESTORS,
                    new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1),60));

    public static final RegistryObject<Item> MUSIC_DISC_THE_WHISPER_OF_ANCIENT_STONES = ITEMS.register("music_disc_the_whisper_of_ancient_stones",
            () -> new RecordItem(2, InitSounds.DISC_THE_WHISPER_OF_ANCIENT_STONES,
                    new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1),60));

    // Дневник
    public static final RegistryObject<Item> MAGIC_BOOK = ITEMS.register("magic_book",
            () -> new MagicBook( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));

    // Простые предметы
    public static final RegistryObject<Item> VERMILION = ITEMS.register("vermilion",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> COPPER_PRECIPITATE = ITEMS.register("copper_precipitate",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> PITCH_ELENGAR = ITEMS.register("pitch_elengar",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ELENGAR_BARK = ITEMS.register("elengar_bark",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> PRIMORDIAL_FIRE = ITEMS.register("primordial_fire",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MOON_TEAR = ITEMS.register("moon_tear",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MOON_TEAR_POWDER = ITEMS.register("moon_tear_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> SHARD_CHITIN_REAPER = ITEMS.register("shard_chitin_reaper",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ELVEN_DUST = ITEMS.register("elven_dust",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CHALK = ITEMS.register("chalk",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> BLUE_CHALK = ITEMS.register("blue_chalk",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> RED_CHALK = ITEMS.register("red_chalk",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> GOLDEN_CHALK = ITEMS.register("golden_chalk",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> RAW_MALACHITE = ITEMS.register("raw_malachite",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> INKWELL = ITEMS.register("inkwell",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS).stacksTo(1).defaultDurability(120)));
    public static final RegistryObject<Item> GOLDEN_CAP = ITEMS.register("golden_cap",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> IRON_CAP = ITEMS.register("iron_cap",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MOON_TEAR_CAP = ITEMS.register("moon_tear_cap",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> PESTLE = ITEMS.register("pestle",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> FOCUSING_LENS = ITEMS.register("focusing_lens",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> THE_LENS_OF_REVELATION = ITEMS.register("the_lens_of_revelation",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> SCROLL = ITEMS.register("scroll",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> GOLDEN_LEAF = ITEMS.register("golden_leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",
            () -> new BurnLite(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).build()).tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> STAR_MOSS = ITEMS.register("star_moss",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MAGIC_CLOTH = ITEMS.register("magic_cloth",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> STONE_OF_TRANSFORMATION = ITEMS.register("stone_of_transformation",
            () -> new Item(new Item.Properties().defaultDurability(80).tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> ALCHEMICAL_SILVER = ITEMS.register("alchemical_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> LIQUID_SILVER = ITEMS.register("liquid_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> WING_OF_THE_MOON_MOTH = ITEMS.register("wing_of_the_moon_moth",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MIRACULUM_FLAMAS = ITEMS.register("miraculum_flammas",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CINNABAR = ITEMS.register("cinnabar",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> OLERESIN_OF_THE_MOTHER_OF_THE_FOREST = ITEMS.register("oleoresin_of_the_mother_of_the_forest",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> THE_BRANCH_OF_THE_MOTHER_OF_THE_FOREST = ITEMS.register("the_branch_of_the_mother_of_the_forest",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    public static final RegistryObject<Item> CRYSTAL_HEART_OF_THE_GUARDIAN_GOLEM = ITEMS.register("crystal_heart_of_the_guardian_golem",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ITEMS)));
    

    //Алхимия
    public static final RegistryObject<Item> CRYSTAL_PHIAL = ITEMS.register("crystal_phial",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> PHOSPHORUS = ITEMS.register("phosphorus",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> NIGREDO = ITEMS.register("nigredo",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> ANCIENT_POT = ITEMS.register("ancient_pot",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> FIRE_POT = ITEMS.register("fire_pot",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POT_OF_POISON = ITEMS.register("pot_of_poison",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));

    // Цветы
    public static final RegistryObject<Item> SUNFLOWER = ITEMS.register("sunflower",
            () -> new BlockItem(InitBlocks.SUNFLOWER.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> BLACK_TOADSTOOL = ITEMS.register("black_toadstool",
            () -> new BlockItem(InitBlocks.BLACK_TOADSTOOL.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SILVER_SAGE = ITEMS.register("silver_sage",
            () -> new BlockItem(InitBlocks.SILVER_SAGE.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> ICY_YAWN = ITEMS.register("icy_yawn",
            () -> new BlockItem(InitBlocks.ICY_YAWN.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> SLEEPY_LEAF = ITEMS.register("sleepy_leaf",
            () -> new BlockItem(InitBlocks.SLEEPY_LEAF.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));
    public static final RegistryObject<Item> THE_CALL_OF_THE_ANCESTORS = ITEMS.register("the_call_of_the_ancestors",
            () -> new BlockItem(InitBlocks.THE_CALL_OF_THE_ANCESTORS.get(),(new Item.Properties().tab(ModCreativeModeTab.LLW_BLOCKS))));

    // Зелья
    public static final RegistryObject<Item> POTION_STONE_SKIN = ITEMS.register("potion_stone_skin",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_CHEERFULNESS = ITEMS.register("potion_cheerfulness",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_CAT_VISION = ITEMS.register("potion_cat_vision",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_OF_IMPETUOSITY = ITEMS.register("potion_of_impetuosity",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.JUMP, 2400, 1), 1F)
                    .build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> THE_SMELL_OF_LOVE = ITEMS.register("the_smell_of_love",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> ALCHEMICAL_INFUSION = ITEMS.register("alchemical_infusion",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_HEALING = ITEMS.register("potion_healing",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.HEAL, 1, 0), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_HEALING_MEDIUM = ITEMS.register("potion_healing_medium",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.HEAL, 1, 1), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_HEALING_LARGE = ITEMS.register("potion_healing_large",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.HEAL, 1, 2), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> POTION_ABSORPTION = ITEMS.register("potion_absorption",
            () -> new PotionsMod( new Item.Properties().food(new FoodProperties.Builder().nutrition(0).saturationMod(0).fast().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1F).build()).tab(ModCreativeModeTab.LLW_ALCHEMY)));
    public static final RegistryObject<Item> ENTROPY_POTION = ITEMS.register("entropy_potion",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.LLW_ALCHEMY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
