package ShashankWorkAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
		public AndroidDriver driver;
		public AppiumDriverLocalService service;
		@BeforeTest
		public void ConfigureAppium() throws MalformedURLException {
			//code to start server
			//AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\91903\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
			//service.start();
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Pixel_3a_API_33_x86_64");
			//options.setApp("\\Users\\91903\\Downloads\\APKFiles\\resources\\ApiDemos-debug.apk");
			options.setApp("\\Users\\91903\\Downloads\\APKFiles\\resources\\General-Store.apk");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		// LongPress gesture Code method
	    public void LongPressAction(WebElement ele) {
		   ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",2000));
	    }
	    // Scroll gesture upto specific text :
	    public void ScrollUptoSpecificText(WebElement scr) {
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	    }
	    
	    //Drag and Drop Gesture:
	    public void DragAndDrop(WebElement Source) {
	    	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) Source).getId(),
				    "endX", 646,
				    "endY", 581
				));
	    }
	    
	    //Remove extra string
	    public double getFormattedString(String amount) {
	    	Double price = Double.parseDouble(amount.substring(1));
	    	return price;
	    }
	    
	    // Swipe gesture:
	    public void SwappingGesture(WebElement ele, String direction) {
	    	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
	    			"elementId",((RemoteWebElement)ele).getId(),
	    			    "direction", direction,
	    			    "percent", 0.75
	    			));
	    }
	    
	    
}
