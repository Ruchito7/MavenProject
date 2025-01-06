package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends BasePage{
	public Hooks() throws IOException {
		super();
	}

	@BeforeTest
	public void SetUp() {
		GetDriver().get(GetUrl());
		WebDriverWait wait= new WebDriverWait(GetDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='onetrust-banner-sdk']/div[@role='dialog']//div[@class='ot-sdk-row']")));
	}	
	
	@AfterTest
	public void TearDown() {
		WebDriverInstance.CleanUpDriver();
	}
}
