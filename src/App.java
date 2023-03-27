import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cofrinho bank = new Cofrinho();

        while (true) {
            System.out.println("\n/== Cofre de Moedas ==/ \n  Selecione uma opção: \n");
            System.out.println("0 - Listar Moedas Guardadas");
            System.out.println("1 - Adiconar Moedas");
            System.out.println("2 - Remover Moedas");
            System.out.println("3 - Total no Cofre em Reais");
            System.out.println("4 - Encerrar Programa!");

            Scanner sc = new Scanner(System.in);
            int itemMenuSelecionado = sc.nextInt();

            switch (itemMenuSelecionado) {
                case 0:
                    bank.listagemMoedas();
                    continue;
                case 1:
                    System.out.println("\nQual moeda você deseja adicionar?");
                    System.out.println("1. DOLAR");
                    System.out.println("2. EURO");
                    System.out.println("3. REAL");

                    Scanner scMoedaAdd = new Scanner(System.in);
                    int coicheMoedaAdd = scMoedaAdd.nextInt();

                    // Adicionando Moedas no Cofre
                    switch (coicheMoedaAdd) {
                        case 1:
                            System.out.println("\nDOLAR selecionado, digite o valor que você deseja guardar:");
                            double valueAddDolar = scMoedaAdd.nextDouble();
                            Dolar moedaDolar = new Dolar(valueAddDolar);
                            bank.addDolars(moedaDolar);
                            bank.addMoedas(moedaDolar);
                            System.out.println("\n$ " + moedaDolar.valor + " adicionado(s)!\n");
                            continue;
                        case 2:
                            System.out.println("\nEURO selecionado, digite o valor que você deseja guardar:");
                            double valueAddEuro = scMoedaAdd.nextDouble();
                            Euro moedaEuro = new Euro(valueAddEuro);
                            bank.addEuros(moedaEuro);
                            bank.addMoedas(moedaEuro);
                            System.out.println("\n€ " + moedaEuro.valor + " adicionado(s)!\n");
                            continue;
                        case 3:
                            System.out.println("\nREAL selecionado, digite o valor que você deseja guardar:");
                            double valueAddReal = scMoedaAdd.nextDouble();
                            Real moedaReal = new Real(valueAddReal);
                            bank.addReais(moedaReal);
                            bank.addMoedas(moedaReal);
                            System.out.println("\nR$ " + moedaReal.valor + " adicionado(s)!\n");
                            continue;
                        default:
                            System.out.println(" ==> ERRO! <== \nValor indefinido, selecione uma das opções do menu!");
                            continue;
                    }

                // Removendo moedas do Cofre
                case 2:
                    System.out.println("\nQual moeda você deseja remover?");
                    bank.listagemMoedas();

                    Scanner scMoedaRemove = new Scanner(System.in);
                    int coicheMoedaRemove = scMoedaRemove.nextInt();

                    switch (coicheMoedaRemove) {
                        case 1:
                            System.out.println("\nDOLAR selecionado, digite o valor que você deseja remover:");
                            double valueRemoveDolar = scMoedaRemove.nextDouble();
                            Dolar removeMoedaDolar = new Dolar(valueRemoveDolar);
                            bank.removeDolars(removeMoedaDolar);
                            bank.removeMoedas(removeMoedaDolar);
                            System.out.println("\n$ " + removeMoedaDolar.valor + " removido(s)!\n");
                            continue;
                        case 2:
                            System.out.println("\nEURO selecionado, digite o valor que você deseja remover:");
                            double valueRemoveEuro = scMoedaRemove.nextDouble();
                            Euro removeMoedaEuro = new Euro(valueRemoveEuro);
                            bank.removeEuros(removeMoedaEuro);
                            bank.removeMoedas(removeMoedaEuro);
                            System.out.println("\n$ " + removeMoedaEuro.valor + " removido(s)!\n");
                            continue;
                        case 3:
                            System.out.println("\nREAL selecionado, digite o valor que você deseja remover:");
                            double valueRemoveReal = scMoedaRemove.nextDouble();
                            Real removeMoedaReal = new Real(valueRemoveReal);
                            bank.removeReais(removeMoedaReal);
                            bank.removeMoedas(removeMoedaReal);
                            System.out.println("\n$ " + removeMoedaReal.valor + " removido(s)!\n");
                            continue;
                        default:
                            System.out.println(" ==> ERRO! <== \nValor indefinido, selecione uma das opções do menu!");
                            break;
                    }
                    continue;
                case 3:
                    double soma = bank.totalConvertido() - bank.removeMoedas();
                    System.out.println("Valor Total em R$ " + soma + "\n");
                    continue;
                case 4:
                    System.out.println("Deseja encerrar? 4 - SIM      5 - NÃO");
                    int encerrarProgam = sc.nextInt();
                    if (encerrarProgam == 5) {
                        continue;
                    } else if (encerrarProgam != 4) {
                        System.out.println(" ==> ERRO! <== \nSelecione 4 para SAIR ou 5 se deseja CONTINUAR!");
                        continue;
                    } else {
                        System.out.println("Programa Encerrado!");
                    }
                    break;
                default:
                    System.out.println(" ==> ERRO! <== \nValor indefinido, selecione uma das opções do menu!");
                    continue;
            }
            sc.close();
            break;
        }
    }
}
