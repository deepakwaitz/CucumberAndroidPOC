package cucumber.cukeulator.feature.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.junit.poc.feature.main.viewmodel.UserViewModel
import cucumber.cukeulator.R
import kotlinx.android.synthetic.main.activity_recycler.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        userViewModel.getUserInfo().observe(this,{
            it.onSuccess {
                    Log.e("Success",""+it.toString())
                userListview.apply {
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter=UserListAdapter(it.items)
                }

            }
            it.onFailure {
                Log.e("Failure",""+it.toString())
            }
        })






    }
}