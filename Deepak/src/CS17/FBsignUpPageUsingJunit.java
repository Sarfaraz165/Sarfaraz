package CS17;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class FBsignUpPageUsingJunit {
		
	ChromeDriver driver; //Declaration 
	
	//public static void main(String[] args) throws InterruptedException {
		
	@Before
	public void T1()
	{
	System.setProperty("webdriver.chrome.driver","../Deepak/exefiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://WWW.facebook.com");
	driver.manage().window().maximize();
	}
	
	@Test
	public void T2() throws InterruptedException
	{
	WebElement CreateAccount=driver.findElement(By.cssSelector("a#u_0_2"));
	CreateAccount.click();
	
	Thread.sleep(3000);
	WebElement Firstname=driver.findElement(By.name("firstname"));
	Firstname.sendKeys("Sarfaraz");
	
	Thread.sleep(3000);
	WebElement Surname=driver.findElement(By.xpath("//*[@id=\"u_2_d\"]"));
	Surname.sendKeys("Irshad");
	
	Thread.sleep(3000);
	WebElement MobileNo=driver.findElement(By.xpath("//*[@id=\"u_2_g\"]"));
	MobileNo.sendKeys("9311518106");
	
	Thread.sleep(3000);
	WebElement Password=driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
	Password.sendKeys("321321");
	
	Thread.sleep(3000);
	WebElement bday=driver.findElement(By.name("birthday_day"));
	Select s=new Select(bday);
	s.selectByVisibleText("6");
	
	Thread.sleep(2000);
	WebElement bmonth=driver.findElement(By.name("birthday_month"));
	Select s1=new Select(bmonth);
	s1.selectByVisibleText("Mar");
	
	Thread.sleep(2000);
	WebElement byear=driver.findElement(By.name("birthday_year"));
	Select s2=new Select(byear);
	s2.selectByVisibleText("1985");
	
	Thread.sleep(2000);
	WebElement Rbutton=driver.findElement(By.xpath("//*[@id=\"u_2_o\"]/span[3]/label"));
	Rbutton.click();
	WebElement pron=driver.findElement(By.name("preferred_pronoun"));
	pron.click();
	Select s3=new Select(pron);
	s3.selectByIndex(1);
	
	Thread.sleep(2000);
	WebElement gender=driver.findElement(By.xpath("//*[@id=\"u_2_q\"]"));
	gender.sendKeys("Male");
	
	Thread.sleep(2000);
	WebElement submit=driver.findElement(By.name("websubmit"));
	submit.click();
	}
	
	@After
	public void T3()
	{
		driver.close();
	}
	}
