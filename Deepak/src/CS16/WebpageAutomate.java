package CS16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageAutomate {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../Deepak/exefiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sarfarazirshad@gmail.com");
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("Convergys786");
		WebElement Login=driver.findElement(By.name("login"));
		Login.click();
		WebElement Acc=driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]"));
		Acc.click();
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
		logout.click();
		
		
		
		
		
		

	}

}
