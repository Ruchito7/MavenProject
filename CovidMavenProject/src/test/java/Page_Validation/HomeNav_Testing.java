package Page_Validation;

import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.Hooks;
import Page_Object.Home_PageObj;

  @Listeners(Resources.Listeners.class)
public class HomeNav_Testing extends Hooks{

	public HomeNav_Testing() throws IOException {
		super();

	}



	@Test
	public void NavValidation() throws IOException, InterruptedException {
		Home_PageObj home = new Home_PageObj();
		Actions action= new Actions(GetDriver());
		action.moveToElement(home.GetCookieAcceptButton()).click().perform();;
		Thread.sleep(2000);
		home.GetKnow_Link().click();
		Thread.sleep(2000);
		((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,0);");
		Thread.sleep(2000);
		

		home.GetGo_Link().click();
		Thread.sleep(2000);
		((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,0);");
		Thread.sleep(2000);
		

		home.GetTelehealth_Link().click();
		Thread.sleep(2000);
		((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,0);");
		Thread.sleep(2000);
		

		home.GetResources_Link().click();
		Thread.sleep(2000);
		((JavascriptExecutor)GetDriver()).executeScript("window.scrollTo(0,0);");
		Thread.sleep(2000);


	}






}
