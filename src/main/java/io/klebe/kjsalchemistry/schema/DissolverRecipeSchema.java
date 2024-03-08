package io.klebe.kjsalchemistry.schema;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import io.klebe.kjsalchemistry.recipe.AlchemistryRecipeJS;

public interface DissolverRecipeSchema {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input");
    RecipeKey<RecipeComponentBuilderMap[]> OUTPUT_GROUPS = RecipeComponent.builder()
            .add(NumberComponent.floatRange(0f, 100f).key("probability"))
            .add(ItemComponents.OUTPUT_ARRAY.key("results"))
            .asArray()
            .key("groups");

    RecipeKey<RecipeComponentBuilderMap> OUTPUT = RecipeComponent.builder()
            .add(OUTPUT_GROUPS)
            .add(NumberComponent.ANY_INT.key("rolls"))
            .add(BooleanComponent.BOOLEAN.key("weighted"))
            .key("output");

    RecipeSchema SCHEMA = new RecipeSchema(AlchemistryRecipeJS.class, AlchemistryRecipeJS::new, INPUT, OUTPUT);
}
