public class LoginPage {
    private String usernameLocator = "//div[@id='username']";
    private String passwordLocator = "div[@id='password']";
    private String loginButtonLocator = "//div[@id='loginButton']";

//    set1: enterUsername
    public void enterUsername(String username){
        System.out.println("Enter username: "+username);
    }

//    set2: enterPassword
    public void enterPassword(String password){
        System.out.println("Enter password: "+password);
    }

//    set3: click Login button
    public void clickLoginButton(){
        System.out.println("Click login button");
    }

//    gôm 3 step về 1 function
    public void Login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

//    Function kiểm tra
    public void verifyLoginSuccess(String username, String password){
        System.out.println("Verify login sycess");
    }


}
