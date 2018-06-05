import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {
    public static void main(String[] args) throws InterruptedException {
        //messageNotificaion();
        customNews();
    }

    public static void messageNotificaion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("0935718485");
        driver.findElement(By.id("pass")).sendKeys("thetiger@2017");
        driver.findElement(By.id("loginbutton")).click();
        String num_notifications = driver.findElement(By.id("notificationsCountValue")).getText();
        System.out.println("the number of notifications is " + num_notifications);
        driver.close();

    }

    public static void customNews() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.bbc.com/news/world/africa");
//Thread.sleep(5000);By.xpath("(//span[@class='title-link__title-text'])[0]")
        WebElement headElement = driver.findElement(By.cssSelector("span.title-link__title-text"));
        String newsHead = headElement.getText();
        System.out.println(newsHead);

        WebElement contentElement = driver.findElement(By.cssSelector("p.buzzard__summary"));
        String newsContent = contentElement.getText();
        System.out.println(newsContent);

//        WebElement imageElement = driver.findElement(By.cssSelector("img.js-image-replace"));
//        String newsImage = imageElement.getText();
//        System.out.println(newsImage);

        driver.navigate().to("http://localhost/customNews/dataInput.php");
        driver.findElement(By.name("bbctitle")).sendKeys(newsHead);
        driver.findElement(By.name("bbccontent")).sendKeys(newsContent);
        driver.findElement(By.name("submit")).click();
    }
}


