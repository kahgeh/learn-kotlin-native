package sample.govForm1

import Field
import sample.Tag
import sample.sources.FieldSource


data class FieldA(override val name: String,
                  override var displayName: String,
                  override var sources: List<FieldSource> = listOf(),
                  override var tags: List<Tag> = listOf(),
                  override var typeName: String= String::class.simpleName?:"") : Field {
}

fun MutableList<Field>.fieldA(displayName: String, initField:Field.()->Unit){
    val field  = FieldA(FieldA::class.simpleName?:"", displayName)
    field.initField()
    this.add(field)
}