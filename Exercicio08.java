import javax.swing.JOptionPane;

public class Exercicio08{

        public static void main(String[] args) {
            
            int palavra = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos caracteres serão digitados?"));
            int contador = 1;
            String textoFinal = "";
            
            while(palavra > 0){
                char letras = JOptionPane.showInputDialog(null, "Digite a " +contador+ "ª letra").charAt(0);
                    contador += 1;
                    textoFinal += letras;
                    palavra -= 1;
                System.out.println(letras);
            }
            JOptionPane.showMessageDialog(null, textoFinal);
        }
}