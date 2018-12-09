package Data;

public class Deuda {
	private String acreedor;
	private String motivo;
	private long monto;
	public Deuda(String acreedor, String motivo, long monto) {
		super();
		this.acreedor = acreedor;
		this.motivo = motivo;
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Deuda [acreedor=" + acreedor + ", motivo=" + motivo + ", monto=" + monto + "]";
	}
	public String getAcreedor() {
		return acreedor;
	}
	public void setAcreedor(String acreedor) {
		this.acreedor = acreedor;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public long getMonto() {
		return monto;
	}
	public void setMonto(long monto) {
		this.monto = monto;
	}
	

}
