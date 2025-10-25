package Controller

import Data.MemoryDataManager
import Entity.Products
import android.content.Context
import com.example.shoppinglistapp.R

class ProductsController {


    private var dataManager: MemoryDataManager = MemoryDataManager
    private lateinit var context: Context

    constructor(context: Context) {
        this.context = context
    }

    fun addProduct(product: Products) {
        try {
            dataManager.add(product)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgAdd))
        }
    }

    fun updateProduct(product: Products) {
        try {
            dataManager.update(product)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgUpdate))
        }
    }

    fun removeProduct(id: String) {
        try {
            dataManager.remove(id)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgDelete))
        }
    }

    fun getById(id: String): Products {
        try {
            val result = dataManager.getById(id)
            if (result == null || result !is Products) {
                throw Exception(context.getString(R.string.MsgDataNoFound))
            }
            return result as Products
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgGetByld))
        }
    }


}