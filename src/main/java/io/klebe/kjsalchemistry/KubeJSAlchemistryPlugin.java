package io.klebe.kjsalchemistry;

import com.smashingmods.alchemistry.Alchemistry;
import com.smashingmods.alchemistry.registry.RecipeRegistry;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.recipe.schema.RecipeNamespace;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import io.klebe.kjsalchemistry.schema.*;

import static com.smashingmods.alchemistry.registry.RecipeRegistry.*;

public class KubeJSAlchemistryPlugin extends KubeJSPlugin {
    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        RecipeNamespace namespace = event.namespace(Alchemistry.MODID);
        namespace.register(ATOMIZER_TYPE.getId().getPath(), AtomizerRecipeSchema.SCHEMA);
        namespace.register(COMBINER_TYPE.getId().getPath(), CombinerRecipeSchema.SCHEMA);
        namespace.register(COMPACTOR_TYPE.getId().getPath(), CompactorRecipeSchema.SCHEMA); // Currently bugged
        namespace.register(DISSOLVER_TYPE.getId().getPath(), DissolverRecipeSchema.SCHEMA); // Currently untested
        namespace.register(FISSION_TYPE.getId().getPath(), FissonRecipeSchema.SCHEMA); // Currently bugged
        namespace.register(FUSION_TYPE.getId().getPath(), FusionRecipeSchema.SCHEMA); // Currently bugged
        namespace.register(LIQUIFIER_TYPE.getId().getPath(), LiquifierRecipeSchema.SCHEMA);
    }
}
