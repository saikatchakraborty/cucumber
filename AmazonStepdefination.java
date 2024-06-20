package stepDefination;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepdefination {
 
	WebDriver driver = new ChromeDriver();
	
	@Given("URL of the amazon")
	public void url_of_the_amazon() {
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	}

	@When("User tries to search for a product	and click on product")
	public void user_tries_to_search_for_a_product_and_click_on_product() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("caps men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/div/span/a/div/img")).click();
		Set<String> windowhand=driver.getWindowHandles();
		 Iterator <String> it=windowhand.iterator();
		 Thread.sleep(2000);
		    String parent=it.next();
		    String child=it.next();
		 
		    driver.switchTo().window(child);
		    Thread.sleep(2000);
		    JavascriptExecutor js =(JavascriptExecutor)driver;
			   js.executeScript("window.scrollBy(0,500)", "");
		    
		    
	}

	@When("Click on add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
	}

	@Then("product should be added to cart")
	public void product_should_be_added_to_cart() {
		String Expectedtitle="Added to Cart";
		String  actualTittle= driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText();
		Assert.assertEquals(actualTittle, Expectedtitle,"text not matched");
	   
	}

}
