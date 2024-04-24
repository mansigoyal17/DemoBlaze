package DemoBlaze.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	WebDriver ldriver;

	public AddToCart(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@id='contcont']//a[2]")
	public WebElement lnkPhones;

	@FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
	public WebElement selctPhone;

	@FindBy(xpath = "//a[normalize-space()='Add to cart']")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
	public WebElement home;

	@FindBy(xpath = "//a[normalize-space()='Nokia lumia 1520']")
	public WebElement selctPhone2;

	@FindBy(xpath = "//a[@id='cartur']")
	public WebElement lnkCart;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
	public WebElement delItem;

	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	public WebElement placeOrderBtn;

	@FindBy(id = "orderModalLabel")
	public WebElement formDetails;

	@FindBy(id="totalp")
	public WebElement totalPrice;
	
	public void lnkPh() {
		lnkPhones.click();
	}

	public void selectPh() {
		selctPhone.click();
	}

	public void addToCart() {
		addToCartBtn.click();
	}

	public void homePg() {
		home.click();
	}

	public void selectPh2() {
		selctPhone2.click();
	}

	public void cart() {
		lnkCart.click();
	}

	public void delete() {
		delItem.click();
	}

	public void placeOrder() {
		placeOrderBtn.click();
	}

	public void username(String uname) {
		WebElement name = formDetails.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys(uname);
	}

	public void ucountry() {
		WebElement country = formDetails.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys("Canada");
	}

	public void ucity() {
		WebElement city = formDetails.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Toronto");
	}

	public void ucreditcard(String creditCardDetails) {
		WebElement creditCard = formDetails.findElement(By.xpath("//input[@id='card']"));
		creditCard.sendKeys(creditCardDetails);
	}

	public void uccmonth() {
		WebElement month = formDetails.findElement(By.xpath("//input[@id='month']"));
		month.sendKeys("04");
	}

	public void uyear() {
		WebElement year = formDetails.findElement(By.xpath("//input[@id='year']"));
		year.sendKeys("2026");
	}
	
	public void waitForLoginModalToAppear() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(formDetails));
	}

	public String total() {
		
		String price=totalPrice.getText();
		System.out.println(price);
		return price;
		
	}
	

}
