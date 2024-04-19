package ShashankWorkAppium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import com.google.common.collect.ImmutableMap;


public class ScrollDemo extends BaseTest {
	@Test
	public void ScrollDemoTest() throws MalformedURLException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//Where to scroll is known prior:
		WebElement scr = null;
		ScrollUptoSpecificText(scr);
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"));"));
	}
}
