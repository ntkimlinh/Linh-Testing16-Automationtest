public class LoginTest extends BaseTest{
    private LoginPage loginPage = new LoginPage();

    @Override
    public void runTest(){
        loginPage.Login("admin","123456");
        System.out.println("Login successful");
        loginPage.verifyLoginSuccess("admin", "123456");
    }
}
