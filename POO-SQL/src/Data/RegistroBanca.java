package Data;

import java.util.ArrayList;

public class RegistroBanca {
	private ArrayList<String> registro= new ArrayList<String>();

	public RegistroBanca(ArrayList<String> registro) {
		super();
		this.registro = registro;
	}

	public ArrayList<String> getRegistro() {
		return registro;
	}

	public void setRegistro(ArrayList<String> registro) {
		this.registro = registro;
	}
	
	
}
