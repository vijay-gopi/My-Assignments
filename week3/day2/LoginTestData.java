package week3.day2;

public class LoginTestData extends TestData {

    public void enterUsername() {
        System.out.println("Entering Username");
    }

    public void enterPassword() {
        System.out.println("Entering Password");
    }
    public static void main(String[] args) {


        LoginTestData b = new LoginTestData();
        b.enterUsername();
        b.enterPassword();
        b.enterCredentials();       
        b.navigateToHomePage();     
    }
}