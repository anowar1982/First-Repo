package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {
	//Perform mouse over function 
	public static void clickByID (WebDriver Ldriver, String id){
		Actions act = new Actions(Ldriver);
		act.moveToElement(Ldriver.findElement(By.id(id))).build().perform();
	}

}
