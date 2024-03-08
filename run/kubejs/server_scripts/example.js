// priority: 0

// Visit the wiki for more info - https://kubejs.com/

console.info('Hello, World! (Loaded server scripts)')

ServerEvents.recipes((event) => {
    // Atomizer >> Item <-- Fluid
	event.recipes.alchemistry.atomizer('minecraft:iron_ingot' ,Fluid.of('minecraft:water',200))

	// Liquifier >> Fluid <-- Item
	event.recipes.alchemistry.liquifier(Fluid.of('minecraft:water',200), Item.of('minecraft:iron_ingot', 3))
	event.recipes.alchemistry.liquifier(Fluid.of('minecraft:water',200), 'minecraft:gold_ingot')

	// Fusion >> Item <-- Item + Item
	event.recipes.alchemistry.fusion('minecraft:iron_ingot', 'minecraft:gold_ingot', 'minecraft:diamond')

	// Fission >> Item + Item <-- Item
	event.recipes.alchemistry.fission('minecraft:diamond', 'minecraft:iron_ingot', 'minecraft:gold_ingot')

	// Compactor >> Item <-- Item
	event.recipes.alchemistry.compactor('minecraft:gold_ingot', Item.of('minecraft:iron_ingot', 3))

	// Combiner >> Item <-- Item[]
	event.recipes.alchemistry.combiner('minecraft:iron_ingot', [Item.of('minecraft:gold_ingot', 4), Item.of('minecraft:diamond', 6)])
})