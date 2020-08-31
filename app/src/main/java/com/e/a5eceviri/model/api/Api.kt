package com.e.a5eceviri.model.api


import com.e.a5eceviri.model.api.response.clasresponse.Clas
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


class Api {
    private var retrofit: Retrofit? =null
    private val url : String = "https://github.com/kanguen/kanguen.github.io/tree/master/data/api/"
    fun build():Retrofit? {
        val gson = GsonBuilder()
            .setLenient()
            .create()
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(OkHttpClient())
                .build()
            return retrofit
        }
        return retrofit
    }
    interface ApiInterface{
        @GET("class/{clas}.json")
        fun getclass(@Path("clas")classname:String): Call<Clas>
    }
}