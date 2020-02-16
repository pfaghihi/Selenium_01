import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestRoot {

       public static void main(String[] args){
           System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver\\geckodriver.exe");
           FirefoxDriver driver=new FirefoxDriver();
           driver.get("http://demo.guru99.com/");
           // WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
           // element.sendKeys("abc@gmail.com");

           //WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
            //button.click();
        }

}
