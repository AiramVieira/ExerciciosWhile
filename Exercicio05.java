import javax.swing.JOptionPane;

    public class Exercicio05{

        public static void main(String[] args) {

            double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor 1"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor 2"));
            int opcao = 0;

            while(opcao != 0){
                {JOptionPane.showInputDialog(null, 
                " ----------Menu----------"+
                "\n1----------|Somar--------"+
                "\n2----------|Subtrair-----"+
                "\n3----------|Multiplicar--"+
                "\n4----------|Dividir------"+
                "\n5----------|Sair---------");
                if(opcao == 1){
                    JOptionPane.showMessageDialog(null, "A soma deles é: "+
                    (valor1+valor2));
                }else if(opcao == 2){
                    JOptionPane.showMessageDialog(null, "A soma deles é: "+(valor1-valor2));
                }else if(opcao == 3){
                    JOptionPane.showMessageDialog(null, "A soma deles é: "+(valor1*valor2));
                }else if(opcao == 4){
                    JOptionPane.showMessageDialog(null, "A soma deles é: "+(valor1/valor2));
                }
            }
        }
    }
}