package ShashankWorkAppium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceTest extends BaseTest{
	
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
		
		//####For toaster message 
		//String ToastMessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		//Assert.assertEquals(ToastMessage, "Please enter your name");
		
		int ProductCount=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i=0;i<ProductCount;i++) {
			String productName= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		    if(productName.equalsIgnoreCase("Air Jordan 1 Mid SE")) {
		    	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		    }
		    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		    
		    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		    
		    String ProductNameInCart= driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		    Assert.assertEquals(ProductNameInCart, "Air Jordan 1 Mid SE");
		}
		
		
		
	}
	

}
