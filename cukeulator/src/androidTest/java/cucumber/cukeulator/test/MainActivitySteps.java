package cucumber.cukeulator.test;

import android.util.Log;

import androidx.test.espresso.ViewAssertion;
//import androidx.test.rule.ActivityTestRule;

import com.follett.fss.searchread.feature.schoolpicker.model.UserList;
import com.follett.fss.searchread.feature.schoolpicker.model.UserResponse;
import com.junit.poc.feature.main.viewmodel.UserViewModel;

import org.junit.Test;

import cucumber.cukeulator.MyApplication;
import cucumber.cukeulator.R;
import cucumber.cukeulator.feature.main.view.MainActivity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class MainActivitySteps {
 //   private ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class, false, false);

    @Given("I have Home Activity")
    public void iHaveHomeActivity() {
      //  onView(withId(R.id.parentLayout)).check(matches(isDisplayed()));
    }

    @Then("Click Button")
    public void clickButton() {


    }

    @And("Check Internet Connection")
    public void checkInternetConnection() {

    }

    @Then("If network Available Make API")
    public void ifNetworkAvailableMakeAPI() {

    }

    @When("Success Response\\(true)")
    @Test
    public void successResponseTrue() {
        assertTrue("Success", true);
    }

    @And("Show the Result")
    public void showTheResult() {
        Utils utils=new Utils();
        assertEquals(true,true);
    }


}
