package genericutility;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	//public WebDriver driver;
	
	
	/**
	 * This method is used to maximize window
	 * @param driver
	 */
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}

public Dimension getSize(WebDriver driver) {
	return driver.manage().window().getSize();
	
}
/**
 * This method is used to switch driver control to window based on url
 */
public void switchToWindow(WebDriver driver,String url) {	
	//Step 1: Capture window ids
	Set<String> allWindows=driver.getWindowHandles();
	//Step 2: navigate through all the windows
	for (String id : allWindows) {
		driver.switchTo().window(id);
		String actUrl=driver.getCurrentUrl();
		if(actUrl.contains(url)) {
			break;
			
		}
	}
}
	public void rightClick(WebDriver driver) {
		Actions act= new Actions(driver);
		act.contextClick().perform();
	}
	
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions act= new Actions(driver);
		act.clickAndHold(element).perform();
	}
	public void mouseOver(WebDriver driver,WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void mouseHover(WebDriver driver,WebElement element,int x,int y) {
		Actions act= new Actions(driver);
		act.moveByOffset(x, y).perform();
	}
	public void switchToFrame(WebDriver driver,WebElement element,int index) {
		driver.switchTo().frame(index);
}
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
		
	}
	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		
	}
	public void switchBackToMainPage(WebDriver driver) {
	driver.switchTo().defaultContent();
	}
		public void selectDropDownByIndex(WebElement element,int index) {
			Select sel =new Select(null);
			sel.selectByIndex(index);
			
		}
		
				public void selectDropDownByValue(WebElement element,String value) {
					Select sel =new Select(null);
					sel.selectByValue(value);
					
				}
						public void selectDropDownByText(WebElement element,String text) {
							Select sel =new Select(null);
							sel.selectByVisibleText(text);
							
						}
						public void switchToAlertAndAccept(WebDriver driver) {
							driver.switchTo().alert().accept();
							
						
	}
						
						public void switchToAlertAndDismiss(WebDriver driver) {
							driver.switchTo().alert().dismiss();
							
						
	}
						public void switchToAlertAndAndSendKeys(WebDriver driver, String data) {
							driver.switchTo().alert().sendKeys(data);
							
						
	}
						public void jsScroll(WebDriver driver,int x,int y) {
							JavascriptExecutor js=(JavascriptExecutor)driver;
							js.executeScript("window.scrollBy("+x+","+y+")");
							
						}
	}
