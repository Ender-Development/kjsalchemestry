package io.klebe.kjsalchemistry.schema;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import io.klebe.kjsalchemistry.recipe.LiquifierRecipeJS;

public interface CombinerRecipeSchema {
    RecipeKey<InputItem[]> INPUTS = ItemComponents.INPUT_ARRAY.key("input");
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result");

    RecipeSchema SCHEMA = new RecipeSchema(LiquifierRecipeJS.class, LiquifierRecipeJS::new, RESULT, INPUTS);
}
