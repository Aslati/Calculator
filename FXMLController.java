import javafx.fxml.FXML;
import javafx.scene.control.TextField;
//A controlling class for GUI, though does nothing right now, works only ran from IntelliJ
public class FXMLController {
    @FXML
    private TextField textField;

    @FXML
    private void setTextField1(){
        textField.setText(textField.getText()+"1");
    }
    @FXML
    private void setTextField2(){
        textField.setText(textField.getText()+"2");
    }
    @FXML
    private void setTextField3(){
        textField.setText(textField.getText()+"3");
    }
    @FXML
    private void setTextField4(){
        textField.setText(textField.getText()+"4");
    }
    @FXML
    private void setTextField5(){
        textField.setText(textField.getText()+"5");
    }
    @FXML
    private void setTextField6(){
        textField.setText(textField.getText()+"6");
    }
    @FXML
    private void setTextField7(){
        textField.setText(textField.getText()+"7");
    }
    @FXML
    private void setTextField8(){
        textField.setText(textField.getText()+"8");
    }
    @FXML
    private void setTextField9(){
        textField.setText(textField.getText()+"9");
    }
    @FXML
    private void setTextField0(){
        textField.setText(textField.getText()+"0");
    }
    @FXML
    private void setTextFieldPlus(){
        textField.setText(textField.getText()+" + ");
    }
    @FXML
    private void setTextFieldMinus(){
        textField.setText(textField.getText()+" - ");
    }
    @FXML
    private void setTextFieldMultiply(){
        textField.setText(textField.getText()+" * ");
    }
    @FXML
    private void setTextFieldDivide(){
        textField.setText(textField.getText()+" / ");
    }
    @FXML
    private void setTextFieldSquare(){
        textField.setText(textField.getText()+" ^ ");
    }
    @FXML
    private void setTextFieldDot(){
        textField.setText(textField.getText()+".");
    }
    @FXML
    private void setTextFieldPi(){
        textField.setText(textField.getText()+ Math.PI);
    }
    @FXML
    private void setTextFieldE(){
        textField.setText(textField.getText()+ Math.E);
    }
    @FXML
    private void setTextFieldLog(){ textField.setText(textField.getText()+ " log "); }
    @FXML
    private void setTextFieldLn(){ textField.setText(textField.getText()+ " ln "); }
    @FXML
    private void setTextFieldOpeningBracket(){ textField.setText(textField.getText()+ "( "); }
    @FXML
    private void setTextFieldClosingBracket(){ textField.setText(textField.getText()+ " )"); }
    @FXML
    private void setTextFieldEmpty(){ textField.setText(" "); }
    @FXML
    private void getText(){
        String a = textField.getText();
        textField.setText(" ");
        String result = Model.count(Model.prepare(a));
        textField.setText(result);
    }
}
