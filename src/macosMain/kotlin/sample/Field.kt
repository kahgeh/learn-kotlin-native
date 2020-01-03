import sample.sources.FieldSource

interface Field {
    val name:String
    var displayName:String
    var sources: List<FieldSource>
}