import javax.swing.JOptionPane;

    public class Exercicio03{

        public static void main(String[] args) {

            double peso = 1;
            int totalPessoas = 0;

            while((peso > 0) && (peso<300)){
                peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
                totalPessoas = totalPessoas + 1;
            }
            JOptionPane.showMessageDialog(null, "A quantidade de pessoas que digitaram seu peso foi: "+totalPessoas);
        }
    }