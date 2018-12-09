package application;
import javafx.fxml.FXML;
public class AsientoContable {
	private Main main;
	@FXML
	public void finalizar(){
		System.exit(0);
	}
	
	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
}

