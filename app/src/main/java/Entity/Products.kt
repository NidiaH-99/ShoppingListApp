package Entity

class Products {
    var id: String=""
    private var name : String=""
    var price : Double= 0.0
    var amount: Int=0

    constructor(name: String, price: Double, amount: Int)

    {
        this.id= id
        this.name= name
        this.price= price
        this.amount= amount
    }

    var Id: String
        get() = this.id
        set(value)  { this.id = value }

    var Name: String
        get() = this.name
        set(value)  { this.name = value }

    var Price: Double
        get() = this.price
        set(value)  { this.price = value }

    var Amount: Int
        get() = this.amount
        set(value)  { this.amount = value }
}