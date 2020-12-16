val welcomeRecipeMaker : String = ":: Welcome to Recipe Maker ::"
val exit               : String = "GoodBye see you"
val view_my_recipies   : String = "See my recipes with"
val paragraph : String = """
    Select an option
    1. Make a recipe
    2. See my recipes
    3. Exit
""".trimIndent()
val error_valdiate : String = "Enter a valid option"
val listIngredients : List<String> = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereales",
    "Huevos", "Aceite")

fun main(args: Array<String>) {

    println("$welcomeRecipeMaker \n $paragraph")

    val answer:String? = readLine()
    //
    when(readLine()){

        "1" -> println(products())
        "2" -> println(recipes(null))
        "3" -> {
            println(exit)
            }
        else -> println(error_valdiate)
    }

}

fun products(){
    // Print list of menu products
    // With foreach
    listIngredients.forEachIndexed { index, element ->
        println("$index: $element")
    }
    // With For
    for ((index,option) in listIngredients.withIndex()){
        if(index != 0)
            println("$index: $option ")
    }

    val response:String? = readLine()
    val recipe = listIngredients[response?.toInt()!!]
    recipes(recipe.toString())

}


fun recipes(recipe:String?){

    if (recipe != null){
        println("Ver mis recetas con: $recipe")
    }

}