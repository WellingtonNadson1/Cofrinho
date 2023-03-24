public abstract class Moeda {
  double valor;

  Moeda(double value){
    this.valor = value;

  }

  public void info(){
    System.out.println(valor);
  }

  public double converter(){
    return valor;
  }
}
