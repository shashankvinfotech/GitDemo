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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import com.google.common.collect.ImmutableMap;


public class Assignment1 extends BaseTest {
	@Test
	public void Assignment1Test() throws MalformedURLException {
		
		
		//Direct on specific screen, use activity 
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
		driver.startActivity(activity);
		//First option
//		driver.findElement(AppiumBy.accessibilityId("App")).click();
//		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
//		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Command one']")).click();
//		
//		String result = driver.findElement(By.id("android:id/message")).getText();
//		Assert.assertEquals(result, "You selected: 0 , Command one");
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
//		driver.findElement(By.id("android:id/button2")).click();
		
		//Second Option
		
		
		
		
		
		
		
		
		
		
		
		//WebElement Source= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		//DragAndDrop(Source);
		//String result=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		//Assert.assertEquals(result,"Dropped!");

		
	}
}
