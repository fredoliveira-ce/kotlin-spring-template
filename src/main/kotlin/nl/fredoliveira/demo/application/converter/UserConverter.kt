package nl.fredoliveira.demo.application.converter

import nl.fredoliveira.demo.application.web.UserResource
import nl.fredoliveira.demo.domain.User
import org.springframework.stereotype.Component

@Component
class UserConverter: Converter<User, UserResource> {

    override fun to(user: User): UserResource {
        return UserResource(user.name, user.status)
    }

    override fun reverse(user: UserResource): User {
        return User(user.name, user.status)
    }

}