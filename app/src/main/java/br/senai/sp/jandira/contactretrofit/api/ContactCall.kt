package br.senai.sp.jandira.contactretrofit.api

import br.senai.sp.jandira.contactretrofit.model.Contact
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ContactCall {

    @GET("contacts")
    fun getAll(): Call<List<Contact>>

    @POST("contacts")
    fun save(@Body contact: Contact): Call<Contact>

    @DELETE("contacts/{id}")
    fun delete(@Path("id") id: Long): Call<String>
}