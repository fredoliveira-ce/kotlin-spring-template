package nl.fredoliveira.demo.application.service

import nl.fredoliveira.demo.domain.User
import nl.fredoliveira.demo.domain.UserRepository
import org.springframework.stereotype.Component

@Component
class DefaultUserApplicationService(private val userRepository: UserRepository) : UserApplicationService {

    override fun findAll() = userRepository.findAll()
    override fun save(user: User) = userRepository.save(user)

}