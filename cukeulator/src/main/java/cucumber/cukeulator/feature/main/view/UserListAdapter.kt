package cucumber.cukeulator.feature.main.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.follett.fss.searchread.feature.schoolpicker.model.UserList
import cucumber.cukeulator.R
import kotlinx.android.synthetic.main.activity_recycler_support.view.*

class UserListAdapter(var list:ArrayList<UserList>) : RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return UserViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userList: UserList = list[position]

        holder.bind(userList)
    }

}

class UserViewHolder(inflater: LayoutInflater, parent: ViewGroup):RecyclerView.ViewHolder(
        inflater.inflate(R.layout.activity_recycler_support,parent,false)) {
    fun bind(userList: UserList) {
        itemView.userName.text= "Login : "+userList.login
        itemView.node_id.text="Node Id : "+userList.node_id
        itemView.user_id.text=" Id : "+userList.id
    }

}
