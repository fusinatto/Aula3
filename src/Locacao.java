import java.util.Date;

public class Locacao {
	protected int usuario;
	protected int veiculo;
	protected Date dtLocacao;
	protected Date dtDev;
	protected Float vlPagar;
	protected Float vlPago;
	protected Float vlMulta;
	
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public int getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(int veiculo) {
		this.veiculo = veiculo;
	}
	public Date getDtLocacao() {
		return dtLocacao;
	}
	public void setDtLocacao(Date dtLocacao) {
		this.dtLocacao = dtLocacao;
	}
	public Date getDtDev() {
		return dtDev;
	}
	public void setDtDev(Date dtDev) {
		this.dtDev = dtDev;
	}
	public Float getVlPagar() {
		return vlPagar;
	}
	public void setVlPagar(Float vlPagar) {
		this.vlPagar = vlPagar;
	}
	public Float getVlPago() {
		return vlPago;
	}
	public void setVlPago(Float vlPago) {
		this.vlPago = vlPago;
	}
	public Float getVlMulta() {
		return vlMulta;
	}
	public void setVlMulta(Float vlMulta) {
		this.vlMulta = vlMulta;
	}
	
	@Override
	public String toString() {
		return "Usuário: " + usuario + "     Veículo: " + veiculo + "     Data locação: " + dtLocacao + "      Data Devolução: " + dtDev + "      Valor pagar: " + "R$ " + vlPagar +
				"      Valor pago: " + "R$ " + vlPago + "       Valor multa: " + "R$ " + vlMulta;
	}
	
}
