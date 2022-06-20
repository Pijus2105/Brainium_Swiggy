package Swiggy;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			WebDriver driver = TestClass.getDriver();
			//TC-01
			//Website Navigating
			driver.get("https://www.swiggy.com/city/kolkata");		
			 
			//Location Navigating	        
			driver.findElement(By.xpath("//div[@class='Iou1H']")).click();
			driver.findElement(By.xpath("//div[@class='J80xC']")).click();
			
	        //TC-02 
	        //Search Box Navigating
	        driver.findElement(By.linkText("Search")).click();
	        driver.findElement(By.className("_2BJMh")).sendKeys("Biriyani",(Keys.ENTER));
	        
	        //TC-03 
	        //OFFERS
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[4]/div/a")).click();
	       
	        //TC-04 
	        //HELP
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[3]/div/a")).click();
	        
	        //TC-05 
            //Cart
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[1]/div/div[1]/div/a")).click();
	       
	        
	       //TC-06 	               
	       // SEE RESTAURANTS NEAR YOU
           driver.findElement(By.xpath("//div[@class='_3pgCg']")).click();
	        
	        //TC-07 
	        //Restaurants
	         driver.findElement(By.xpath("//*[@id=\"all_restaurants\"]/div/div[2]/div[1]/div/div[1]/div[2]/a/div/div[1]/div[2]/div[1]")).click();
	       
	         //TC-08 
	        //Add
	        driver.findElement(By.xpath("//div[@class='_1RPOp']")).click();
	        driver.findElement(By.className("_38xdN")).click();
	        
             //TC-09 
	        // "+" This Button Working Or Not
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='_1ds9T _2Thnf']")).click();
        
            //TC-10 
	        //I'll CHOOSE
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='b0G1m']")).click();
	        
	        //TC-11 
	        //ADD ITEM OF I'll CHOOSE
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[@class='_38xdN']")).click();
	        
	        //TC-12 
	        //"-" This Button Working or not
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='_29Y5Z _2od4M']")).click();
	        
	        //TC -13
	        //2nd time use + this button
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='_1ds9T _2Thnf']")).click();
	        
	        //TC-14 
	        //REPEAT LAST
	        Thread.sleep(2000);
	         driver.findElement(By.xpath("//button[@class='_2-MHS']")).click();
	         
	         //TC-15
	         //2nd time use - button
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[@class='_29Y5Z _2od4M']")).click();
	         
	         //TC-16
	         //Checkout
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//button[@class='_1gPB7']")).click();
	         
	         //TC-17
	         //Sign Up
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
	         driver.findElement(By.xpath("//input[@class='_381fS']")).sendKeys("123456789");
	         driver.findElement(By.id("name")).sendKeys("Brainium Information Technologies");
	         driver.findElement(By.id("email")).sendKeys("brainium123@gmail.com");
	         driver.findElement(By.id("password")).sendKeys("123456789brainium@");
	         
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/a")).click();
	        

	         //TC-18
	         //Sign In
             Thread.sleep(2000);
             driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[1]/div/span[2]")).click();
	  	     driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("123456789");
	  	     driver.findElement(By.xpath("//a[@class='_2REYC']")).click();
	  	   
	  	     //TC-19
	  	     //Address
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[@class='_3dNWs _1AS3P']")).click();
	         driver.findElement(By.id("building")).sendKeys("Sector-v");
	         driver.findElement(By.id("landmark")).sendKeys("Saltlake");
	         driver.findElement(By.xpath("//div[@class='sf8jl']")).click();
	         driver.findElement(By.xpath("//a[@class='_2sd1x']")).click();
	       
	         //TC-20
	         //Payment	       
	      
	         Thread.sleep(2000);
	         driver.findElement(By.linkText("Pay on Delivery")).click();
	       
	         //Pay On Delivery
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s _2vnDb']")).click();
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s _2vnDb']")).click();
	       
	         //UPI
	         Thread.sleep(2000);
	         driver.findElement(By.linkText("UPI")).click();
	         driver.findElement(By.xpath("//input[@class='_381fS']")).sendKeys("brainiumtechnologies12345@ybl");
	         driver.findElement(By.linkText("Verify and Pay ₹439")).click();
	       
	         //Pay Later
	         Thread.sleep(2000);
	         driver.findElement(By.linkText("Pay Later")).click();
	         driver.findElement(By.linkText("Link Account")).click();
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s KithL']")).click();
	       
	         //Credit & Debit cards
	         Thread.sleep(2000);
	         driver.findElement(By.linkText("Credit & Debit cards")).click();
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s _1gu11']")).click();
	         driver.findElement(By.id("cardNumber")).click();
	         driver.findElement(By.id("expiry")).click();
	         driver.findElement(By.id("cvv")).click();
	         driver.findElement(By.xpath("//input[@id='name']")).click();
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s m_CzU']")).click();
	       
	         //Wallets
	         Thread.sleep(2000);
	         driver.findElement(By.linkText("Wallets")).click();
	         driver.findElement(By.xpath("//div[@class='_2CxV2']")).click();
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s KithL']")).click();
	         driver.findElement(By.xpath("//div[@class='_2ZJ0s KithLL']")).click();
	              	       	  	
	        
		}
	        
	        catch (NoSuchElementException e) {
				System.out.println("Yes! I can say where is the Exception.");
				System.out.println(e);
			}
				catch (StaleElementReferenceException h) {
					System.out.println("No");
					System.out.println(h);
				}
			
			
			 finally {
			System.out.println("All Are Done");
			}
		
		
	}
	
}


