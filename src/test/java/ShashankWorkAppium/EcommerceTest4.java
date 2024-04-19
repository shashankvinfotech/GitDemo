package ShashankWorkAppium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class EcommerceTest4 extends BaseTest{
	
	@Test
	public void FillForm() {
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Shashank Sharma");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		WebElement country = null;
		ScrollUptoSpecificText(country);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		    List<WebElement> ProductPrices= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		    int count = ProductPrices.size();
		    double totalsum =0;
		    for(int i =0;i<count;i++) {
		    	String amountString= ProductPrices.get(i).getText();
		    	// $160.97 here we will remove $ from the value so it will convert to only 160.97
		    	Double price= Double.parseDouble(amountString.substring(1)); 
		    	totalsum = totalsum+price; // 160.97 pehle mila jo ki sum store ho gaya, ab loop fir se chala kyu ki ek aur value mil rhi hai jo ki hai 120
		    	// ab 160.97+120 = 280.97 ho gaya
		    }
		   	String DisplaySum= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		   	Double DisplayFomrattedCode= getFormattedString(DisplaySum);
		   	Assert.assertEquals(totalsum,DisplayFomrattedCode);
		   	
		   //Long press on the terms and condition section:
		   	WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		   	LongPressAction(ele);
		   	driver.findElement(By.id("android:id/button1")).click();
		   	driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		   	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		   	
	}	
}
	


