package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoHyperLink {
  //  ChromeDriver()
  public static void main(String[] args) throws InterruptedException {
        
    ChromeDriver driver;
    
    
       // System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        
    
 // 1.2 Maximize Window :driver.windows().manage().maximize();
         driver.manage().window().maximize();  
 // 1.5 Handle Sync issue using implicitlyWait() :driver.windows().timeouts().implicitlyWait(30,TimeUnit.SECONDS)
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 // 2. Load URL  driver.get("https://www.irctc.co.in/nget/train-search")
         driver.get("https://in.bookmyshow.com/explore/home/chennai");
         Thread.sleep(3000);

      // Find all hyperlinks on the page using the 'a' tag
      java.util.List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

      // Get the count of hyperlinks
      int numHyperlinks = hyperlinks.size();

      // Print the count of hyperlinks
      System.out.println("Number of hyperlinks on the page: " + numHyperlinks);

      // Close the browser
      driver.quit();
  
  }
}   

