package Data

import Entity.Person
import Entity.Products

object MemoryDataManager {

    private val personList = mutableListOf<Person>()

    fun add(person: Products) {
        personList.add(person)
    }

    fun remove(id: String) {
        personList.removeIf { it.id.trim() == id.trim() }
    }

    fun update(person: Products) {
        remove(person.id)
        add(person)
    }

     fun getAll(): List<Person> = personList

    fun getById(id: String): Person? {
        return personList.firstOrNull { it.id.trim() == id.trim() }
    }

     fun getByFullName(fullName: String): Person? {
        return personList.firstOrNull {
            "${it.name} ${it.fLastName} ${it.sLastName}".trim().equals(fullName.trim(), ignoreCase = true)
        }
    }
}