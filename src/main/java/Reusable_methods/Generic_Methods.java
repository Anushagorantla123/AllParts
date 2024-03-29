package Reusable_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_Methods {
	
	/**public means to access(use) the any where of the project and webDriver is interface*/
	public static WebDriver driver;
	
	/** this variable used for exceplity wait*/
	private WebDriverWait wait;
	
	/**
	   * this method is used for common clickable functionality in webapplication
	   * <p>                                  
	   * elementlocator parameter is a webelement locator path in dom structure.
	   */
		public boolean clickElement(By elementLocator)
		{
			WebElement ele=driver.findElement(elementLocator);
			if(ele.isDisplayed() & ele.isEnabled())
			{
				try
				{
					ele.click();
					return true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;	
				}
				
			}
			else
			{
				return false;
			}
			
		}
		
		/**This method used for Explicity Wait..
		 * <p>
		 * parameters are element means locator path 
		 * <p>
		 * time duration of seconds */
		public void elementdelay(By element,long time)
		{	
			WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(time))
			        .until(ExpectedConditions.elementToBeClickable((element)));	
			
		}
		
		/**This method used for sending the text in the text field...
		 * <p>
		 * parameters are elementLocator means textfield locator path in dom structure.
		 * <p>
		 * text means sending the data */
		public boolean enterText(By elementLocator, String text)
		{
			
			if(elementEnable(elementLocator) & elementDisplay(elementLocator))
			{
				try
				{
					driver.findElement(elementLocator).sendKeys(text);
					return true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		
		/**This method used for Enable the element...
		 * <p>
		 * parameters are elementLocator means element locator path in dom structure.
		 */
		public boolean elementEnable( By elementLocator)
		{
			try
			{
				driver.findElement(elementLocator).isEnabled();
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
		}
		
		/**This method used for Display the element...
		 * <p>
		 * parameters are elementLocator means element locator path in dom structure.
		 */
		public boolean elementDisplay(By elementLocator)
		{
			try
			{
				driver.findElement(elementLocator).isDisplayed();
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
		}
		
		/**This method used for Select the element...
		 * <p>
		 * parameters are elementLocator means element locator path in dom structure.
		 */
		public boolean elementSelecte(By elementLocator)
		{
			try
			{
				driver.findElement(elementLocator).isSelected();
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
		}

		
		/**Generic method for Select_By_Text functionality.
		 * <p>
		 *  dom structure tag mustbe Select.
		 *  <p>
		 *  paramters are elementlocator means element path and text means dropdown text*/
		public boolean dropDownSelectText(By elementLocator, String text)
		{
			if(elementEnable(elementLocator) & elementDisplay(elementLocator))
			{
				try 
				{
				Select drpCountry = new Select(driver.findElement(elementLocator));
				drpCountry.selectByVisibleText(text);
				return true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		/**Generic method for Select_By_Index functionality.
		 * <p>
		 *  dom structure tag mustbe Select.
		 *  <p>
		 *  paramters are elementLocator means element path and index means dropdown index value*/
		public boolean dropDownSelectIndex(By elementLocator,int index)
		{
			if(elementEnable(elementLocator) & elementDisplay(elementLocator))
			{
				try 
				{
				Select drpCountry = new Select(driver.findElement(elementLocator));
				drpCountry.selectByIndex(index);
				return true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		/**Generic method for Dropdown functionality.
		 * <p>
		 *  dom structure without Select tag.
		 *  <p>
		 *  paramters are elementLocator1 means dropdown element path and 
		 *  paramters are elementLocator2 means inside the dropdown text element path.*/
		public boolean Dropdown_Click(By elementLocator1, By elementLocator2)
		{
			if(elementEnable(elementLocator1) & elementDisplay(elementLocator1))
			{
				try 
				{
				  clickElement(elementLocator1);
				  clickElement(elementLocator2);
				return true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		
		
		/**This method used for Check Box the element...
		 * <p>
		 * parameters elementlocator means element path in dom structure.
		 */
		public boolean Checkbox(By elementLocator)
		{
			if(elementEnable(elementLocator) & elementDisplay(elementLocator))
			{
				try 
				{
					clickElement(elementLocator);
				return true;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		

		/**This method used for Radio Button the element...
		 * <p>
		 * parameters elementlocator means element path in dom structure.
		 */
		public boolean Radiobutton(By elementLocator)
				{
					if(elementEnable(elementLocator) & elementDisplay(elementLocator))
					{
						try 
						{
							clickElement(elementLocator);
						return true;
						}
						catch(Exception e)
						{
							e.printStackTrace();
							return false;
						}
					}
					else
					{
						return false;
					}
				}
		
		/**This method used for Clear the element text field...
		 * <p>
		 * parameters elementlocator means element path in dom structure.
		 */
		public boolean textClear(By elementLocator)
				{
					if(elementEnable(elementLocator) & elementDisplay(elementLocator))
					{
						try 
						{
						  driver.findElement(elementLocator).clear();
						return true;
						}
						catch(Exception e)
						{
							e.printStackTrace();
							return false;
						}
					}
					else
					{
						return false;
					}
				}
		
		/**This method used for Scrolldown the page...
		 * <p>
		 * parameters num means page scroll down to end number.
		 */
		public void Scroll_dwn(int num)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,"+num+")", "");
		}
}
