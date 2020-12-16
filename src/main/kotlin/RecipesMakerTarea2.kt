const val make_recipe                = "Make Recipe"
const val select_product_by_category = "Select the ingredient you are looking for by category"
const val int_aux                    = 1
const val separator                  = "-----------------------------------------------------"

fun main(args: Array<String>) {


    println(separator)
    makeRecipe()

    println(separator)
    viewRecipe()

}

fun makeRecipe(){
    println("$make_recipe \n $select_product_by_category")

    listIngredients.forEachIndexed { index, element ->
        println("${index+int_aux}. $element")
    }
}

fun viewRecipe() {

    println(view_my_recipies)
}