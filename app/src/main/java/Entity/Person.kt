package Entity
import Entity.Products
import android.graphics.Bitmap

class Person {

    var id: String = ""
    var name: String = ""
    var fLastName: String=""
    var sLastName: String=""
    private var phone: Int=0
    private var email: String=""

    constructor(name: String, fLastName: String, sLastName: String, phone: Int, email: String, id: String )

    {
        this.id= id
        this.name= name
        this.fLastName= fLastName
        this.sLastName= sLastName
        this.phone= phone
        this.email= email
    }

    var Id: String
        get() = this.id
        set(value)  { this.id = value }

    var Name: String
        get() = this.name
        set(value)  { this.name = value }

    var FLastName: String
        get() = this.fLastName
        set(value)  { this.fLastName = value }

    var SLastName: String
        get() = this.sLastName
        set(value)  { this.sLastName = value }

    var Phone: Int
        get() = this.phone
        set(value)  { this.phone = value }

    var Email: String
        get() = this.email
        set(value)  { this.email = value }


    private val products: MutableList<Products> = mutableListOf()

        fun addProduct(product: Products) {
            products.add(product)
        }

        fun removeProduct(productId: String) {
            products.removeAll { it.id == productId }
        }

        fun getProducts(): List<Products> = products.toList()
         }

