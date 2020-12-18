package model

class Product(id:Int,name:String,cantidad:Int) {

    private var id:Int = id
    private var name:String = name
    private var cantidad:Int = cantidad

    override fun toString(): String {
        return "$id. $name ($cantidad)"
    }
}

