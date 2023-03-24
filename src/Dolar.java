public class Dolar extends Moeda{
  double valor;
  double taxaConver = 5.28;

  Dolar(double valor){
    super(valor);
    this.valor = valor;
  }

  public double converter(){
    return valor * taxaConver;
  }
}
