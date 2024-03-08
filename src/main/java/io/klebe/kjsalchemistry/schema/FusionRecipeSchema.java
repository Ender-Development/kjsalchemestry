package io.klebe.kjsalchemistry.schema;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import io.klebe.kjsalchemistry.recipe.FusionRecipeJS;

public interface FusionRecipeSchema {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input1");
    RecipeKey<InputItem> INPUT2 = ItemComponents.INPUT.key("input2");
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("output");
    RecipeSchema SCHEMA = new RecipeSchema(FusionRecipeJS.class, FusionRecipeJS::new, RESULT, INPUT, INPUT2);
}
