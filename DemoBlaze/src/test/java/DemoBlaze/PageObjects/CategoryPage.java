package DemoBlaze.PageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {

	WebDriver ldriver;

	public CategoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@id='cat']")
	public WebElement mainCategoryList;

	@FindBy(xpath = "//div[@id='contcont']//a[2]")
	public WebElement phlink;

	@FindBy(xpath = "//div[@id='contcont']//a[3]")
	public
	WebElement laptopLink;

	@FindBy(xpath = "//div[@id='contcont']//a[4]")
	public WebElement monitorLink;
	
	@FindBy(id="next2")
	public WebElement nxtBtn;
	

	public List<WebElement> mainCategory() {
		return ldriver.findElements(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a"));
	}
	
	public List<WebElement> mainCategory2() {
		return ldriver.findElements(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a"));
	}

	public void waitForLoginModalToDisappear() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));
	}

	public List<WebElement> phList() {
		return ldriver.findElements(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a"));

	}

	public List<WebElement> laptopList() {
		return ldriver.findElements(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a"));

	}

	public List<WebElement> monitorList() {
		return ldriver.findElements(By.xpath("//div[@id='tbodyid']//h4[@class='card-title']/a"));

	}

}
