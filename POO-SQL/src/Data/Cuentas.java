package Data;

public class Cuentas {
	private String banco;
	private String numeroCuenta;
	private String propietario;
	private long capital;
	protected byte codigoAcceso;
	public Cuentas(String banco, String numeroCuenta, String propietario, long capital, byte codigoAcceso) {
		super();
		this.banco = banco;
		this.numeroCuenta = numeroCuenta;
		this.propietario = propietario;
		this.capital = capital;
		this.codigoAcceso = codigoAcceso;
	}
	@Override
	public String toString() {
		return "Cuentas [banco=" + banco + ", numeroCuenta=" + numeroCuenta + ", propietario=" + propietario
				+ ", capital=" + capital + ", codigoAcceso=" + codigoAcceso + "]";
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public long getCapital() {
		return capital;
	}
	public void setCapital(long capital) {
		this.capital = capital;
	}
	public byte getCodigoAcceso() {
		return codigoAcceso;
	}
	public void setCodigoAcceso(byte codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	

}
