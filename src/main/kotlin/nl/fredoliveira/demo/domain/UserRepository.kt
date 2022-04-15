package nl.fredoliveira.demo.domain

interface UserRepository {

    fun findAll(): List<User>
    fun save(user: User)

}