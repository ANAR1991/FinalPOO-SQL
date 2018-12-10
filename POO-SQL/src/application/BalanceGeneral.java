package application;

import javafx.fxml.FXML;

public class BalanceGeneral {
	private Main main;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	@FXML
	public void esenaBalanceGeneral(){
		main.esenaBalanceGeneral();
	}
	
}
