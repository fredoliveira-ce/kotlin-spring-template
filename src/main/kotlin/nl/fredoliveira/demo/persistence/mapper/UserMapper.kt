package nl.fredoliveira.demo.persistence.mapper

import nl.fredoliveira.demo.domain.User
import nl.fredoliveira.demo.persistence.UserEntity

interface UserMapper {

    fun toDomain(user: UserEntity): User
    fun toEntity(user: User): UserEntity

}