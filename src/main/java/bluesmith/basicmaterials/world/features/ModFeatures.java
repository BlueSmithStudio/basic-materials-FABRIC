package bluesmith.basicmaterials.world.features;

import bluesmith.basicmaterials.BasicMaterials;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.function.BiConsumer;

public class ModFeatures {

    public static void placeFeaturesInBiomes() {

        BiomeModifications.create(new Identifier(BasicMaterials.MOD_ID, "geode_additions"))
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.IS_OVERWORLD),
                        modifier(
                                ModPlacedFeatures.DIAMOND_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )

                )
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.ANCIENT_CITY_HAS_STRUCTURE),
                        modifier(
                                ModPlacedFeatures.ECHO_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )
                )
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.IS_HILL),
                        modifier(
                                ModPlacedFeatures.EMERALD_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )
                )
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.IS_OCEAN),
                        modifier(
                                ModPlacedFeatures.LAPIS_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )
                )
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.IS_NETHER),
                        modifier(
                                ModPlacedFeatures.NETHERITE_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )
                )
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.IS_NETHER),
                        modifier(
                                ModPlacedFeatures.QUARTZ_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )
                )
                .add(
                        ModificationPhase.ADDITIONS,
                        BiomeSelectors.tag(BiomeTags.IS_OVERWORLD),
                        modifier(
                                ModPlacedFeatures.REDSTONE_GEODE,
                                GenerationStep.Feature.UNDERGROUND_DECORATION,
                                true

                        )
                );
    }

    private static BiConsumer<BiomeSelectionContext, BiomeModificationContext> modifier(
            RegistryKey<PlacedFeature> feature,
            GenerationStep.Feature step,
            boolean shouldAdd
    ) {
        return (biomeSelectionContext, biomeModificationContext) -> {
            if (shouldAdd) {
                biomeModificationContext.getGenerationSettings().addFeature(
                        step,
                        feature
                );
            }
        };
    }
}
