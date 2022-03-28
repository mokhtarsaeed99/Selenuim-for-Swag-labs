import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSeleniumonChrorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\mokhtar\\programs\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
	}

}
