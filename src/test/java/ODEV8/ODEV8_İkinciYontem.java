package ODEV8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ODEV8_İkinciYontem {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            try {

                driver.get("https://demoqa.com/webtables");
                driver.manage().window().maximize();
                Thread.sleep(2000);


                WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
                addButton.click();


                driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ali");
                driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Emre");
                driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("aliemrebulbul@gmailll.com");
                driver.findElement(By.xpath("//input[@id='age']")).sendKeys("30");
                driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("22000");
                driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Engineering");


                driver.findElement(By.xpath("//button[@id='submit']")).click();
                Thread.sleep(5000);


                WebElement editButton = driver.findElement(By.xpath("//div[text()='Ali']/following::span[@title='Edit'][1]"));
                editButton.click();
                Thread.sleep(9000);


                WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='lastName']"));
                lastNameInput.clear();
                lastNameInput.sendKeys("BÜLBÜL");


                driver.findElement(By.xpath("//button[@id='submit']")).click();
                Thread.sleep(8000);


                WebElement deleteButton = driver.findElement(By.xpath("//div[text()='Ali']/following::span[@title='Delete'][1]"));
                deleteButton.click();
                Thread.sleep(8000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

                driver.quit();
            }
        }
    }

