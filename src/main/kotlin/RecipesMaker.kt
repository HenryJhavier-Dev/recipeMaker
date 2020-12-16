import kotlin.system.exitProcess

const val welcomeRecipeMaker : String = ":: Welcome to Recipe Maker ::"
const val exit               : String = "GoodBye see you"
const val view_my_recipies   : String = "See my recipes with"
const val write_number       : String = "Write the product number"
val paragraph : String = """
   Select an option
    1. Create recipe
    2. See my list recipes
    3. Exit
""".trimIndent()
const val error_valdiate : String = "Enter a valid option"
const val error_product_list: String = "The product is not on the list"

val listIngredients : List<String> = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereales",
    "Huevos", "Aceite")

fun main(args: Array<String>) {


    MainBucle@ while (true) {

        println("$welcomeRecipeMaker \n $paragraph")

        val user_selection:String? = readLine()
        var user_selection_index = user_selection?.toInt() ?: -1

        when (user_selection_index){
            1 -> createRecipe()
            2 -> viewRecipes(null)
            3 -> {
                println(exit)
                exitProcess(0)
                break@MainBucle
            }
            else -> {
                println(error_valdiate)
            }
        }
    }

}

fun createRecipe(){
    // Print list of menu products
    // With foreach
    listIngredients.forEachIndexed { index, element ->
        println("Number Product: $index $element")
    }
    // With For
    /*for ((index,option) in listIngredients.withIndex()){
        if(index != 0)
            println("$index: $option ")
    }*/

    println(write_number)

    ProductsBucle@ while (true) {

        val user_selection:String? = readLine()
        println("user_selection $user_selection")
        var product_index = user_selection?.toInt() ?: -1
        println("product_index $product_index")

        when
        {
            listIngredients.contains(listIngredients[product_index]) ->
            {
                println("Type 0 to exit")
                println("Insumo apuntado, quiere agregar otro?")
            }
            user_selection.equals("0") ->
            {
                break@ProductsBucle
            }
            else -> {
                println(error_product_list)
            }
        }
    }

}


fun viewRecipes(recipe:String?){

    if (recipe != null){
        println("$view_my_recipies: $recipe")
    }

}