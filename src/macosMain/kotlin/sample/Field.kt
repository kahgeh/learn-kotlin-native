import sample.Tag
import sample.sources.FieldSource

interface Field {
    val name:String
    var displayName:String
    var sources: List<FieldSource>
    var tags: List<Tag>
    var typeName: String
}