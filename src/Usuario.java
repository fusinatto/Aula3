import java.util.Date;

public class Usuario {
	protected String nome;
	protected String sobrenome;
	protected String cnh;
	protected Date nascimento;
	protected String fone;
	protected String email;
	protected String endereco;
	protected String cidade;
	protected String cpl;
	protected String uf;
	protected String cep;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCpl() {
		return cpl;
	}
	public void setCpl(String cpl) {
		this.cpl = cpl;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Nome:   " + nome + "     Sobrenome:" + sobrenome + "      CNH:" + cnh + "      Nascimento:" + nascimento + 
			"     Fone:" + fone + "     E-Mail:" + email + "      Rua:" + endereco + "      Cidade:" + cidade + "     Cpl:" + cpl +
			"      UF:" + uf + "     Cep:" + cep;
	}
	
	
}
