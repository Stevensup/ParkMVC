package modelo;

public class Moto {

  private String placamoto;
  private String modelomoto;
  private String tipomoto;

  public Moto(String PlacaMoto, String ModeloMoto, String TipoMoto) {
    this.placamoto = PlacaMoto;
    this.modelomoto = ModeloMoto;
    this.tipomoto = TipoMoto;
  }

  public String getPlaca() {
    return placamoto;
  }

  public void setPlaca(String placa) {
    this.placamoto = placa;
  }

  public String getModel() {
    return modelomoto;
  }

  public void setModel(String model) {
    this.modelomoto = model;
  }

  public String getTipo() {
    return tipomoto;
  }

  public void setTipo(String tipo) {
    this.tipomoto = tipo;
  }

  @Override
  public String toString() {
    return (
      "Moto Placa : " +
      placamoto +
      "    Modelo : " +
      modelomoto +
      "    Tipo : " +
      tipomoto
    );
  }
}
