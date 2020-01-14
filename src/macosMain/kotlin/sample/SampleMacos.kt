package sample

import fields
import form
import sample.govForm1.*
import sample.sources.*

fun main() {
    val section1 = Tag(value="section1")
    val section2 = Tag(value="section2")
    val govForm1=form (name="govForm1") {
        fields {
            fieldA (displayName = "field a") {
                sources = listOf(Prefil(), UserInput())
                tags = listOf(section1)
                typeName = Int::class.simpleName?:""
            }

            fieldB (displayName = "field b") {
                sources = listOf(UserInput())
                tags = listOf(section2)
            }
        }
    }

    println( "Form name = ${govForm1.Name}")
    println( "Total number of fields = ${govForm1.Fields.size}")
    println( "Fields = ${govForm1.Fields.joinToString()}")
}