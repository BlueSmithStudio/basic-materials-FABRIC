package bluesmith.basicmaterials.world.features;

import bluesmith.basicmaterials.BasicMaterials;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;


public class ModPlacedFeatures {



        public static final RegistryKey<PlacedFeature> DIAMOND_GEODE = of("diamond_geode");
        public static final RegistryKey<PlacedFeature> ECHO_GEODE = of("echo_geode");
        public static final RegistryKey<PlacedFeature> EMERALD_GEODE = of("emerald_geode");
        public static final RegistryKey<PlacedFeature> LAPIS_GEODE = of("lapis_geode");
        public static final RegistryKey<PlacedFeature> NETHERITE_GEODE = of("netherite_geode");
        public static final RegistryKey<PlacedFeature> QUARTZ_GEODE = of("quartz_geode");
        public static final RegistryKey<PlacedFeature> REDSTONE_GEODE = of("redstone_geode");

        public static RegistryKey<PlacedFeature> of(String id) {
            return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BasicMaterials.MOD_ID, id));
        }


}
