package br.senai.sp.jandira.contactretrofit.model

data class Contact(
    var id: Long = 0,
    var name: String = "",
    var email: String = "",
    var phone: String = "",
    var active: Boolean = true
){
    override fun toString(): String {
        return "Contact(id=$id, name='$name', email='$email', phone='$phone', active=$active)"
    }
}
