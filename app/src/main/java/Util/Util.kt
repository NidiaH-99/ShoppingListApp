package Util

import Entity.Products
import android.content.Context
import androidx.annotation.StringRes

class Util {


    fun formatPrice(price: Double): String {
        return String.format("$%.2f", price)
    }


    fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun getErrorMessage(context: Context, @StringRes resId: Int): String {
        return context.getString(resId)
    }


    fun calculateTotal(products: List<Products>): Double {
        return products.sumByDouble { it.price * it.amount }
    }


    fun isValidId(id: String): Boolean {
        return id.trim().isNotEmpty()
    }
}
