import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());

	}

}
