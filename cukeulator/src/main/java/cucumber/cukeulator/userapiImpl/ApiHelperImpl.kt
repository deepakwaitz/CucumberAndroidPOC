package com.manager.retrofitesting.model.api

import cucumber.cukeulator.userapi.dataclass.MainData
import retrofit2.Call

class ApiHelperImpl(private val apiInterface: ApiInterface) : ApiHelper {

    override fun getEmployeeDetails(): Call<MainData> = apiInterface.getEmployeeDetails()

}