package qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import qa.utils.Constants;
public class BlazeRegisterPage {

	@FindBy (id = "inputName")
	WebElement nameField;
	
	@FindBy(id="address")
	WebElement addressField;
	
	@FindBy(id="city")
	WebElement cityField;
	
	@FindBy(id="state")
	WebElement stateField;
	
	@FindBy(id="zipCode")
	WebElement zipCodeField;

	@FindBy(xpath="//select[@id='cardType']")
	WebElement cardOption;
	
	@FindBy(id="creditCardNumber")
	WebElement creditCardNumberField;

	@FindBy(id="creditCardMonth")
	WebElement creditCardMonthField;
	
	@FindBy(id="creditCardYear")
	WebElement creditCardYearField;

	@FindBy(id="nameOnCard")
	WebElement nameOnCardField;
	
	@FindBy(id="rememberMe")
	WebElement rememberCheckBox;
	
	@FindBy(css="input.btn")
	WebElement purchaseBtn;
	
	@FindBy(xpath="//h1")
	WebElement header;
	
	// Class Constructor
	public BlazeRegisterPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	
	public void enterName(String name) {
		nameField.sendKeys(name);
	}
	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}
	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	public void enterState(String state) {
		stateField.sendKeys(state);
	}
	public void enterZipCode(String zip) {
		zipCodeField.sendKeys(zip);
	}
	public void selectCard(String card) {
		Select select = new Select(cardOption);
		select.selectByVisibleText(card);
	}
	public void enterCreditCard(String creditCard) {
		creditCardNumberField.sendKeys(creditCard);
	}
	public void enterCreditMonth(String month) {
		creditCardMonthField.sendKeys(month);
	}
	public void enterCreditYear(String year) {
		creditCardYearField.sendKeys(year);
	}
	public void enterCreditName(String name) {
		nameOnCardField.sendKeys(name);
	}
	public void clickRemember() {
		rememberCheckBox.click();
	}
	public void clickpurchase() {
		purchaseBtn.click();
	}
	public void getHeader(String txt) {
		String headerTxt = header.getText();
		System.out.println(headerTxt);
		if (headerTxt.equalsIgnoreCase(txt)) {
			System.out.println("Correct Header");
		}else {
			System.out.println("false header");
		}
	}
}
