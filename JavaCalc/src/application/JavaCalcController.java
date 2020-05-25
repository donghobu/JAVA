package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaCalcController implements Initializable {
	
	@FXML private TextField txtDisp;
	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	
	@FXML private Button btnPlus;
	@FXML private Button btnMinus;
	@FXML private Button btnMulti;
	@FXML private Button btnDiv;
	@FXML private Button btnEq;
	@FXML private Button btnClear;
	
	private int operator;
	private int firstNum;
	private int secondNum;


	@Override
	public void initialize(URL location, ResourceBundle resource) {
		
		//이벤트와 핸들러 연결
		btn0.setOnAction(event->btn0Handler());
		btn1.setOnAction(event->btn1Handler());
		btn2.setOnAction(event->btn2Handler());
		btn3.setOnAction(event->btn3Handler());
		btn4.setOnAction(event->btn4Handler());
		btn5.setOnAction(event->btn5Handler());
		btn6.setOnAction(event->btn6Handler());
		btn7.setOnAction(event->btn7Handler());
		btn8.setOnAction(event->btn8Handler());
		btn9.setOnAction(event->btn9Handler());
		
		btnPlus.setOnAction(event->btnPlusHandler());
		btnMinus.setOnAction(event->btnMinusHandler());
		btnMulti.setOnAction(event->btnMultiHandler());
		btnDiv.setOnAction(event->btnDivHandler());
		btnEq.setOnAction(event->btnEqHandler());
		btnClear.setOnAction(event->btnClearHandler());

		
	} // initialize end
	
	
	// 핸들러 정의
	public void btn0Handler() {
		System.out.println("버튼0 클릭!!!");
	}

	public void btn1Handler() {
		txtDisp.setText("1");
		firstNum = 1;
	}
	public void btn2Handler() {
		txtDisp.setText("2");
		secondNum = 2;
	}
	public void btn3Handler() {}
	public void btn4Handler() {}
	public void btn5Handler() {}
	public void btn6Handler() {}
	public void btn7Handler() {}
	public void btn8Handler() {}
	public void btn9Handler() {}
	
	public void btnPlusHandler() {
		operator = 1;
	}
	public void btnMinusHandler() {
		operator = 2;
	}
	public void btnMultiHandler() {
		operator = 3;
	}
	public void btnDivHandler() {
		operator = 4;
	}
	public void btnEqHandler() {
		int result = 0;
		switch (operator) {
		case 1:
			result = firstNum + secondNum;
			break;
		case 2:
			result = firstNum - secondNum;
			break;
		case 3:
			result = firstNum * secondNum;
			break;
		case 4:
			result = firstNum / secondNum;
			break;
		}
		txtDisp.setText(""+result);
	}
	public void btnClearHandler() {
		txtDisp.clear();
		operator = 0;
		firstNum = 0;
		secondNum = 0;
		
	}

}
