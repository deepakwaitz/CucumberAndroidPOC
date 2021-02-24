package cucumber.cukeulator.test

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.manager.retrofitesting.model.api.ApiHelperImpl
import com.manager.retrofitesting.model.api.RetrofitBuilder
import com.manager.retrofitesting.util.Resource
import cucumber.cukeulator.feature.main.viewmodel.RequestViewModel
import cucumber.cukeulator.userapi.dataclass.MainData
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import junit.framework.Assert
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.json.JSONObject
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import java.net.HttpURLConnection

@RunWith(MockitoJUnitRunner::class)
class ApiCallSteps {

    private lateinit var viewModel: RequestViewModel

    private lateinit var apiHelper: ApiHelperImpl

    @Mock
    private lateinit var apiEmployeeObserver: Observer<Resource<MainData>?>

    private lateinit var mockWebServer: MockWebServer
    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()


    @Given("setup Api")
    fun setUp() {

        MockitoAnnotations.initMocks(this)

        viewModel = RequestViewModel()
        viewModel.getDetail().observeForever(apiEmployeeObserver)

        mockWebServer = MockWebServer()
        mockWebServer.start()
        apiHelper = ApiHelperImpl(RetrofitBuilder.apiInterface)
    }

}