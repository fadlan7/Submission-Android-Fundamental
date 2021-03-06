package com.fadlan.githubuserapp.data.setting
import com.fadlan.githubuserapp.data.model.SearchResponse
import com.fadlan.githubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("users/{login}")
    fun getUser (
        @Path("login")
        username: String
    ): Call<UserResponse>

    @GET("users/{login}/followers")
    fun getUserFollowers (
        @Path("login")
        username: String
    ): Call<List<UserResponse>>

    @GET("users/{login}/following")
    fun getUserFollowing (
        @Path("login")
        username: String
    ): Call<List<UserResponse>>

    //Search User
    @GET("search/users")
    fun searchUsers (
        @Query("q")
        query: String
    ): Call<SearchResponse>
}