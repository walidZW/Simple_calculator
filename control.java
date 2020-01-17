package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class control {
  @FXML
	private Label result;
    private long number1=0;
    private String operator="";
    private boolean start=true;
    private modal model=new modal();
  
	@FXML
	public void processnumber(ActionEvent e) {
		if(start) {
			result.setText("");
			start=false;
			
		}
		
		String value=((Button)e.getSource()).getText();
		result.setText(result.getText()+value);
		
		
	}
	@FXML
	public void processoperator(ActionEvent e) {
		String value=((Button)e.getSource()).getText();
		
		if(!value.equals("=")) {
			if(!operator.isEmpty()) {
				return;
			}
			operator=value;
			number1=Long.parseLong(result.getText());
			result.setText("");
			
			
		}else {// if value is equal to =
			
			if(operator.isEmpty()) {
				return;
			}
			Long number2=Long.parseLong(result.getText());
			
			
			float output=model.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator="";
			start=true;
			      
		}
		
	
		
	}
}


