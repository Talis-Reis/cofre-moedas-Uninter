package cofrinho;

import cofrinho.EntradaDados.EntradaDados;
import cofrinho.Moedas.Dolar;
import cofrinho.Moedas.Euro;
import cofrinho.Moedas.Moeda;
import cofrinho.Moedas.Real;

import java.util.ArrayList;

public class Cofrinho {

    public static EntradaDados entradaDados = new EntradaDados();
    private static ArrayList<Moeda> lista = new ArrayList<Moeda>();
    public static int opcao;
    public static Float valorMoeda;

    public static void cofrinho() {

        for(;;){
            System.out.println("#############################################");
            System.out.println("COFRINHO");
            System.out.println("1-Adicionar cofrinho.Moedas.Moeda");
            System.out.println("2-Remover cofrinho.Moedas.Moeda");
            System.out.println("3-Listar Moedas");
            System.out.println("4-Calcular total convertido para cofrinho.Moedas.Real");
            System.out.println("0-Encerrar");
            opcao = Integer.parseInt(entradaDados.dados.nextLine());
            System.out.println(" ");


            if(opcao == 1){
                System.out.println("1-Real:");
                System.out.println("2-Dolar:");
                System.out.println("3-Euro:");
                opcao = Integer.parseInt(entradaDados.dados.nextLine());

                if(opcao >= 1 && opcao <= 3){
                    System.out.println("Digite o valor:");
                    valorMoeda = Float.parseFloat(entradaDados.dados.nextLine());

                    adicionarMoedas(opcao, valorMoeda);
                }else{
                    System.out.println("Essa opção de Moeda não existe.");
                }
            }else if(opcao == 2){
                System.out.println("1-Real:");
                System.out.println("2-Dolar:");
                System.out.println("3-Euro:");
                opcao = Integer.parseInt(entradaDados.dados.nextLine());

                if(opcao >= 1 && opcao <= 3){
                    System.out.println("Digite o valor:");
                    valorMoeda = Float.parseFloat(entradaDados.dados.nextLine());

                    removerMoedas(opcao, valorMoeda);

                }else{
                    System.out.println("Essa opção de Moeda não existe.");
                }
            }else if(opcao == 3){
                listarMoedas();
            }else if(opcao == 4){
                totalConvertido();
            }else if(opcao == 0) {
                break;
            }else{
                System.out.println("Não conseguimos identificar a opção que escolheu");
            }
        }
    }


    public static void adicionarMoedas(int moeda, float valor){
        if(moeda == 1){
            lista.add(new Real(valor, "Real"));
        }else if(moeda == 2){
            lista.add(new Dolar(valor, "Dolar"));
        }else if(moeda == 3){
            lista.add(new Euro(valor, "Euro"));
        }
    }

    public static void removerMoedas(int moeda, float valor){
        for(int i = 0; i < lista.size(); i++){
            if(moeda == 1){
                if(lista.get(i).getTipo() == "Real" && lista.get(i).getValorMoeda() == valor) lista.remove(i);
            }else if(moeda == 2){
                if(lista.get(i).getTipo() == "Dolar" && lista.get(i).getValorMoeda() == valor) lista.remove(i);
            }else if(moeda == 3){
                if(lista.get(i).getTipo() == "Euro" && lista.get(i).getValorMoeda() == valor) lista.remove(i);
            }

        }
    }

    public static void listarMoedas ( ){
        for (Moeda iterator : lista){
            iterator.getMoeda();
        }
    }

    public static void totalConvertido(){
        float total = 0;
        for(Moeda iterator : lista){
            total += iterator.getConversao();
        }
        System.out.println("O total convertido para Real: "+ total);
    }


}
