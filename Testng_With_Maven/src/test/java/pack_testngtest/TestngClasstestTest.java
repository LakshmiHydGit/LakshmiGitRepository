package pack_testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngClasstestTest {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.youtube.com/watch?v=aqz-KE-bpKQ");
	  driver.manage().window().maximize();
	  String actualResult = driver.getTitle();
	  System.out.println(actualResult);
	  String expectedResult="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	  Assert.assertEquals(actualResult, expectedResult);
	  
  }
}
