import javax.swing.JOptionPane;

    public class Exercicio01{

        public static void main(String[] args) {

            String nome = "";
            while(!nome.equalsIgnoreCase("sair")){
                nome = JOptionPane.showInputDialog(null, "Digite seu nome\nSe deseja sair digite \"Sair\"");
            }
        }
    }