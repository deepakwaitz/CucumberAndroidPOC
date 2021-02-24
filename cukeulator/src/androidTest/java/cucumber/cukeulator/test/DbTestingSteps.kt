package cucumber.cukeulator.test

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.androiddevs.shoppinglisttestingyt.data.local.ShoppingDao
import com.androiddevs.shoppinglisttestingyt.data.local.ShoppingItem
import com.androiddevs.shoppinglisttestingyt.data.local.ShoppingItemDatabase
import com.androiddevs.shoppinglisttestingyt.getOrAwaitValue
import com.google.common.truth.Truth
import io.cucumber.java.en.Given
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import com.google.common.truth.Truth.assertThat
import io.cucumber.java.en.Then
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

class DbTestingSteps {

    private lateinit var database: ShoppingItemDatabase
    private lateinit var dao: ShoppingDao

    @get:Rule
    private lateinit var instantTaskExecutorRule:InstantTaskExecutorRule


//    @Before
//    fun setup() {
//
//    }
//
//    @After
//    fun teardown() {
//        database.close()
//    }

    @Given("initialize the DB")
     fun insertintodb() {
        instantTaskExecutorRule = InstantTaskExecutorRule()
        database = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                ShoppingItemDatabase::class.java
        ).allowMainThreadQueries().build()
        dao = database.shoppingDao()
    }
    @Then("Insert in to the DB")
    fun insertintodb2() {
        val shoppingItem = ShoppingItem("name", 1, 1f, "url", id = 1)
        dao.insertShoppingItem(shoppingItem)

     //   val allShoppingItems = dao.observeAllShoppingItems().getOrAwaitValue()

        assertThat("hi").isEqualTo("hi")

    }

}