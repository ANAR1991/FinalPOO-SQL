package Data;

public class Egresos {
	private int monto;
	private String motivo;
	private boolean formaEgreso;
	public Egresos(int monto, String motivo, boolean formaEgreso) {
		super();
		this.monto = monto;
		this.motivo = motivo;
		this.formaEgreso = formaEgreso;
	}
	@Override
	public String toString() {
		return "Egresos [monto=" + monto + ", motivo=" + motivo + ", formaEgreso=" + formaEgreso + "]";
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
	public boolean isFormaEgreso() {
		return formaEgreso;
	}
	public void setFormaEgreso(boolean formaEgreso) {
		this.formaEgreso = formaEgreso;
	}
	

}
