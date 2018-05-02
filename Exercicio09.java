import javax.swing.JOptionPane;

public class Exercicio09{

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        int tamanhoTexto = nome.length();
        int inicioTexto = 0;

        while(tamanhoTexto > inicioTexto){
            System.out.println(nome.charAt(inicioTexto));
            inicioTexto += 1;
        }
    }
}