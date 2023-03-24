public class Euro extends Moeda{
  double valor;
  double taxaConver = 5.63;

  Euro(double valor){
    super(valor);
    this.valor = valor;
  }


  public double coverter(){
    return valor * taxaConver;
  }
}
