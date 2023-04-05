package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDB {
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
 // 2. Load URL  driver.get("https://www.imdb.com/chart/top")
 driver.get("https://www.imdb.com/chart/top");
// Wait for URL to Load

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//Clickon the total number of movies
driver.findElement(By.tagName("select")).click();
//Select options
driver.findElement(By.xpath(" //select//option[2]")).click();
//wait
Thread.sleep(3000);
//Print the total number of movies

String text = driver.findElement(By.xpath("//h1[text()='IMDb Top 250 Movies']")).getText();
System.out.println("Total number of movies=" +text);
//Print the Highest rating movie
String text1 = driver.findElement(By.xpath("(//td[@class='titleColumn'])[1]//a")).getText();
System.out.println("Highest rating movie=" +text1);
// Print the lowest rating movie
driver.findElement(By.xpath("//span[@title='Descending order']")).click();
String text2 =driver.findElement(By.xpath("(//td[@class='titleColumn'])[1]//a")).getText();
System.out.println("Lowest rating movie=" +text2);
}
    
}
