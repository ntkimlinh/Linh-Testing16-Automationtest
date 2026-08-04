package pages;

import org.openqa.selenium.By;

public class hrmAdminPage {
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

}
