package nl.fredoliveira.demo.persistence.mapper

import nl.fredoliveira.demo.domain.User
import nl.fredoliveira.demo.persistence.UserEntity
import org.springframework.stereotype.Component

@Component
class DefaultUserMapper : UserMapper {
    override fun toDomain(user: UserEntity): User {
        return User(user.name ?: "", user.status ?: "")
    }

    override fun toEntity(user: User): UserEntity {
        return UserEntity().apply {
            name = user.name
            status = user.status
        }
    }
}