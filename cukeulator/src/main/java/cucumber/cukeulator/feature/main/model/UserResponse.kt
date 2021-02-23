package com.follett.fss.searchread.feature.schoolpicker.model

/**
 * contains location information about states and regions where school reside.
 */
data class UserResponse(
    var total_count : Int= 0,
    var incomplete_results: Boolean,
    var items:ArrayList<UserList>

)
data class UserList(var id:Int,var login:String,var node_id:String,var avatar_url:String)
