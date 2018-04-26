import javax.swing.JOptionPane;

    public class Exercicio04{

        public static void main(String[] args) {

            int qtdCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros deseja cadastrar"));
            double valorCarro = 0;
            int anoCarro = 0;
            int carrosComG = 0;
            int carrosComA = 0;
            int mediaAno = 0;
            double mediaValor = 0;
            int mediaCarro = qtdCarros;

            while(qtdCarros > 0){
                String modeloCarro = JOptionPane.showInputDialog("Digite o modelo do carro");
                modeloCarro = modeloCarro.trim().toLowerCase();
                    qtdCarros = qtdCarros - 1;
                valorCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do carro"));
                    mediaValor = mediaValor + valorCarro;
                anoCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
                    mediaAno = mediaAno + anoCarro;
                    
            char letra = modeloCarro.charAt(0);
                if(letra == 'a'){
                    carrosComA = carrosComA + 1;
                }else if(letra == 'g'){
                    carrosComG = carrosComG + 1;
                }
            }
            mediaAno = mediaAno / mediaCarro;
            mediaValor = mediaValor / mediaCarro;
            JOptionPane.showMessageDialog(null, 
            "A media de anos é: "+mediaAno+
            "\nO valor médio dos carros é: "+mediaValor
            +"\nA quantidade de carros que começam com \"A\" é: "+carrosComA
            +"\nA quantidade de carros que começam com \"G\" é: "+carrosComG);
        }
    }