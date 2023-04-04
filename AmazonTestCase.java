package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestCase {

public static void main(String[] args) throws InterruptedException {
   // ChromeOptions option = new ChromeOptions();
   // option.addArguments("--remote-allow-origins=*");
   ChromeDriver driver;
   
   
      // System.out.println("Constructor: TestCases");
       WebDriverManager.chromedriver().timeout(30).setup();
       driver = new ChromeDriver();
       
     // ChromeDriver driver;
// 1. Launch Browser (Chrome) :ChromeDriver()
    // driver = new ChromeDriver();
// 1.2 Maximize Window :driver.windows().manage().maximize();
        driver.manage().window().maximize();  
// 1.5 Handle Sync issue using implicitlyWait() :driver.windows().timeouts().implicitlyWait(30,TimeUnit.SECONDS)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// 2. Load URL  driver.get("https://keep.google.com/u/0/")
        driver.get("https://www.google.com/");

// 3.Search for Amazon Using Locator "Name" "q"/sendKeys("Amazon"+Keys.Enter)
      driver.findElement(By.name("q")).sendKeys("Amazon"+Keys.ENTER);
// 4.Thread.sleep :
       Thread.sleep(3000);
// 5.  "Amazon.in"  or "Amazon.com" Using Locator "XPath" //span[@role='text'][1]
       String text = driver.findElement(By.xpath("//span[@role='text'][1]")).getText();
// 6. Print
       System.out.println("serach result is"+ text);
    

    
}
  
}
