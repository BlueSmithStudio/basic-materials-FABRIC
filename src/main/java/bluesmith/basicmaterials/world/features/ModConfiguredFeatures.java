package bluesmith.basicmaterials.world.features;

import bluesmith.basicmaterials.BasicMaterials;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> DIAMOND_GEODE = of("diamond_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ECHO_GEODE = of("echo_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EMERALD_GEODE = of("emerald_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPIS_GEODE = of("lapis_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERITE_GEODE = of("netherite_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_GEODE = of("quartz_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDSTONE_GEODE = of("redstone_geode");


    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BasicMaterials.MOD_ID, id));
    }
}
