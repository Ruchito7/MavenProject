package Page_Object;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class Home_PageObj extends BasePage{
	
	public Home_PageObj() throws IOException {
		super();
		
	}
    By CookieBar= By.xpath("//div[@id='onetrust-banner-sdk']/div[@role='dialog']//div[@class='ot-sdk-row']");
    By CookieAcceptButton = By.cssSelector("button#onetrust-accept-btn-handler");
    By CookieDeclineButton= By.cssSelector("button#onetrust-reject-all-handler");
	By TopLogo= By.cssSelector("header [data-block-name='header']:nth-of-type(1) .nav-brand p");
	By Home_Link = By.cssSelector("nav#nav  ul > li:nth-of-type(1) > a");
	By Know_Link = By.cssSelector("nav#nav  ul > li:nth-of-type(2) > a");
	By Go_Link =  By.cssSelector("nav#nav  ul > li:nth-of-type(3) > a");
	By Telehealth_Link= By.cssSelector("nav#nav  ul > li:nth-of-type(4) > a");
	By Resources_Link =  By.cssSelector("nav#nav  ul > li:nth-of-type(5) > a");
	
	
	
	public WebElement GetCookieBar() {
		return GetDriver().findElement(CookieBar);
	}
	
	
	public WebElement GetCookieAcceptButton() {
		return GetDriver().findElement(CookieAcceptButton);
	}
	
	
	public WebElement GetCookieDeclineButton() {
		return GetDriver().findElement(CookieDeclineButton);
	}
	
	
		

	public WebElement GetTopLogo() {
		return GetDriver().findElement(TopLogo);

	}

	public WebElement GetHome_Link() {
		return GetDriver().findElement(Home_Link);

	}

	public WebElement GetKnow_Link() {
		return GetDriver().findElement(Know_Link);

	}

	public WebElement GetGo_Link() {
		return GetDriver().findElement(Go_Link);

	}

	public WebElement GetTelehealth_Link() {
		return GetDriver().findElement(Telehealth_Link);

	}

	public WebElement GetResources_Link() {
		return GetDriver().findElement(Resources_Link);

	}


}