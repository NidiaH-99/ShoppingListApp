package Controller

import Data.MemoryDataManager
import Entity.Person
import Entity.Products
import android.content.Context
import com.example.shoppinglistapp.R

class PersonController {

    private var dataManager: MemoryDataManager = MemoryDataManager
    private lateinit var context: Context

    constructor(context: Context) {
        this.context = context
    }

    fun addPerson(person: Person) {
        try {
            dataManager.add(person)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgAdd))
        }
    }

    fun updatePerson(person: Person) {
        try {
            dataManager.update(person)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgUpdate))
        }
    }

    fun removePerson(id: String) {
        try {
            dataManager.remove(id)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgDelete))
        }
    }

    fun getById(id: String): Person {
        try {
            val result = dataManager.getById(id)
            if (result == null || result !is Person) {
                throw Exception(context.getString(R.string.MsgDataNoFound))
            }
            return result as Person
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgGetByld))
        }
    }

    fun getByFullName(fullName: String): Person {
        try {
            val result = dataManager.getByFullName(fullName)
            if (result == null) {
                throw Exception(context.getString(R.string.MsgDataNoFound))
            }
            return result
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgGetByld))
        }
    }

    fun addProductToPerson(personId: String, product: Products) {
        try {
            val person = getById(personId)
            person.addProduct(product)
            updatePerson(person)
        } catch (e: Exception) {
            throw Exception(context.getString(R.string.ErrorMsgUpdate))
        }
    }
}