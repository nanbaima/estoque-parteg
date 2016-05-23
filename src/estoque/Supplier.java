package estoque;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Supplier {

	private Integer id;
	@NotNull
	@Size(min=1, max=50)
	private String nome;
	
	@NotNull
	@Size(min=11, max=12)
//	@Pattern(regexp="\\(\\d{2}\\)\\d{4,5}-\\d{4}")
	private String telefone;
	
	@Size(min=11, max=12)
//	@Pattern(regexp="\\(\\d{2}\\)\\d{4,5}-\\d{4}")
	private String celular;
	
	@NotNull
	@Size(min=14, max=14)
//	@Pattern(regexp="\\d{14}")
	private String cnpj;
	
//	@Pattern(regexp="\\d{8}")
	private String ie;
	
	@Size(min=1, max=50)
	private String endereco;
	
	@Size(min=1, max=50)
	private String bairro;
	
	@Size(min=1, max=50)
	private String cidade;
	
	@Size(min=2, max=2)
//	@Pattern(regexp="\\p{Upper}{2}")
	private String estado;
	
	@Size(min=8, max=8)
//	@Pattern(regexp="\\d{5}-\\d{3}")
	private String cep;
	
//	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String email;
	
	@Size(min=1, max=255)
	private String obs;
	
	public Supplier() {
		id=1;
	}

	public Supplier(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the ie
	 */
	public String getIe() {
		return ie;
	}

	/**
	 * @param ie the ie to set
	 */
	public void setIe(String ie) {
		this.ie = ie;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the obs
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * @param obs the obs to set
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

}
