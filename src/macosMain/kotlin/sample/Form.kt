

data class Form( val Name: String, var Fields: MutableList<Field> = mutableListOf() ) {
}

fun form (name: String ,init: Form.()->Unit):Form{
    val form  = Form(name)
    form.init()
    return form
}

fun Form.fields(initFields: MutableList<Field>.()->Unit){
    this.Fields.initFields()
}