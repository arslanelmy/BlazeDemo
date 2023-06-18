package qa.steps;



import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.pages.BlazeRegisterPage;
import qa.utils.Constants;

public class BlazeStep {
	BlazeRegisterPage blaze;
	@Given("User navigates to Register Page {string}")
	public void user_navigates_to_register_page(String string) throws InterruptedException {

		Constants.driver.get(string);
		Thread.sleep(2000);
		blaze = new BlazeRegisterPage();
	}

	@When("User provides personal information")
	public void user_provides_personal_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> listMap = dataTable.asMaps();

		for (Map<String, String> map : listMap) {

			for (Map.Entry<String, String> entry : map.entrySet()) {

				String key = entry.getKey();
				String value = entry.getValue();

				System.out.println(key + " : " + value);

				if (key.equals("fullName")) {
					blaze.enterName(value);
				} else if (key.equals("address")) {
					blaze.enterAddress(value);
				} else if (key.equals("city")) {
					blaze.enterCity(value);
				} else if (key.equals("state")) {
					blaze.enterState(value);
				} else if (key.equals("zip")) {
					blaze.enterZipCode(value);
				} else if (key.equals("cardType")) {
					blaze.selectCard(value);
				}else if (key.equals("cardNumber")) {
					blaze.enterCreditCard(value);
				}else if (key.equals("expMonth")) {
					blaze.enterCreditMonth(value);
				}else if (key.equals("expYear")) {
					blaze.enterCreditYear(value);
				}else if (key.equals("nameOnCard")) {
					blaze.enterCreditName(value);
				}

			}
			Thread.sleep(1500);
		}

	}

	@When("User clicks remember me")
	public void user_clicks_remember_me() {
	 blaze.clickRemember();
	}

	@When("User clicks on purchase flight button")
	public void user_clicks_on_purchase_flight_button() {
	   blaze.clickpurchase();
	}

	@Then("User verifies success message {string}")
	public void user_verifies_success_message(String header) {
	 blaze.getHeader(header);
	}


}
