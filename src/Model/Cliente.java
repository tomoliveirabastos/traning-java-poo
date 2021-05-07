package Model;

abstract public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente() {
		this.nome = "";
		this.cpf = "";
		this.profissao = "";
	}
	
	public String getNome() {
		return this.nome;
	}

	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getCpf() {
		return this.cpf;

	}

	public Cliente setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public Cliente setProfissao(String profissao) {
		this.profissao = profissao;
		return this;
	}
	

}