package nl.fredoliveira.demo.persistence

import javax.persistence.*

@Entity
@Table(name = "user")
open class UserEntity {

    @Id
    @GeneratedValue(generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "id_seq")
    open var id: Long? = null
    open var name: String? = null
    open var status: String? = null

}