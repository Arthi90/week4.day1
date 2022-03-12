package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAssignFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (30));
		
		WebElement element=driver.findElement(By.id("iframewrapper"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[@text()='Try it']")).click();
		Alert alt1 = driver.switchTo().alert();
		String text1=alt1.getText();
		System.out.println(text1);
		alt1.sendKeys("TestLeaf");
		alt1.dismiss();
		
         

	}

}
