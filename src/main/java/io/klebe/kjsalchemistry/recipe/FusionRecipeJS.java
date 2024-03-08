package io.klebe.kjsalchemistry.recipe;

import com.google.gson.JsonElement;
import dev.latvian.mods.kubejs.item.OutputItem;

public class FusionRecipeJS extends AlchemistryRecipeJS {
    @Override
    public JsonElement writeOutputItem(OutputItem value) {
        var json = super.writeOutputItem(value).getAsJsonObject();
		if (json.has("count")) {
			json.remove("count");
		}
		return json;
    }
}
