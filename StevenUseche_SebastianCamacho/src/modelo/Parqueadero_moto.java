package modelo;

import java.util.ArrayList;
import vista.FrontConsole;

public class Parqueadero_moto {

  private FrontConsole Front_console;

  private ArrayList<Moto> ListadoEsperaMoto;
  private Moto motos[];

  public Parqueadero_moto() {
    motos = new Moto[15];
    Front_console = new FrontConsole();
    ListadoEsperaMoto = new ArrayList<Moto>();
  }

  private int BuscarDisponible() {
    int ans = -1;
    int index = 0;
    while (ans == -1 && index < motos.length) {
      if (motos[index] == null) {
        ans = index;
      } else {
        index++;
      }
    }
    return ans;
  }

  public int agregarMotocicleta(Moto pMot) {
    int disponible = BuscarDisponible();
    if (disponible == -1) {
      ListadoEsperaMoto.add(pMot);
    } else {
      motos[disponible] = pMot;
    }
    return disponible;
  }

  public int BuscarPlaca(String Placa) {
    int ans = -1;
    int index = 0;
    while (ans == -1 && index < motos.length && motos[index] != null) {
      if (motos[index].getPlaca().equals(Placa)) {
        ans = index;
      } else {
        index++;
      }
    }
    return ans;
  }

  public String infoMoto(String plabum) {
    int x = BuscarPlaca(plabum);
    String res = "";
    res = motos[x].toString();
    return res;
  }
  public int EliminarMotocicleta(String Placa) {
    int eliminar = BuscarPlaca(Placa);
    if (eliminar != -1) {
      motos[eliminar] = null;
    }
    return eliminar;
  }
  
  public String DataMotbtn(int pPos) {
    String res = "";

    if (motos[pPos] != null) {
      res = motos[pPos].toString();
    } else {
      res = "Disponible ";
    }
    return res;
  }

}
