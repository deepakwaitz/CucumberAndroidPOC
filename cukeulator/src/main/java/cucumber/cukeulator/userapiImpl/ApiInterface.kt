package com.manager.retrofitesting.model.api

import cucumber.cukeulator.userapi.dataclass.MainData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/api/v1/employees")
    fun getEmployeeDetails(): Call<MainData>
}