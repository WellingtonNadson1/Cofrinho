import java.util.ArrayList;

public class Cofrinho {
  // Lista de todas moedas com valores convertido para REAL
  private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
  private ArrayList<Moeda> listaRemoveMoedas = new ArrayList<Moeda>();

  // Lista de todas moedas em Dólares adicionadas
  private ArrayList<Dolar> listaAddDolars = new ArrayList<Dolar>();
  private ArrayList<Dolar> listaRemoveDolars = new ArrayList<Dolar>();
  
  // Lista de todas moedas em Euros adicionadas
  private ArrayList<Euro> listaAddEuros = new ArrayList<Euro>();
  private ArrayList<Euro> listaRemoveEuros = new ArrayList<Euro>();
  
  // Lista de todas moedas em Reais adicionadas
  private ArrayList<Real> listaAddReais = new ArrayList<Real>();
  private ArrayList<Real> listaRemoveReais = new ArrayList<Real>();

  public Cofrinho(){}

  // Métodos para adicionar moedas nas listas
  // LISTA GERAL
  public void addMoedas(Moeda m){
    listaMoedas.add(m);

  }
  public void removeMoedas(Moeda m){
    listaRemoveMoedas.add(m);
  }
  // LISTA DOLARES
  public void addDolars(Dolar m){
    listaAddDolars.add(m);
  }

  public void removeDolars(Dolar m){
    listaRemoveDolars.add(m);
  }
    // LISTA EUROS
  public void addEuros(Euro m){
    listaAddEuros.add(m);
  }

  public void removeEuros(Euro m){
    listaRemoveEuros.add(m);
  }

    // LISTA REAIS
  public void addReais(Real m){
    listaAddReais.add(m);
  }

  public void removeReais(Real m){
    listaRemoveReais.add(m);
  }

  // Métodos para somar os valores depositados
  public double totalConvertido(){
    double soma;
    soma = 0;
        for (Moeda item : listaMoedas){
            soma+=item.converter();
        }
    return soma;
  }

  public double totalDolars(){
    double somaDolar;
    somaDolar = 0;
        for (Dolar item : listaAddDolars){
            somaDolar+=item.valor;
        }
    return somaDolar;
  }

  public double totalEuros(){
    double somaEuro;
    somaEuro = 0;
        for (Euro item : listaAddEuros){
            somaEuro+=item.valor;
        }
    return somaEuro;
  }

  public double totalReais(){
    double somaReais;
    somaReais = 0;
        for (Real item : listaAddReais){
            somaReais+=item.valor;
        }
    return somaReais;
  }

  // Métodos para somar os valores removidos
  public double removeMoedas(){
    double subtraMoedas;
    subtraMoedas = 0;
        for (Moeda item : listaRemoveMoedas){
            subtraMoedas+=item.converter();
        }
    return subtraMoedas;
  }

  public double removeDolars(){
    double subtraDolar;
    subtraDolar = 0;
        for (Dolar item : listaRemoveDolars){
            subtraDolar+=item.valor;
        }
    return subtraDolar;
  }

  public double removeEuros(){
    double subtraEuro;
    subtraEuro = 0;
        for (Euro item : listaRemoveEuros){
            subtraEuro+=item.valor;
        }
    return subtraEuro;
  }

  public double removeReais(){
    double subtraReal;
    subtraReal = 0;
        for (Real item : listaRemoveReais){
            subtraReal+=item.valor;
        }
    return subtraReal;
  }

  // Método para listar as moedas que estão no cofre
  public void listagemMoedas(){
    System.out.println("1. DOLAR: $ " + (totalDolars() - removeDolars()));
    System.out.println("2. EURO: € " + (totalEuros() - removeEuros()));
    System.out.println("3. REAL: R$ " + (totalReais() - removeReais()));
    // System.out.println("1. DOLAR: $ " + removeDolars(valueDolar));
    // System.out.println("2. EURO: € " + removeEuros(valueEuro));
    // System.out.println("3. REAL: R$ " + removeReais(valueReal));
  }

}