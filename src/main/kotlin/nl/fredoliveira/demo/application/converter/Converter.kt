package nl.fredoliveira.demo.application.converter

interface Converter<S, T> {

    fun to(s: S): T
    fun reverse(t: T): S

}