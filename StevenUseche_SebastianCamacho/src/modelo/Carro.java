package modelo;

public class Carro {

  private String placacarro;
  private String modelocarro;
  private String tipocarro;

  public Carro(String PlacaCarro, String ModeloCarro, String TipoCarro) {
    this.placacarro = PlacaCarro;
    this.modelocarro = ModeloCarro;
    this.tipocarro = TipoCarro;
  }

  public String getPlaca() {
    return placacarro;
  }

  public void setPlaca(String placa) {
    this.placacarro = placa;
  }

  public String getModel() {
    return modelocarro;
  }

  public void setModel(String model) {
    this.modelocarro = model;
  }

  public String getTipo() {
    return tipocarro;
  }

  public void setTipo(String tipo) {
    this.tipocarro = tipo;
  }

  @Override
  public String toString() {
    return (
      "Carro Placa : " +
      placacarro +
      "    Modelo : " +
      modelocarro +
      "    Tipo : " +
      tipocarro
    );
  }
}
