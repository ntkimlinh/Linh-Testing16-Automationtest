package Test;

import org.openqa.selenium.By;

public class amazonSearchResultPage {

//    Giá gốc bị gạch đi (List Price) của sản phẩm
    private static final By ORIGINAL_LIST_PRICE = By.xpath("//span[@data-a-strike='true']//span[@class='a-offscreen']");

//    Giá bán hiện tại của sản phẩm (Ví dụ: $72.00)
    private static final By CURRENT_PRODUCT_PRICE = By.xpath("//span[@class='a-price']//span[@class='a-offscreen']");

//    Ô Search ở thanh header có chữ "adidas"
    private static final By SEARCH_TEXT_BOX = By.xpath("//input[@id='twotabsearchtextbox']");

//    Giỏ hàng ở góc trên bên phải
    private static final By SHOPPING_CART_ICON = By.xpath("//a[@id='nav-cart']");

//    Thông tinđự kiến giao hàng + giá giao
    private static final By INFO_DELIVERY_DATE = By.xpath("//span[@class='a-text-bold']");

//    Thương hiệu sản phẩm (chữ "adidas" nhỏ phía trên tên sản phẩm)
    private static final By BRAND_NAME_ADIDAS = By.xpath("//span[@class='a-size-base-plus a-color-base'][text()='adidas']");

//    Checkbox chọn giới tính "Men" ở bộ lọc bên trái
    private static final By CHECKBOX_GENDER_MEN = By.xpath("//span[text()='Men']/preceding-sibling::div//input[@type='checkbox']");

//    Tổng số lượng kết quả "1-48 of over 20,000 results for..."
    private static final By TEXT_SEARCH_RESULT_COUNT = By.xpath("//h1[contains(@class,'s-desktop-toolbar')]//span[contains(text(),'results for')]");

//    Số sao của từng sản phẩm
    private static final By PRODUCT_RATING_STARS = By.xpath("//span[@class='a-icon-alt']");

}
