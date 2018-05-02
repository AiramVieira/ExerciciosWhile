import javax.swing.JOptionPane;

public class Exercicio11{

    public static void main(String[] args) {

        String opcao = "";
        double valorTotal = 0;
        String produtos = "";

        while(!opcao.equalsIgnoreCase("sair")){
            opcao = JOptionPane.showInputDialog(null, "Digite qualquer coisa para cadastrar seus produtos,\nou digite \"Sair\" para fechar o programa");
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto");
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
            int qtdProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos da compra"));

            produtos = produtos+", "+nome;

            valor = valor*qtdProduto;
            valorTotal = valorTotal + valor;
        }
        JOptionPane.showMessageDialog(null, "Na compra dos produtos"+produtos+ " o valor foi de: R$" +valorTotal*0.05);
    }
}