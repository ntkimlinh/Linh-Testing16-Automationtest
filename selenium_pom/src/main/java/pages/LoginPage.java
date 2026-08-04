package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.ScreenshotUtil;

public class LoginPage extends BasePage{
//    <input data-v-1f99f73c=""
//    class="oxd-input oxd-input--active"
//    name="username"
//    placeholder="Username"
//    autofocus="">

    private static final By USERNAME = By.xpath("//input[@name='username']");
    private static final By PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver,  WebDriverWait wait) {
        super(driver, wait);
    }

    public void openLoginPage() {
        Allure.step("Open login page", () -> {
            String url = ConfigReader.get("login.base.url");
            driver.get(url);
            wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME));
        });
        ScreenshotUtil.takeScreenshot(driver, "Login_page");
    }

    public void enterUsername(String username) throws InterruptedException {
        Allure.step("Enter username: " + username, () -> {
            WebElement usernameInput = driver.findElement(USERNAME);
            highlight(usernameInput);

            usernameInput.sendKeys(username);
            ScreenshotUtil.takeScreenshot(driver, "enter_username");
            Thread.sleep(2000);
            unhighlight(usernameInput);
        });
    }

    public void enterPassword(String password) throws InterruptedException {
        Allure.step("Enter password: ", () ->{
            WebElement passwordInput = driver.findElement(PASSWORD);
            highlight(passwordInput);

            passwordInput.sendKeys(password);
            ScreenshotUtil.takeScreenshot(driver, "enter_password");
            Thread.sleep(2000);
            unhighlight(passwordInput);
        });
    }

    public void clickLoginButton() throws InterruptedException {
        Allure.step("Click login button: ", () -> {
            WebElement loginButton = driver.findElement(LOGIN_BUTTON);

            ScreenshotUtil.takeScreenshot(driver, "click_login_btn");

            loginButton.click();
            Thread.sleep(2000);
            unhighlight(loginButton);
        });
    }
//Gốm 3 cái trên lại
    public void login(String username, String password) throws InterruptedException {
        openLoginPage();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

}
