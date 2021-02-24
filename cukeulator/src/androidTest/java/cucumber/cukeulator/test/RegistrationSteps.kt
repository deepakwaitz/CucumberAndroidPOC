package cucumber.cukeulator.test

import com.google.common.truth.Truth.assertThat
import cucumber.cukeulator.utils.RegistratioUtil
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then

class RegistrationSteps {

    @Given("empty username returns false")
    fun emptyusernamereturnsfalse() {
        val result = RegistratioUtil.ValidateRegistration(
                "",
                "123",
                "123"
        )
        assertThat(result).isFalse()
    }

    @Then("valid username and correctly repeated password returns true")
    fun validusernameandcorrectly_repeated_password_returns_true() {
        val result = RegistratioUtil.ValidateRegistration(
                "Philipp",
                "123",
                "123"
        )
        assertThat(result).isTrue()
    }

    @Then("username already exists returns false")
    fun username_already_exists_returns_false() {
        val result = RegistratioUtil.ValidateRegistration(
                "Carl",
                "123",
                "123"
        )
        assertThat(result).isFalse()
    }


    @Then("incorrectly confirmed password returns false")
    fun incorrectly_confirmed_password_returns_false() {
        val result = RegistratioUtil.ValidateRegistration(
                "Philipp",
                "123456",
                "abcdefg"
        )
        assertThat(result).isFalse()
    }


    @Then("empty password returns false")
    fun empty_password_returns_false() {
        val result = RegistratioUtil.ValidateRegistration(
                "Philipp",
                "",
                ""
        )
        assertThat(result).isFalse()
    }


    @Then("less than 2 digit password returns false")
    fun less_than_2_digit_password_returns_false() {
        val result = RegistratioUtil.ValidateRegistration(
                "Philipp",
                "abcdefg5",
                "abcdefg5"
        )
        assertThat(result).isFalse()
    }
}