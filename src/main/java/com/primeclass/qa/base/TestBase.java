package com.primeclass.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.primeclass.qa.utills.TestUtils;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fp;

	public TestBase() {

		prop = new Properties();

		try {
			fp = new FileInputStream(
					"D:\\Core Java\\Cucumber-AakashPrime\\src\\main\\java\\com\\primeclass\\qa\\config\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			prop.load(fp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initialaztion() {

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\\\Selenium Training//chromedriver_win32//chromedriver.exe");

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			driver = new ChromeDriver();

		}

		else if (browsername.equals("firefox")) {

			System.setProperty("webdriver.geco.driver", "E:\\\\Selenium Training//geco.exe");
//			 System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
//			 Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtils.Implicit_wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}