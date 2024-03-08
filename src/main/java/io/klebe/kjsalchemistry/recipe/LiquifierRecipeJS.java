package io.klebe.kjsalchemistry.recipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.latvian.mods.kubejs.item.InputItem;

public class LiquifierRecipeJS extends AlchemistryRecipeJS {
    @Override
    public JsonElement writeInputItem(InputItem value) {
        var json = new JsonObject();
        json.add("ingredient", value.ingredient.toJson());
        json.addProperty("count", value.count);
        return json;
    }
}
