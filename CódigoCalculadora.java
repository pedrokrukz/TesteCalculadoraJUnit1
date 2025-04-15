
public final class Calculadora1 {
    private double valorA;
    private double valorB;

    public Calculadora1() {
        this(0, 0);
    }

    public Calculadora1(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getSoma() {
        return valorA + valorB;
    }

    public double getDiferenca() {
        return valorA - valorB;
    }

    public double getProduto() {
        return valorA * valorB;
    }

    public double getQuociente() {
        if (valorB == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return valorA / valorB;
    }
}
