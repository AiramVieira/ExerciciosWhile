import javax.swing.JOptionPane;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import jdk.nashorn.internal.scripts.JO;

    public class Exercicio07{

        public static void main(String[] args) {
            
            String nome = "";
            int maiorNome = Integer.MIN_VALUE;
            int menorNome = Integer.MAX_VALUE;

            int idade = 0;

            double peso = 0;
            double maiorPeso = Integer.MIN_VALUE;
            double menorPeso = Integer.MAX_VALUE;

            String sexo = "";
            int sexoF = 0;;
            int sexoM = 0;;
            char letra = 'a';

            double altura = 0;
            double maiorAltura = Integer.MIN_VALUE;

            int qtdGols = 0;

            int qtdCartaoAmarelo = 0;
            int maiorQtdCartoesAmarelos = Integer.MIN_VALUE;
            int menorQtdCartoesAmarelos = Integer.MAX_VALUE;

            int qtdCartaoVermelho = 0;
            int maiorQtdCartoesVermelhos = Integer.MIN_VALUE;
            int menorQtdCartoesVermelhos = Integer.MAX_VALUE;

            int qtdJogador = 2;

                while(qtdJogador > 0){
                    sexo = JOptionPane.showInputDialog(null, "Digite o sexo do(a) jogador(a)").trim().toLowerCase();
                    letra = sexo.charAt(0);
                    char sexoLetra = ' ';
                    String doPorEscrito ="" ;
                if(letra == 'm'){
                    sexoLetra = ' ';
                    doPorEscrito = "do";
                    sexoM = sexoM + 1;
                }else if(letra == 'f'){
                    sexoF = sexoF + 1;
                    sexoLetra = 'a';
                    doPorEscrito = "da";
                }
                nome = JOptionPane.showInputDialog(null, "Digite o nome " + doPorEscrito + " jogador" + sexoLetra);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade "+ doPorEscrito + " jogador" +sexoLetra));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura "+ doPorEscrito + " jogador"+ sexoLetra));
                qtdGols = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de gols " + doPorEscrito + " jogador" +sexoLetra + " fez"));
                qtdCartaoAmarelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos cartões amarelos recebidos " + doPorEscrito + " jogador"+sexoLetra));
                qtdCartaoVermelho = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos cartões vermelhos recebidos " + doPorEscrito + " jogador"+sexoLetra));        
                
                if(altura > maiorAltura){
                    maiorAltura = altura;
                }
                if(peso > maiorPeso){
                    maiorPeso = peso;
                }else if(peso < menorPeso){
                    menorPeso = peso;
                }
                if(qtdCartaoAmarelo > maiorQtdCartoesAmarelos){
                    maiorQtdCartoesAmarelos = qtdCartaoAmarelo;    
                }else if(qtdCartaoAmarelo < menorQtdCartoesAmarelos){
                    menorQtdCartoesAmarelos = qtdCartaoAmarelo;
                }
                if(qtdCartaoVermelho > maiorQtdCartoesVermelhos){
                    maiorQtdCartoesVermelhos = qtdCartaoVermelho;
                }else if(qtdCartaoVermelho < menorQtdCartoesVermelhos){
                    menorQtdCartoesVermelhos = qtdCartaoVermelho;
                }
                if(nome.length() > maiorNome){
                    maiorNome = nome.length();
                }else if(nome.length() < menorNome){
                    menorNome = nome.length();
                }

                qtdJogador = qtdJogador - 1;
            }
            JOptionPane.showMessageDialog(null, "O maior nome tem " +maiorNome+ " caractéres"+
                                                "\nO menor nome tem: "+menorNome+ " caractéres"+
                                                "\nO maior peso é: "+maiorPeso+
                                                "\nO menor peso é: "+menorPeso+
                                                "\nA maior altura é: "+maiorAltura+
                                                "\nA quantidade de jogadoras é: "+sexoF+
                                                "\nA quanbtidade de jogadores é: "+sexoM+
                                                "\nA maior quantidade de cartões amarelos é: "+maiorQtdCartoesAmarelos+
                                                "\nA menor quantidade de cartões amarelos é: "+menorQtdCartoesAmarelos+
                                                "\nA maior quantidade de cartões vermelhos é: "+maiorQtdCartoesVermelhos+
                                                "\nA menor quantidade de cartões vermelhos é: "+menorQtdCartoesVermelhos);
        }
    }