package controlador;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.Carro;
import modelo.Moto;
import modelo.Parqueadero_carro;
import modelo.Parqueadero_moto;
import vista.FrontConsole;

public class BackEnd {

  boolean Validador;
  private Parqueadero_carro ParkCar;
  private Parqueadero_moto ParkMot;
  private FrontConsole Front_console;
  private Carro ContainerCarro;
  private Moto ContainerMoto;

  public BackEnd() {
    Front_console = new FrontConsole();
    ParkCar = new Parqueadero_carro();
    ParkMot = new Parqueadero_moto();
  }

  public void IngresoCarro() {
    String PlacaC, ModeloC, TipoC;
    //Lectura de parametros que son llevados al Modelo Carro
    PlacaC = Front_console.LeerTexto("Ingrese la placa del carro :");
    ModeloC = Front_console.LeerTexto("Ingrese el modelo del carro :");
    TipoC = Front_console.LeerTexto("Ingrese el tipo de carro :");
    ContainerCarro = new Carro(PlacaC, ModeloC, TipoC);
    int PuestoCarro = ParkCar.agregarVehiculo(ContainerCarro);
    if (PuestoCarro != -1) {
      Front_console.MostrarMensaje(
        "Su carro se registro correctamente \n" +
        " El puesto asignado es " +
        (PuestoCarro + 1)
      );
    } else Front_console.MostrarMensaje(
      //si el arreglo fijo de carro esta lleno
      "No tenemos espacio disponible, ingresa a la sala de espera por cupo!"
    );
  }

  public void IngresoMoto() {
    String PlacaM, ModeloM, TipoM;
    //Lectura de parametros que son llevados al Modelo Moto
    PlacaM = Front_console.LeerTexto("Ingrese la placa de su moto :");
    ModeloM = Front_console.LeerTexto("Ingrese el modelo de su moto :");
    TipoM = Front_console.LeerTexto("Ingrese el tipo de moto:");
    ContainerMoto = new Moto(PlacaM, ModeloM, TipoM);
    int PuestoMoto = ParkMot.agregarMotocicleta(ContainerMoto);
    if (PuestoMoto != -1) {
      Front_console.MostrarMensaje(
        "Su moto se registro correctamente \n" +
        " El puesto asignado es " +
        (PuestoMoto + 1)
      );
    } else Front_console.MostrarMensaje(
      //si el arreglo fijo de moto esta lleno
      "No tenemos espacio disponible, ingresa a la sala de espera por cupo!"
    );
  }

  public void RetiroCarro() {
    String PlacaSearchCar = Front_console.LeerTexto("Digite la placa de su carro ");

    if (ParkCar.EliminarVehiculo(PlacaSearchCar) == -1) {
      JOptionPane.showMessageDialog(
        null,
        "Su carro no no se encuentra en el parqueadero"
      );
    } else {
      JOptionPane.showMessageDialog(
        null,
        "Carro retirado del parqueadero, Gracias por venir!"
      );
    }
  }

  public void RetiroMoto() {
    String PlacaSearchMot = Front_console.LeerTexto("Digite la placa de su moto");

    if (ParkMot.EliminarMotocicleta(PlacaSearchMot) != -1) {
      JOptionPane.showMessageDialog(
        null,
        "Moto retirada del parqueadero, Gracias por venir!"
      );
    } else {
      JOptionPane.showMessageDialog(
        null,
        "Su moto no no se encuentra en el parqueadero"
      );
    }
  }

  public void ValidadorPark() {
    int x = Front_console.LeerNumero(
      " Ingrese 1--para ingresar en carro " + " o " + " 2--para ingresar en moto"
    );

    if (x == 1) {
      IngresoCarro();
    }
    if (x == 2) {
      IngresoMoto();
    } else {
      Front_console.MostrarMensaje("Escoga una opcion valida");
    }
  }

  public void Buscar() {
    int g = Front_console.LeerNumero(
      "Si va a consultar un carro ingrese 1, si va a consultar una moto ingrese 2"
    );
    if (g == 1) {
      String plabuc = Front_console.LeerTexto("Ingrese la placa del carro a buscar");
      Front_console.MostrarMensaje(ParkCar.Datacar(plabuc));
    } else if (g == 2) {
      String plabum = Front_console.LeerTexto("Ingrese la placa de la moto a buscar");
      Front_console.MostrarMensaje(ParkMot.infoMoto(plabum));
    } else {
      Front_console.MostrarMensaje("Escoga una opcion valida");
    }
    //Botones para buscar los vehiculos en posicion
  }

  public void buscarCarro1() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(0));
  }

  public void buscarCarro2() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(1));
  }

  public void buscarCarro3() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(2));
  }

  public void buscarCarro4() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(3));
  }

  public void buscarCarro5() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(4));
  }

  public void buscarCarro6() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(5));
  }

  public void buscarCarro7() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(6));
  }

  public void buscarCarro8() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(7));
  }

  public void buscarCarro9() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(8));
  }

  public void buscarCarro10() {
    Front_console.MostrarMensaje(ParkCar.DataCarbtn(9));
  }

  public void buscarMoto1() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(0));
  }

  public void buscarMoto2() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(1));
  }

  public void buscarMoto3() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(2));
  }

  public void buscarMoto4() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(3));
  }

  public void buscarMoto5() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(4));
  }

  public void buscarMoto6() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(5));
  }

  public void buscarMoto7() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(6));
  }

  public void buscarMoto8() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(7));
  }

  public void buscarMoto9() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(8));
  }

  public void buscarMoto10() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(9));
  }

  public void buscarMoto11() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(10));
  }

  public void buscarMoto12() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(11));
  }

  public void buscarMoto13() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(12));
  }

  public void buscarMoto14() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(13));
  }

  public void buscarMoto15() {
    Front_console.MostrarMensaje(ParkMot.DataMotbtn(14));
  }

  JList<String> jListCarros = new JList<>();
  DefaultListModel<String> listModecarro = new DefaultListModel<String>();
  DefaultListModel<String> listModecarroActualizada = new DefaultListModel<String>();
  JList<String> listacarros = new JList<>();

  public JList CrearListaCarros() {
    for (int i = 0; i < 10; i++) {
      listModecarro.add(i, ParkCar.DataCarbtn(i));
    }
    listacarros.setModel(listModecarro);
    return listacarros;
  }

  public JList ActualizarCarros() {
    listModecarro.removeAllElements();
    for (int i = 0; i < 10; i++) {
      listModecarro.add(i, ParkCar.DataCarbtn(i));
    }

    listacarros.setModel(listModecarro);
    return listacarros;
  }

  JList<String> jListMotos = new JList<>();
  DefaultListModel<String> listModemoto = new DefaultListModel<String>();
  JList<String> listamotos = new JList<>();

  public JList CrearListaMotos() {
    for (int i = 0; i < 15; i++) {
      listModemoto.add(i, ParkMot.DataMotbtn(i));
    }
    listamotos.setModel(listModemoto);
    return listamotos;
  }

  public JList ActualizarMotos() {
    listModemoto.removeAllElements();
    for (int i = 0; i < 15; i++) {
      listModemoto.add(i, ParkMot.DataMotbtn(i));
    }

    listamotos.setModel(listModemoto);
    return listamotos;
  }
}
