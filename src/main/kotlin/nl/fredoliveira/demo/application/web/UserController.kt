package nl.fredoliveira.demo.application.web

import nl.fredoliveira.demo.application.converter.Converter
import nl.fredoliveira.demo.application.service.UserApplicationService
import nl.fredoliveira.demo.domain.User
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.http.MediaType.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserController(
        private val service: UserApplicationService,
        private val converter: Converter<User, UserResource>
) {

    @ResponseStatus(OK)
    @GetMapping(produces = [APPLICATION_JSON_VALUE])
    fun getAll(): Iterable<UserResource> = service.findAll().map { user -> converter.to(user) }

    @ResponseStatus(CREATED)
    @PostMapping(consumes = [APPLICATION_JSON_VALUE], produces = [APPLICATION_JSON_VALUE])
    fun save(@RequestBody user: UserResource) = service.save(converter.reverse(user))

}