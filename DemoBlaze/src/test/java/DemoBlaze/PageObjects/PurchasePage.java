package DemoBlaze.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
	WebDriver ldriver;

	public PurchasePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='Purchase']")
	public
	WebElement btnPurchase;
	
	@FindBy(xpath = "//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']")
	WebElement btnClose;
	
	@FindBy(xpath="//button[normalize-space()='OK']")
	WebElement btnPurchaseOk;
	
	@FindBy(xpath="//p[@class='lead text-muted ']")
	WebElement pDetails;

	public void purchase() {
		btnPurchase.click();
	}

	public void close() {
		btnClose.click();
	}
	
	public void confirm() {
		btnPurchaseOk.click();
	}
	
	public String purchaseDetails() {
		
	    String popupText = pDetails.getText();
		return popupText;

	}

}
