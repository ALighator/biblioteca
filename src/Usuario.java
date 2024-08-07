public class Usuario {
    private String nome;
    private int codigo;
    private long cpf;
    private Endereco endereco;

    public Usuario() {
        this.endereco = new Endereco();
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", codigo=" + codigo + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
    
}
