package io.klebe.kjsalchemistry.schema;

import dev.latvian.mods.kubejs.fluid.InputFluid;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import io.klebe.kjsalchemistry.recipe.AlchemistryRecipeJS;

public interface AtomizerRecipeSchema{
    RecipeKey<InputFluid> INPUT = FluidComponents.INPUT.key("input");
    RecipeKey<OutputItem> RESULT = ItemComponents.OUTPUT.key("result");
    RecipeSchema SCHEMA = new RecipeSchema(AlchemistryRecipeJS.class, AlchemistryRecipeJS::new, RESULT, INPUT);
}
