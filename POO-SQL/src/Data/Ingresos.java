package Data;

public class Ingresos {
	private int monto;
	private String motivo;
	private String detalles;
	private String remitente;
	private boolean formaPago;
	public Ingresos(int monto, String motivo, String detalles, String remitente, boolean formaPago) {
		super();
		this.monto = monto;
		this.motivo = motivo;
		this.detalles = detalles;
		this.remitente = remitente;
		this.formaPago = formaPago;
	}
	@Override
	public String toString() {
		return "Ingresos [monto=" + monto + ", motivo=" + motivo + ", detalles=" + detalles + ", remitente=" + remitente
				+ ", formaPago=" + formaPago + "]";
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public boolean isFormaPago() {
		return formaPago;
	}
	public void setFormaPago(boolean formaPago) {
		this.formaPago = formaPago;
	}
	
	

}
