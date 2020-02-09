package seleniumprojects;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Davies {

	public void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AllTestcases at=new AllTestcases();
		at.twitter();
		at.linkedin();
		at.insurance();
		at.map();
		
				
	}
}
		
	class AllTestcases{
		
		 void twitter()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srikanth\\Desktop\\navya\\chromedriver79\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "https://davies-group.com/";
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.manage().window().maximize();
			String Twturl=driver.findElement(By.xpath("//*[@id='eut-inner-header']/div/div[2]/ul/li[2]/a")).getAttribute("href");
			System.out.println(Twturl);
			driver.findElement(By.xpath("//*[@id='eut-inner-header']/div/div[2]/ul/li[2]/a")).click();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			System.out.println(tabs2.size());
		    driver.switchTo().window(tabs2.get(1));
		    String Twitterurl= driver.getCurrentUrl();
		    System.out.println(Twitterurl);
		    if(Twturl.equals(Twitterurl))
		    System.out.println("respective twitter url is opened");
		    else
		    	System.out.println("respective twitter url is not opened");
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    driver.close();
		}
		
		 void linkedin()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srikanth\\Desktop\\navya\\chromedriver79\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "https://davies-group.com/";
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.manage().window().maximize();
			String Linkurl=driver.findElement(By.xpath("//*[@id='eut-inner-header']/div/div[2]/ul/li[3]/a")).getAttribute("href");
		    System.out.println(Linkurl);
		    driver.findElement(By.xpath("//*[@id='eut-inner-header']/div/div[2]/ul/li[3]/a")).click();
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			System.out.println(tabs.size());
		    driver.switchTo().window(tabs.get(1));
		    String linkedinurl= driver.getCurrentUrl();
		    System.out.println(linkedinurl);
		   
		    driver.close();
		    
		    if(Linkurl.equals(linkedinurl))
		    	System.out.println("respective linkedin url is opened");
		    else
		    	System.out.println("respective linkedin url is not opened");
		    
		    driver.switchTo().window(tabs.get(0));
		    driver.close();
		}
		
		
		 void insurance() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srikanth\\Desktop\\navya\\chromedriver79\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "https://davies-group.com/";
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='eut-inner-header']/div/div[2]/ul/li[1]/a")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String url= "https://davies-group.com/?s=Insurance";
			driver.get(url);
			String enteredtext1 = driver.findElement(By.cssSelector("input[class=eut-search-textfield]")).getAttribute("value");
			String enteredtext2=driver.findElement(By.xpath("//*[@id=\"eut-page-title-content\"]/div/h1/span")).getText();
			System.out.println(enteredtext2);
		    System.out.println(enteredtext1);
		   		
		    driver.findElement(By.linkText("Insurance Services")).click();
		    String Insurl=driver.getCurrentUrl();
		    System.out.println(Insurl);		    
		    driver.close();
			
		}
		
		 void map() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\srikanth\\Desktop\\navya\\chromedriver79\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "https://davies-group.com/";
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.manage().window().maximize();
			WebElement ele = driver.findElement(By.xpath("//*[@id='eut-inner-header']/div/div[3]/div"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			
			WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"menu-item-1540\"]/i"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", ele1);
			
			driver.findElement(By.xpath("//*[@id=\"menu-item-84\"]/a/span")).click();			
			String location=driver.findElement(By.xpath("//*[@id='wd-map2']/div/div/div[1]/div[3]/div/div[3]/div[21]")).getAttribute("title");
			System.out.println(location);
			WebElement ele2=driver.findElement(By.xpath("//*[@id='wd-map2']/div/div/div[1]/div[3]/div/div[3]/div[21]"));
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].click();", ele2);
			String stokeadress=driver.findElement(By.xpath("//*[@id='wd-map2']/div/div/div[1]/div[3]/div/div[4]/div/div/div/div/div/div/div[2]")).getText();
			System.out.println(stokeadress);
			driver.close();
			
		}
		
		
}
		

	


