package sample

import fields
import form
import sample.govForm1.*
import sample.sources.*

fun main() {
    val govForm1=form (name="govForm1") {
        fields {
            fieldA (displayName = "field a") {
                sources = listOf(Prefil(), UserInput())
            }

            fieldB (displayName = "field b") {
                sources = listOf(UserInput())
            }
        }
    }

    println( "Form name = ${govForm1.Name}")
    println( "Total number of fields = ${govForm1.Fields.size}")
    println( "Fields = ${govForm1.Fields.joinToString()}")
}