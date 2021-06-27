package com.example.udmitrataniapps.app

import com.example.udmitrataniapps.model.ResponseLahanPelanggan
import com.example.udmitrataniapps.model.ResponseModel
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("register-pelanggan")
    fun registerPelanggan(
        @Field("nama_lengkap") nama_lengkap:String,
        @Field("name") name:String,
        @Field("password") password:String,
        @Field("nik") nik:String,
        @Field("alamat") alamat:String,
        @Field("telepon") telepon:String,
        ):Call<ResponseModel>

    @FormUrlEncoded
    @POST("login-pelanggan")
    fun loginPelanggan(
        @Field("name") name: String,
        @Field("password") password: String
    ):Call<ResponseModel>

    @FormUrlEncoded
    @POST("pelanggan/tambah-lahan")
    fun tambahLahan(
        @Header("Authorization") token : String,
        @Field("nama_lahan") nama_lahan : String,
        @Field("alamat") alamat: String,
        @Field("luas_lahan") luas_lahan: String,
        @Field("sejarah_lahan") sejarah_lahan: String
    ):Call<ResponseModel>

    @GET("pelanggan/data-lahan")
    fun dataLahan(@Header("Authorization") token : String):Call<ResponseLahanPelanggan>

    @FormUrlEncoded
    @PUT("pelanggan/update-lahan/{id}")
    fun updateLahan(
        @Header("Authorization") token: String,
        @Path("id") idLahan : Int,
        @Field("nama_lahan") nama_lahan : String?,
        @Field("alamat") alamat: String?,
        @Field("luas_lahan") luas_lahan: String?,
        @Field("sejarah_lahan") sejarah_lahan: String?
    ):Call<ResponseModel>

    @FormUrlEncoded
    @POST("pelanggan/delete-lahan")
    fun deleteLahan(
        @Header("Authorization") token : String,
        @Field("id") idlahan : Int
    ):Call<ResponseModel>
}