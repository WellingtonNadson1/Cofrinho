public class Dolar extends Moeda{
  double taxaConver = 5.28;

  Dolar(double valor){
    super(valor);
  }

  public double converter(){
    return valor * taxaConver;
  }
}
