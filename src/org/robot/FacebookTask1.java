package org.robot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {

	public static void main(String[] args) throws AWTException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		//to enter url
		driver.get("https://www.facebook.com/");
		// to get title
		System.out.println("new code");
		System.out.println(" Conflict changed");
		String title = driver.getTitle();
		System.out.println(title);
		// find location of username
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
		// enter the username
		txtusername.sendKeys("shakeel25@gmail.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		

	}

}
