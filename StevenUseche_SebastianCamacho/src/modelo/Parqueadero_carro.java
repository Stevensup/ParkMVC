package modelo;

import java.util.ArrayList;

import vista.FrontConsole;

public class Parqueadero_carro {

  private FrontConsole Front_console;
  private ArrayList<Carro> ListadoEsperaCarro;
  private Carro carros[];

  public Parqueadero_carro() {
    carros = new Carro[10];
    Front_console = new FrontConsole();

    ListadoEsperaCarro = new ArrayList<Carro>();
  }

  private int BuscarDisponible() {
    int ans = -1;
    int index = 0;
    while (ans == -1 && index < carros.length) {
      if (carros[index] == null) {
        ans = index;
      } else {
        index++;
      }
    }
    return ans;
  }

  public int agregarVehiculo(Carro pVeh) {
    int disponible = BuscarDisponible();
    if (disponible == -1) {
      ListadoEsperaCarro.add(pVeh);
    } else {
      carros[disponible] = pVeh;
    }
    return disponible;
  }

  public int BuscarPlaca(String Placa) {
    int ans = -1;
    int index = 0;
    while (ans == -1 && index < carros.length && carros[index] != null) {
      if (carros[index].getPlaca().equals(Placa)) {
        ans = index;
      } else {
        index++;
      }
    }
    return ans;
  }

  public String Datacar(String pPla) {
    int x = BuscarPlaca(pPla);
    String res = "";
    res = carros[x].toString();
    return res;
  }

  public String DataCarbtn(int pPos) {
    int x = pPos;
    String res = "";

    if (carros[x] != null) {
      res = carros[x].toString();
    } else {
      res = "Disponible ";
    }
    return res;
  }

  public String carro1exp() {
    String res1 = " ";
    res1 = carros[0].toString();
    return res1;
  }

  public int EliminarVehiculo(String Placa) {
    int eliminar = BuscarPlaca(Placa);
    if (eliminar != -1) {
      carros[eliminar] = null;
    }
    return eliminar;
  }

  public String listarvehiculos() {
    String list = "";

    for (int z = 0; z < carros.length; z++) {
      if (carros[z] == null) {
        list = list + " Parking " + (z + 1) + "  " + " Disponible\n";
      } else {
        list = list + " Parking " + (z + 1) + "  " + carros[z] + "\n";
      }
    }

    return list;
  }
}
