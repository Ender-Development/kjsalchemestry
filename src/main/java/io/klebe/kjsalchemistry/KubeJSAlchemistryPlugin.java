package io.klebe.kjsalchemistry;

import com.smashingmods.alchemistry.Alchemistry;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeNamespace;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;

import static com.smashingmods.alchemistry.registry.RecipeRegistry.DISSOLVER_TYPE;

public class KubeJSAlchemistryPlugin extends KubeJSPlugin {
    public static EventGroup GROUP = EventGroup.of("AlchemistryEvents");

    @Override
    public void registerEvents() {
        GROUP.register();
    }

    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        RecipeNamespace namespace = event.namespace(Alchemistry.MODID);
        namespace.register(DISSOLVER_TYPE.getId().getPath(), DissolverRecipeSchema.SCHEMA);
    }


    public interface DissolverRecipeSchema {
        RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input");
        RecipeKey<RecipeComponentBuilderMap[]> OUTPUT_GROUPS = RecipeComponent.builder()
                .add(NumberComponent.floatRange(0f,100f).key("probability"))
                .add(ItemComponents.OUTPUT_ARRAY.key("results"))
                .asArray()
                .key("groups");

        RecipeKey<RecipeComponentBuilderMap> OUTPUT = RecipeComponent.builder()
                .add(OUTPUT_GROUPS)
                .add(NumberComponent.ANY_INT.key("rolls"))
                .add(BooleanComponent.BOOLEAN.key("weighted"))
                .key("output");

        RecipeSchema SCHEMA = new RecipeSchema(INPUT, OUTPUT);
    }
}
