package io.klebe.kjsalchemistry.schema;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import io.klebe.kjsalchemistry.recipe.FusionRecipeJS;

public interface FissonRecipeSchema {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input");
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("output1");
    RecipeKey<OutputItem> RESULT2 = ItemComponents.OUTPUT.key("output2");

    RecipeSchema SCHEMA = new RecipeSchema(FusionRecipeJS.class, FusionRecipeJS::new, RESULT, RESULT2, INPUT);
}
