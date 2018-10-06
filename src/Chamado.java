public class Chamado {
    public Chamado(String descricaoChamado, int prioridade, Cliente cliente, Funcionario funcionario) {
        this.descricaoChamado = descricaoChamado;
        this.prioridade = prioridade;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    private String descricaoChamado;
    private int prioridade;
    private String status;
    private Cliente cliente;
    private Funcionario funcionario;

    public String getDescricaoChamado() {
        return descricaoChamado;
    }

    public void setDescricaoChamado(String descricaoChamado) {
        this.descricaoChamado = descricaoChamado;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}