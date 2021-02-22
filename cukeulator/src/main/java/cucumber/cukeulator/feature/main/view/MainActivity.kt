package cucumber.cukeulator.feature.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.junit.poc.feature.main.viewmodel.UserViewModel
import cucumber.cukeulator.R
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
            }
            it.onFailure {
                Log.e("Failure",""+it.toString())
            }
        })

    }
}