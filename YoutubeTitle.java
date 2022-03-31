package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.youtube.com/";
		driver.get(url);
       driver.getTitle();
       String Actualtitle= driver.getTitle();
       System.out.println(Actualtitle);
      String ExpectedTitle="YouTube";
      if(ExpectedTitle.equals(Actualtitle))
      {
    	  System.out.println("The page is present");
      }
      else
      {
    	  System.out.println("The page is absent");
    	  
      }
      driver.quit();
   System.out.println("The code is commited to GitHub");
		

	}

}
