package entities;

public class Gerente extends Empregado {
    private int bonus;

    public Gerente(int bonus, String nome, double salario, int codigo) {
        super(nome, salario, codigo);
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public double calculoSalario() {
        return getSalario() + bonus;
    }
    public String toString() {
        return super.toString()  +
                "Salario final R$: " + calculoSalario() + "\n";
    }
}
