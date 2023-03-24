// import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cofrinho bank = new Cofrinho();

    while (true) {
    System.out.println("\nCofre de Moedas, selecione uma opção:\n");

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
            System.out.println("\nQual moeda você deseja adicionar?\n");
            System.out.println("1. DOLAR");
            System.out.println("2. EURO");
            System.out.println("3. REAL");

        Scanner scMoeda = new Scanner(System.in);
        int coicheMoedaAdd = scMoeda.nextInt();

        switch (coicheMoedaAdd) {
            case 1:
                System.out.println("\nDOLAR selecionado, digite o valor que você deseja guardar:\n");
                    double valueAddDolar = scMoeda.nextDouble();
                    Dolar moedaDolar = new Dolar(valueAddDolar);
                    bank.addDolars(moedaDolar);
                    bank.addMoedas(moedaDolar);
                System.out.println("\n$ " + moedaDolar.valor + " adicionado(s)!\n");
            continue;
            case 2:
                System.out.println("\nEURO selecionado, digite o valor que você deseja guardar:\n");
                    double valueAddEuro = scMoeda.nextDouble();
                    Euro moedaEuro = new Euro(valueAddEuro);
                    bank.addEuros(moedaEuro);
                    bank.addMoedas(moedaEuro);
                System.out.println("\n€ " + moedaEuro.valor + " adicionado(s)!\n");
            continue;
            case 3:
                System.out.println("\nREAL selecionado, digite o valor que você deseja guardar:\n");
                    double valueAddReal = scMoeda.nextDouble();
                    Real moedaReal = new Real(valueAddReal);
                    bank.addReais(moedaReal);
                    bank.addMoedas(moedaReal);
                System.out.println("\nR$ " + moedaReal.valor + " adicionado(s)!\n");
            continue;
            default:
            break;
        }
        case 2:
        break;
        case 3:        
            double soma = bank.totalConvertido();
            System.out.println("Valor Total em R$ " + soma + "\n");
        break;
        case 4:
            System.out.println("Programa Encerrado!");
        break;
        default:
        break;
    }

    System.out.println("Deseja encerrar? 4 - SIM      5 - NÃO");
    int encerrarProgam = sc.nextInt();
    if (encerrarProgam == 5) {
        continue;
    } else {
        System.out.println("Programa Encerrado!");
    }
    sc.close();
    break;
    }
}
}
