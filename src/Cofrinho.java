import java.util.ArrayList;

public class Cofrinho {
  // Lista de todas moedas com valores convertido para REAL
  private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

  // Lista de todas moedas em Dólares adicionadas
  private ArrayList<Dolar> listaAddDolars = new ArrayList<Dolar>();
  
  // Lista de todas moedas em Euros adicionadas
  private ArrayList<Euro> listaAddEuros = new ArrayList<Euro>();
  
  // Lista de todas moedas em Reais adicionadas
  private ArrayList<Real> listaAddReais = new ArrayList<Real>();

  public Cofrinho(){}

  // Métodos para adicionar moedas
  public void addMoedas(Moeda m){
    listaMoedas.add(m);
  }
  public void addDolars(Dolar m){
    listaAddDolars.add(m);
  }
  public void addEuros(Euro m){
    listaAddEuros.add(m);
  }
  public void addReais(Real m){
    listaAddReais.add(m);
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

  // Método para listar as moedas que estão no cofre
  public void listagemMoedas(){
    System.out.println("1. DOLAR: $ " + totalDolars());
    System.out.println("2. EURO: € " + totalEuros());
    System.out.println("3. REAL: R$ " + totalReais());
  }

}