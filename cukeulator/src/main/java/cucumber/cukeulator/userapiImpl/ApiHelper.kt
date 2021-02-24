package com.manager.retrofitesting.model.api

import cucumber.cukeulator.userapi.dataclass.MainData
import retrofit2.Call

interface ApiHelper {

    fun getEmployeeDetails(): Call<MainData>
}