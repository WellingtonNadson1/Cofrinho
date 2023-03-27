public class Euro extends Moeda {
  double taxaConver = 5.63;

  Euro(double valor) {
    super(valor);
  }

  public double converter() {
    return valor * taxaConver;
  }
}
