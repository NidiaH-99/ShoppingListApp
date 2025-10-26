package Data
import Entity.Person
import Entity.Products

interface IDataManager {

    fun add(person: Products)
    fun update(person: Person)
    fun remove(id: String)
    fun getAll(): List<Person>
    fun getById(id: String): Person?
    fun getByFullName(fullName: String): Person?
}