package io.klebe.kjsalchemistry.schema;

import dev.latvian.mods.kubejs.fluid.OutputFluid;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.FluidComponents;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import io.klebe.kjsalchemistry.recipe.AlchemistryRecipeJS;
import io.klebe.kjsalchemistry.recipe.LiquifierRecipeJS;

public interface LiquifierRecipeSchema {
    RecipeKey<InputItem> INPUT = ItemComponents.INPUT.key("input");
    RecipeKey<OutputFluid> RESULT = FluidComponents.OUTPUT.key("result");

    RecipeSchema SCHEMA = new RecipeSchema(LiquifierRecipeJS.class, LiquifierRecipeJS::new, RESULT, INPUT);
}
