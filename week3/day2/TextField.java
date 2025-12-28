package week3.day2;

public class TextField extends WebElement {

    public String getText() {
        return "Returning text from TextField";
    }
    public static void main(String[] args) {
    TextField textField = new TextField();
    textField.setText("Selenium");
    System.out.println(textField.getText());
    }
}
