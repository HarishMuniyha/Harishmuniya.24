package com.cucumber.baseclass;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\cucumber\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {

			} else {
				throw new Exception("Not a valid browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void waitForVisiblityOfAnElement(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static boolean elementIsDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static boolean elementIsEnabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getAttributeValue(WebElement element) throws Exception {
		try {
			String attribute = element.getAttribute("value");
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}
	}

	public static void sendKeys(WebElement element, String value) throws Exception {
		try {
			waitForVisiblityOfAnElement(element);
			boolean elementIsDisplayed = elementIsDisplayed(element);
			boolean elementIsEnabled = elementIsEnabled(element);
			if (elementIsDisplayed && elementIsEnabled) {
				element.clear();
				element.sendKeys(value);
			}
			String actual = getAttributeValue(element);
			Assert.assertEquals(value, actual);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getTextFromWebElement(WebElement element) throws Exception {
		try {
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void clickOnWebelement(WebElement element) throws Exception {
		try {
			waitForVisiblityOfAnElement(element);
			if (elementIsDisplayed(element)) {
				element.click();
				takescreenShot("");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.toString().replace(":", "_").substring(0, now.toString().length() - 4));
	}

	public static File takescreenShot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		LocalDateTime now = LocalDateTime.now();
		String timeStamp = now.toString().replace(":", "_").substring(0, now.toString().length() - 4);

		System.out.println(now.toString());
		File des = new File(""+timeStamp+fileName+".png");
		return des;

	}

}
