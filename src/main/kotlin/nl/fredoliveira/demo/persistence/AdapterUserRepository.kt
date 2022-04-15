package nl.fredoliveira.demo.persistence

import nl.fredoliveira.demo.domain.User
import nl.fredoliveira.demo.domain.UserRepository
import nl.fredoliveira.demo.persistence.mapper.UserMapper
import org.springframework.stereotype.Component

@Component
class AdapterUserRepository(
        private val jpaUserRepository: JpaUserRepository,
        private val userMapper: UserMapper
) : UserRepository {

    override fun findAll(): List<User> {
        return jpaUserRepository.findAll().map { userEntity -> userMapper.toDomain(userEntity) }
    }

    override fun save(user: User) {
        jpaUserRepository.save(userMapper.toEntity(user))
    }

}