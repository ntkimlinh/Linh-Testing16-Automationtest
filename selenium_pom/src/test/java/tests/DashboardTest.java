package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest{

    @Test(description = "Test logout")
    public void testLogout() throws InterruptedException {
        LoginPage loginPage = new LoginPage(GetDriver(),GetWait());
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(GetDriver(), GetWait());
        dashboardPage.logout();

        String currentUrl = GetDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("auth/login"));
    }
}