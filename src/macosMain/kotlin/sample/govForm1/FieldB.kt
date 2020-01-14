package sample.govForm1

import Field
import sample.Tag
import sample.sources.FieldSource


data class FieldB(override val name: String,
                  override var displayName: String,
                  override var sources: List<FieldSource> = listOf(),
                  override var tags: List<Tag> = listOf(),
                  override var typeName: String= String::class.simpleName?:"") : Field {
}

fun MutableList<Field>.fieldB(displayName: String, initField:Field.()->Unit){
    val field  = FieldB(FieldB::class.simpleName?:"", displayName)
    field.initField()
    this.add(field)
}