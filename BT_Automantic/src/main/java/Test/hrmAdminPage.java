package Test;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hrmAdminPage extends BasePage {
    private static final By USER_INPUT = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private static final By USER_ROLE_SELECT = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");

    //    1. Thanh Sidebar
    private static final By ADMIN_1 = By.xpath("//span[text()='Admin']");
    private static final By PIM_2 = By.xpath("//span[text()='PIM']");
    private static final By LEAVE_3 = By.xpath("//span[text()='Leave']");
    private static final By BTN_19 = By.xpath("//button[contains(@class, 'oxd-main-menu-button')]");

    //     2. Khu vực Bộ lọc tìm kiếm (System Users Filter)
    private static final By SEARCH_USERNAME_4 = By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input");
    private static final By DROPDOWN_USER_ROLE_5 = By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[contains(@class, 'oxd-select-text')]");
    private static final By OPTION_ADMIN_6 = By.xpath("//div[@role='listbox']//span[text()='Admin']");
    private static final By OPTION_ESS_7 = By.xpath("//div[@role='listbox']//span[text()='ESS']");
    private static final By SEARCH_EMPLOYEE_NAME_8 = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input");
    private static final By BTN_RESET_9 = By.xpath("//button[text()=' Reset ']");
    private static final By BTN_SEARCH_10 = By.xpath("//button[@type='submit']");
    private static final By BTN_TOGGLE_FILTER_20 = By.xpath("//div[contains(@class, 'oxd-table-filter-header')]//button");

    //     3. Thanh Topbar
    private static final By DROPDOWN_USER_MANAGEMENT_11 = By.xpath("//span[contains(text(), 'User Management')]");
    private static final By TITLE_18 = By.xpath("//h6[contains(@class, 'oxd-topbar-header-breadcrumb')]");

    //     4. Danh sách kết quả (Bảng dữ liệu) & Nút chức năng
    private static final By BTN_ADD_21 = By.xpath("//button[contains(., 'Add')]");
    private static final By COL_HEADER_USER_ROLE_16 = By.xpath("//div[@role='columnheader'][contains(., 'User Role')]");
    private static final By COL_HEADER_EMPLOYEE_NAME_17 = By.xpath("//div[@role='columnheader'][contains(., 'Employee Name')]");

    //     5. Dòng cụ thể của user "bala22"
    private static final By CELL_USERNAME_BALA22_12 = By.xpath("//div[@role='row' and contains(., 'bala22')]//div[2]");
    private static final By CELL_USER_ROLE_BALA22_13 = By.xpath("//div[@role='row' and contains(., 'bala22')]//div[3]");
    private static final By BTN_DELETE_BALA22_14 = By.xpath("//div[@role='row' and contains(., 'bala22')]//i[contains(@class, 'bi-trash')]");
    private static final By BTN_EDIT_BALA22_15 = By.xpath("//div[@role='row' and contains(., 'bala22')]//i[contains(@class, 'bi-pencil-fill')]");

    //     Các locator phụ trợ phục vụ cho việc Đăng nhập
    private static final By LOGIN_USERNAME_INPUT = By.name("username");
    private static final By LOGIN_PASSWORD_INPUT = By.name("password");
    private static final By LOGIN_SUBMIT_BUTTON = By.cssSelector("button[type='submit']");

    public hrmAdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait); // Lệnh này truyền driver sang dòng số 13 bên file BasePage của bạn
    }

    public void open() {
        Allure.step("Open admin page", () -> {
            driver.get("https://opensource-demo.orangehrmlive.com/");
            wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(LOGIN_USERNAME_INPUT));
        });
    }
    public static void main(String[] args) {

        WebDriver driver1 = BasePage.initDriver();
        WebDriverWait wait1 = new WebDriverWait(driver1, Duration.ofSeconds(20));
        hrmAdminPage adminPage = new hrmAdminPage(driver1, wait1);

        try {
            adminPage.open();
            Thread.sleep(3000);

            // Thực hiện Đăng nhập để vào màn hình chính
            System.out.println("Đăng nhập");
            driver1.findElement(LOGIN_USERNAME_INPUT).sendKeys("Admin");
            driver1.findElement(LOGIN_PASSWORD_INPUT).sendKeys("admin123");
            Thread.sleep(2000);
            driver1.findElement(LOGIN_SUBMIT_BUTTON).click();
            wait1.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(ADMIN_1));

            // Bước 2: Từ Sidebar bên tay trái, chọn Admin (Số 1)
            System.out.println("Chọn Admin");
            WebElement adminMenu = driver1.findElement(ADMIN_1);
            adminMenu.click();
            wait1.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(DROPDOWN_USER_ROLE_5));

            // Mở Dropdown User Role -> Chọn ESS
            System.out.println("Sreach Role ESS");
            driver1.findElement(DROPDOWN_USER_ROLE_5).click();
            driver1.findElement(OPTION_ESS_7).click();
            Thread.sleep(3000);

            driver1.findElement(BTN_SEARCH_10).click();
            wait1.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(SEARCH_USERNAME_4));
            Thread.sleep(2000);

            System.out.println("Sreach bằng UserName");
            driver1.findElement(SEARCH_USERNAME_4).sendKeys("testerone");
            Thread.sleep(3000);
            driver1.findElement(BTN_SEARCH_10).click();
            Thread.sleep(5000);

            System.out.println("PASS");

        } catch (Exception e) {
            System.err.println("Gặp lỗi trong quá trình thực thi: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (driver1 != null) {
                driver1.quit();
            }
        }
    }

}
