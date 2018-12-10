package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
public class Main extends Application {
	
	private Scene esenaPrincipal;
	private Scene asientoContable;
	private Scene partidaDoble;
	private Scene registro;
	private Scene balanceGeneral;
	private Scene estadoResultados;
	private Scene nuevoUsuario;
	private Scene listaUsuarios;
	private Scene agregarCuenta;
	private Scene agregarSubCuenta;
	
	
	private Stage principal;
	private Stage interfasControl;
	private Stage stageSubCuenta;
	
	
	private ControlPrincipal controlPrincipal;
	private ControlAcceso controlAcceso;
	private AsientoContable controlContable;
	private BalanceGeneral controlGeneral;
	private EstadoResultados controlResultados;
	private ListaUsuarios controlUsuarios;
	private NuevoUsuarios controlUsuariosN;
	private Registro controlRegistro;
	private PartidaDoble controlDoble;
	private Cuenta controlAgregarCuenta;
	private SubCuenta controlSubCuenta;
	
	public Stage getPrincipal() {
		return principal;
	}
	public void setPrincipal(Stage principal) {
		this.principal = principal;
	}
	
	public void start(Stage acceso) {
		principal=acceso;
		principal.setTitle("POO-SQL>AsientoContable>AgregarCuenta");
		interfasControl=acceso;
		stageSubCuenta=acceso;
		stageSubCuenta.setTitle("POO-SQL>AsientoContable>AgregarCuenta");
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Acceso.fxml"));
			acceso.initStyle(StageStyle.UNDECORATED); 
			AnchorPane accesoUsuario = (AnchorPane)loader.load();
			Scene accesoPas = new Scene(accesoUsuario,300,130);
			accesoPas.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			acceso.setScene(accesoPas);
			controlAcceso = loader.getController();
			controlAcceso.setMain(this);
			acceso.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void abrirPrincipa() {
		try {
			interfasControl= new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Scene.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			esenaPrincipal = new Scene(root);
			interfasControl.setTitle("POO-SQL");
			esenaPrincipal.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			interfasControl.setScene(esenaPrincipal);
			controlPrincipal = loader.getController();
			controlPrincipal.setMain(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		interfasControl.show();
	}
	public void esenaAsientoContable(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("AsientoContable.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			asientoContable = new Scene(root);
			interfasControl.setScene(asientoContable);
			controlContable = loader.getController();
			controlContable.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void esenaAgregarCuenta(){
		try {
			principal=new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Cuenta.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			agregarCuenta = new Scene(root);
			principal.setScene(agregarCuenta);
			controlAgregarCuenta = loader.getController();
			controlAgregarCuenta.setMain(this);
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		principal.show();
	}
	public void esenaAgregarSubCuenta(){
		try {
			stageSubCuenta=new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SubCuenta.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			agregarSubCuenta = new Scene(root);
			stageSubCuenta.setScene(agregarSubCuenta);
			controlSubCuenta = loader.getController();
			controlSubCuenta.setMain(this);
			
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		stageSubCuenta.show();
	}
	public void esenaBalanceGeneral(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("BalanceGeneral.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			balanceGeneral = new Scene(root);
			interfasControl.setScene(balanceGeneral);
			controlGeneral = loader.getController();
			controlGeneral.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void esenaEstadoResultados(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("EstadoResultados.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			estadoResultados = new Scene(root);
			interfasControl.setScene(estadoResultados);
			controlResultados = loader.getController();
			controlResultados.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void esenaListaUsuarios(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("ListaUsuarios.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			listaUsuarios = new Scene(root);
			interfasControl.setScene(listaUsuarios);
			controlUsuarios = loader.getController();
			controlUsuarios.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void esenaNuevoUsuario(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("NuevosUsuarios.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			nuevoUsuario = new Scene(root);
			interfasControl.setScene(nuevoUsuario);
			controlUsuariosN = loader.getController();
			controlUsuariosN.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void esenaRegistro(){

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Registro.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			registro = new Scene(root);
			interfasControl.setScene(registro);
			controlRegistro = loader.getController();
			controlRegistro.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void esenaPartidaDoble(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("PartidaDoble.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			partidaDoble = new Scene(root);
			interfasControl.setScene(partidaDoble);
			controlDoble = loader.getController();
			controlDoble.setMain(this);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public void regresarPrincipal(){
		interfasControl.setScene(esenaPrincipal);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
