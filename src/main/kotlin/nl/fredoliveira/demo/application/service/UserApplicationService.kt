package nl.fredoliveira.demo.application.service

import nl.fredoliveira.demo.domain.User

interface UserApplicationService {

    fun findAll(): List<User>
    fun save(user: User)

}