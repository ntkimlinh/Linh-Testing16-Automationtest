package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class aribnbHomePage {
//    Thanh Header 1,2,3,4
    private static final By LOGO_CYBERSOFT = By.xpath("//span[text()='CyberSoft']"); //1
    private static final By HOME = By.linkText("Home"); //2
    private static final By ABOUT = By.linkText("About");//3
    private static final By BTN_USER_PROFILE = By.xpath("//img[contains(@src, '6596121.png')]/.."); //4

//    Thanh tìm kiếm chính 5,6,7
    private static final By BTN_LOCATION_INPUT = By.xpath("//p[text()='Địa điểm']");
    private static final By BTN_DATE_PICKER = By.xpath("//p[contains(., '/')]");
    private static final By BTN_ADD_GUESTS = By.xpath("//p[text()='Thêm khách']/ancestor::div[1]");

//    Tăng giảm số lượng khách ở phần thêm khách 8,9
    private static final By BTN_INCREASE_GUESTS = By.xpath("//button//div[text()='+']");
    private static final By BTN_DECREASE_GUESTS = By.xpath("//button//div[text()='-']");

//    Thanh Bộ lọc 12,13
    private static final By BTN_FILTER_ROOM_TYPE = By.xpath("//button[text()='Loại nơi ở']");
    private static final By BTN_FILTER_PRICE = By.xpath("//button[text()='Giá']");

//    Danh sách các thẻ địa điểm 10,11,14
    private static final By CARD_HO_CHI_MINH = By.xpath("//h2[text()='Hồ Chí Minh']/ancestor::div[contains(@class,'ant-card-hoverable')]");
    private static final By TXT_CAN_THO = By.xpath("//h2[text()='Cần Thơ']");
    private static final By TIME_NHA_TRANG = By.xpath("//p[contains(text(),'6.5 giờ')]");

    public static void main(String[] args) {

        WebDriver driver = BasePage.initDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demo5.cybersoft.edu.vn");
        System.out.println("Đã mở trang web thành công!");

        try{
            WebElement userMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(BTN_USER_PROFILE));
            userMenu.click();
            System.out.println("Click thành công nút User Menu [4]");

            // 3. Test click vào ô Địa điểm (Số 5)
            WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated(BTN_LOCATION_INPUT));
            location.click();
            System.out.println("Click thành công ô Địa điểm [5]");

            // 5. Lấy ra text thời gian của Nha Trang (Số 14)
            WebElement time = wait.until(ExpectedConditions.visibilityOfElementLocated(TIME_NHA_TRANG));
            time.getText();
            System.out.println("Thời gian lái xe của Nha Trang hiển thị là: " + time.getText());

            // 6. Test mở ô Thêm khách (Số 7) và click nút Cộng tăng số lượng (Số 9)
            WebElement addGuests = wait.until(ExpectedConditions.visibilityOfElementLocated(BTN_ADD_GUESTS));
            addGuests.click(); // Click khung rộng số 7 để popover hiện ra

            Thread.sleep(3000); // Chờ 1 giây để bảng chọn khách kịp hiển thị

            WebElement increaseGuests = wait.until(ExpectedConditions.visibilityOfElementLocated(BTN_INCREASE_GUESTS));
            increaseGuests.click();
            System.out.println("Mở Thêm khách và click tăng số lượng khách,");

        } catch (Exception e) {
            System.err.println("Gặp lỗi trong quá trình chạy Automation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Giữ trình duyệt lại 3 giây để nhìn kết quả trước khi tắt
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            driver.quit();
            System.out.println("Đã đóng trình duyệt.");
        }

    }
}