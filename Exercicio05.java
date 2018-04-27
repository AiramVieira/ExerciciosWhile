import javax.swing.JOptionPane;

    public class Exercicio05{

        public static void main(String[] args) {

            double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor 1"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog
            (null, "Digite o valor 2"));
            double resultado = 0;
            int opcao = 0;

            while(opcao != 5){

                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                " ----------Menu----------"+
                "\n1----------|Somar--------"+
                "\n2----------|Subtrair-----"+
                "\n3----------|Multiplicar--"+
                "\n4----------|Dividir------"+
                "\n5----------|Sair---------"));
                if(opcao == 1){
                    resultado = valor1+valor2;
                }else if(opcao == 2){
                    resultado = valor1-valor2;
                }else if(opcao == 3){
                    resultado = valor1*valor2;
                }else if(opcao == 4){
                    resultado = valor1/valor2;
                }else if(opcao != 5){
                    JOptionPane.showMessageDialog(null, "Valor indisponível");
                }
                if((opcao > 0) && opcao < 5){
                    JOptionPane.showMessageDialog(null, "O resultado da equação é: "+resultado);
                }
            }
        }
    }