import javax.swing.JOptionPane;
import calculadora1.Calculadora1;

public class Principal {
    public static void main(String[] args) {
        String opcao = "";
        Calculadora1 calculadora = new Calculadora1();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog(
                "1 - Leitura dos valores
                "2 - Adição
                "3 - Subtração
                "4 - Multiplicação
                "5 - Divisão
                "9 - Sair
            );

            switch (opcao) {
                case "1" -> {
                    try {
                        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A:"));
                        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B:"));
                        calculadora.setValorA(a);
                        calculadora.setValorB(b);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida! Use números.");
                    }
                }
                case "2" -> JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                case "3" -> JOptionPane.showMessageDialog(null, "Diferença: " + calculadora.getDiferenca());
                case "4" -> JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                case "5" -> {
                    try {
                        JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getQuociente());
                    } catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }
                }
                case "9" -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
