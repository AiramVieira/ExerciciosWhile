import javax.swing.JOptionPane;

public class Exercicio06{

        public static void main(String[] args) {
            
            int opcao = 0;
            int qtdBolos = 0;
            int qtdDoces = 0;
            int qtdSanduiches = 0;
            int qtdPizzas = 0;
            int qtdTotal = 0;
            double mediaProdutos = 0;
            double precoTotal = 0;
          
            while(opcao != 16){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "CÓDIGO--------TIPO--------NOME------------------------------------------VALOR\n" +
                "1-------------Bolos-------Bolo Brigadeiro ------------------------------R$29,50\n" +
                "2-------------Bolos-------Bolo Floresta Negra---------------------------R$2,00\n" +
                "3-------------Bolos-------Bolo Leite com Nutella------------------------R$29,23\n" +
                "4-------------Bolos-------Bolo Mousse de Chocolate----------------------R$7,10\n" +
                "5-------------Bolos-------Bolo Nega Maluca------------------------------R$19,33\n" +
                "6-------------Doces-------Bomba de Creme--------------------------------R$17,71\n" +
                "7-------------Doces-------Bomba de Morango------------------------------R$4,82\n" +
                "8-------------Sanduíches--Filé-Mignon com fritas e cheddar--------------R$21,16\n" +
                "9-------------Sanduíches--Hambúrguer com queijos, champignon e rúcula---R$12,70\n" +           
                "10------------Sanduíches--Provolone com salame--------------------------R$19,70\n" +
                "11------------Sanduíches--Vegetariano de berinjela----------------------R$28,22\n" +
                "12------------Pizzas------Calabresa-------------------------------------R$8,98\n" +
                "13------------Pizzas------Napolitana------------------------------------R$0,42\n" +
                "14------------Pizzas------Peruana---------------------------------------R$18,36\n" +
                "15------------Pizzas------Portuguesa------------------------------------R$27,50\n" +
                "16------------Sair"));
            if((opcao > 0) && (opcao < 16)){

                qtdBolos = qtdBolos + 1;

                if (opcao < 6){

                    if(opcao == 1){
                        precoTotal = precoTotal + 29.50;
                    }else if(opcao == 2){
                        precoTotal = precoTotal + 2;
                    }else if(opcao == 3){
                        precoTotal = precoTotal + 29.23;
                    }else if(opcao == 4){
                        precoTotal = precoTotal + 7.10;
                    }else if(opcao == 5){
                        precoTotal = precoTotal + 19.33;
                    }

                }else if(opcao < 8){

                    qtdDoces = qtdDoces + 1;

                    if(opcao == 6){
                        precoTotal = precoTotal + 17.71;
                    }else if(opcao == 7){
                        precoTotal = precoTotal + 4.82;
                    }
                }else if(opcao < 12){

                    qtdSanduiches = qtdSanduiches + 1;

                    if(opcao == 8){
                        precoTotal = precoTotal + 21.16;
                    }else if(opcao == 9){
                        precoTotal = precoTotal + 12.70;
                    }else if(opcao == 10){
                        precoTotal = precoTotal + 19.70;
                    }else if(opcao == 11){
                        precoTotal = precoTotal + 28.22;
                    }
                }else if(opcao < 16){

                    qtdPizzas = qtdPizzas + 1;

                    if(opcao == 12){
                        precoTotal = precoTotal + 8.98;
                    }else if(opcao == 13){
                        precoTotal = precoTotal + 0.42;
                    }else if(opcao == 14){
                        precoTotal = precoTotal + 18.36;
                    }else if(opcao == 15){
                        precoTotal = precoTotal + 27.50;
                    }
                }else if(opcao == 16){
                    JOptionPane.showMessageDialog(null, "FLWS AE TROXÃO");
                }
            qtdTotal = qtdBolos+qtdDoces+qtdSanduiches+qtdPizzas;
            mediaProdutos = precoTotal/qtdTotal;
            
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de bolos pedidos foi: " +qtdBolos+
                                            "\nA quantidade de doces pedidos foi: " +qtdDoces+
                                            "\nA quantidade de sanduíches pedidos foi: " +qtdSanduiches+
                                            "\nA quantidade de pizzas pedidas foi: " +qtdPizzas+
                                            "\nA media dos produtos é: " +(String.format("%.2f", mediaProdutos)));
    }
}