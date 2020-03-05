public class Carros{
	
	protected int codigo;
	protected String descricao;
	protected String marca;
	protected String modelo;
	protected float valor;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Cod:  " + codigo + "      Descrição: " + descricao + "      Marca: " + marca + "      Modelo: " + modelo + "      Valor: " + "R$ " + valor;
	}
	
}