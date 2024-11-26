package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.util.List;

public class Assignment {
    public static void main(String[] args) throws InterruptedException, AWTException {
        // Initialize WebDriver
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        // Perform Google Search for "Fitpeo"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Fitpeo");
        searchBox.submit();
        Thread.sleep(1000);

        // Navigate to Fitpeo website and revenue calculator
        driver.get("https://fitpeo.com/");
        Thread.sleep(2000);
        driver.get("https://fitpeo.com/revenue-calculator");
        Thread.sleep(2000);

        // Scroll down the page
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

        // Locate and style the slider element
        WebElement slider = driver.findElement(By.xpath("//span[@data-index='0']"));
        jsExecutor.executeScript("arguments[0].style.backgroundColor = 'orange';", slider);

        // Drag and drop slider
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.dragAndDropBy(slider, 94, 0).perform();

        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.ARROW_LEFT).perform();
            Thread.sleep(1);
        }
        Thread.sleep(2000);
        // Locate input field and enter value
        WebElement inputField = driver.findElement(By.xpath("//input[@id=':R57alklff9da:']"));
        actions.click(inputField);

        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(100);
        }
        Thread.sleep(2000);

        inputField.sendKeys("560");
        Thread.sleep(4000);

        // Scroll down further
        jsExecutor.executeScript("window.scrollBy(0,700)");

        // Select checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < checkboxes.size(); i++) {
            if (i <= 2) {
                checkboxes.get(i).click();
            }
            Thread.sleep(1000);
        }

        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollBy(0,900)");

        for (int i = 0; i < checkboxes.size(); i++) {
            if (i == 7) {
                checkboxes.get(i).click();
            }
        }

        Thread.sleep(2000);

        // Modify input field value
        WebElement inputField2 = driver.findElement(By.xpath("//input[@id=':R57alklff9da:']"));
        actions.click(inputField2);

        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(1);
        }
        Thread.sleep(2000);

        inputField2.sendKeys("820");
        Thread.sleep(4000);

        jsExecutor.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollBy(0,900)");
        Thread.sleep(8000);
        driver.quit();
    }
}

