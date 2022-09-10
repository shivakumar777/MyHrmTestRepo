package com.hrm.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseConfiguration {

	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;

	public void invokeBrowser() {
		try {
			fis = new FileInputStream("src//test//resource//config.properties");
			prop = new Properties();
			prop.load(fis);

			String browser = prop.getProperty("browser");
//			if (browser.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", "src//test//resource//drivers//chromedriver.exe");
//				driver = new ChromeDriver();
//			} else 
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src//test//resource//drivers//firefox.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "src//test//resource//drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else {
			
				System.setProperty("webdriver.chrome.driver", "src//test//resource//drivers//chromedriver.exe");
				driver = new ChromeDriver();
			}

			driver.manage().window().maximize();
			
			driver.navigate().to(prop.getProperty("hrm_url"));

			String wait = prop.getProperty("impWait");
			int implictWait = Integer.parseInt(wait);
			driver.manage().timeouts().implicitlyWait(implictWait, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
