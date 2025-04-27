package entities;

public class FuncionarioComissao extends Funcionario {
    private double venda;
    private double comissao;

    public FuncionarioComissao(String nome, String sobrenome, String cpf, double venda, double comissao) {
        super(nome, sobrenome, cpf);
        this.venda = venda;
        this.comissao = comissao;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = (venda < 0) ? 0 : venda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = (comissao > 0 && comissao < 1) ? comissao : 0;
    }

    @Override
    public double calculo() {
        return venda * comissao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" + "Venda Bruta: " + venda +
                "\n" + "Comissão: " + (comissao * 100) + "%" +
                "\n" + "Salario: " + calculo();
    }
}