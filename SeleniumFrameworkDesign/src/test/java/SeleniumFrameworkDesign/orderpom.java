package SeleniumFrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orderpom {
	@Test(description="user can order the mobile by entering all valid details")
    public void ordervalid(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     Landingpage ordr = new Landingpage(driver);
	     ordr.Order("Vavitha","MKE","vavi@gmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
	     driver.quit();
	     

	       }
      @Test(description="user cant order the mobile by leaving the username space empty")
      public void orderusername(){
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://mobileworld.banyanpro.com/");
          Landingpage ordr = new Landingpage(driver);
          ordr.Order(" ","MK","vavi@gmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
          String actual="driver.getCurrentURL";
          String expected="https://mobileworld.banyanpro.com/order.html";
          Assert.assertEquals(actual, expected);
          driver.quit();
          }
      @Test(description="user cant order the mobile by entering invalid gmail id")
      public void ordergmail(){
   	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://mobileworld.banyanpro.com/");
          Landingpage ordr = new Landingpage(driver);
          ordr.Order("Vavitha ","MK","vavigmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
          String actual="driver.getCurrentURL";
          String expected="https://mobileworld.banyanpro.com/order.html";
          Assert.assertEquals(actual, expected);
          driver.quit();
          }
      @Test(description="user cant order the mobile by entering special characters in password")
      public void orderpassword(){
   	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://mobileworld.banyanpro.com/");
          Landingpage ordr = new Landingpage(driver);
          ordr.Order("vavitha","MK","vavi@gmail.com", "VAV!@3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
          String actual="driver.getCurrentURL";
          String expected="https://mobileworld.banyanpro.com/order.html";
          Assert.assertEquals(actual, expected);
          driver.quit();
           }
      @Test(description="user cant order the mobile by entering phonenumber less than 10")
      public void orderphonenumber(){
   	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAvi3", "8975675","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
           driver.quit();
           }
      @Test(description="user cant order the mobile by entering invalid address")
      public void orderaddress(){
   	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAV3", "8975675645","ME", "AGALI","PALAKKAD", "5464789654", "1", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
           driver.quit();
          }
      @Test(description="user cant order the mobile by entering invalid zip")
      public void orderzip(){
   	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAV3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
           driver.quit();
          }
      @Test(description="user cant order the mobile by entering count number as negativenumbers")
      public void ordercount(){
   	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAV3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "-2", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
           driver.quit();
          }
      
      
      
      
          
     
}
 

		
		
		 
	