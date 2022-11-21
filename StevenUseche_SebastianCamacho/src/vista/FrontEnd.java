package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import controlador.BackEnd;
import modelo.Parqueadero_carro;
import modelo.Parqueadero_moto;

public class FrontEnd extends JFrame implements ActionListener {

  FrontConsole Front_console = new FrontConsole();
  Parqueadero_carro b = new Parqueadero_carro();
  Parqueadero_moto a = new Parqueadero_moto();
  BackEnd controlador = new BackEnd();
  JList<String> jList2 = new JList<>();
  JPanel Derecha, Arriba, Abajo, Izquierda, Centro;
  JPanel Panel1 = new JPanel();
  JPanel Panel2 = new JPanel();
  JPanel Panel3 = new JPanel();
  JPanel Panel4 = new JPanel();
  JButton Boton_Listar, Boton_IngresarData, btnCarro1, btnCarro2, btnCarro3, btnCarro4, btnCarro5, btnCarro6, btnCarro7, btnCarro8, btnCarro9, btnCarro10, btnMoto1, btnMoto2, btnMoto3, btnMoto4, btnMoto5, btnMoto6, btnMoto7, btnMoto8, btnMoto9, btnMoto10, btnMoto11, btnMoto12, btnMoto13, btnMoto14, btnMoto15, btnRetirarCarro, btnRetirarMoto;
  public static final String Delede_atCar = "Delede_atCar";
  public static final String Delede_atMot = "Delede_atMot";
  public static final String CARRO1 = "CARRO1";
  public static final String CARRO2 = "CARRO2";
  public static final String CARRO3 = "CARRO3";
  public static final String CARRO4 = "CARRO4";
  public static final String CARRO5 = "CARRO5";
  public static final String CARRO6 = "CARRO6";
  public static final String CARRO7 = "CARRO7";
  public static final String CARRO8 = "CARRO8";
  public static final String CARRO9 = "CARRO9";
  public static final String CARRO10 = "CARRO10";
  public static final String MOTO1 = "MOTO1";
  public static final String MOTO2 = "MOTO2";
  public static final String MOTO3 = "MOTO3";
  public static final String MOTO4 = "MOTO4";
  public static final String MOTO5 = "MOTO5";
  public static final String MOTO6 = "MOTO6";
  public static final String MOTO7 = "MOTO7";
  public static final String MOTO8 = "MOTO8";
  public static final String MOTO9 = "MOTO9";
  public static final String MOTO10 = "MOTO10";
  public static final String MOTO11 = "MOTO11";
  public static final String MOTO12 = "MOTO12";
  public static final String MOTO13 = "MOTO13";
  public static final String MOTO14 = "MOTO14";
  public static final String MOTO15 = "MOTO15";
  public static final String INGRESARVEHICULO = "INGRESAR VEHICULO";
  public static final String CONSULTSARVEHICULO = "CONSULTAR VEHICULO";

  JScrollPane jScrollPane1 = new JScrollPane();
  JList<String> jList1 = new JList<>();
  JScrollPane jScrollPane2 = new JScrollPane();

  public FrontEnd(BackEnd controlador) {
    getContentPane().setLayout(new BorderLayout());
    setTitle("Parqueadero APP-JAVA");
    setSize(800, 600);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    crearPanel();
    crearBotones();
    setVisible(true);
  }

  public void crearBotones() {
    Boton_Listar = new JButton("Consultar Vehiculo");
    Boton_IngresarData = new JButton("Ingresar Vehiculo");

    btnCarro1 = new JButton("Carro1"); 
    btnCarro2 = new JButton("Carro2");
    btnCarro3 = new JButton("Carro3");
    btnCarro4 = new JButton("Carro4");
    btnCarro5 = new JButton("Carro5");
    btnCarro6 = new JButton("Carro6");
    btnCarro7 = new JButton("Carro7");
    btnCarro8 = new JButton("Carro8");
    btnCarro9 = new JButton("Carro9");
    btnCarro10 = new JButton("Carro10");

    btnMoto1 = new JButton("Moto1");
    btnMoto2 = new JButton("Moto2");
    btnMoto3 = new JButton("Moto3");
    btnMoto4 = new JButton("Moto4");
    btnMoto5 = new JButton("Moto5");
    btnMoto6 = new JButton("Moto6");
    btnMoto7 = new JButton("Moto7");
    btnMoto8 = new JButton("Moto8");
    btnMoto9 = new JButton("Moto9");
    btnMoto10 = new JButton("Moto10");
    btnMoto11 = new JButton("Moto11");
    btnMoto12 = new JButton("Moto12");
    btnMoto13 = new JButton("Moto13");
    btnMoto14 = new JButton("Moto14");
    btnMoto15 = new JButton("Moto15");
    btnRetirarCarro = new JButton("Retirar carro");
    btnRetirarMoto = new JButton("Retirar moto");
  }

  public JButton retitarMoto() {
    btnRetirarMoto = new JButton("Retirar Moto"); //boton para retirar moto
    btnRetirarMoto.setActionCommand(Delede_atMot);
    btnRetirarMoto.setBackground(new java.awt.Color(76, 145, 132));
    btnRetirarMoto.addActionListener(this);
    return btnRetirarMoto;
  }

  public JButton retitarCarro() {
    btnRetirarCarro = new JButton("Retirar carro"); //boton para retirar carro
    btnRetirarCarro.setActionCommand(Delede_atCar);
    btnRetirarCarro.setBackground(new java.awt.Color(76, 145, 132));
    btnRetirarCarro.addActionListener(this);
    return btnRetirarCarro;
  }

  public JButton agregarCarro1() {
    btnCarro1 = new JButton("Parqueadero Carro #1"); 
    btnCarro1.setActionCommand(CARRO1);
    btnCarro1.addActionListener(this);
    btnCarro1.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro1;
  }

  public JButton agregarCarro2() {
    btnCarro2 = new JButton("Parqueadero Carro #2");
    btnCarro2.setActionCommand(CARRO2);
    btnCarro2.addActionListener(this);
    btnCarro2.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro2;
  }

  public JButton agregarCarro3() {
    btnCarro3 = new JButton("Parqueadero Carro #3");
    btnCarro3.setActionCommand(CARRO3);
    btnCarro3.addActionListener(this);
    btnCarro3.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro3;
  }

  public JButton agregarCarro4() {
    btnCarro4 = new JButton("Parqueadero Carro #4");
    btnCarro4.setActionCommand(CARRO4);
    btnCarro4.addActionListener(this);
    btnCarro4.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro4;
  }

  public JButton agregarCarro5() {
    btnCarro5 = new JButton("Parqueadero Carro #5");
    btnCarro5.setActionCommand(CARRO5);
    btnCarro5.addActionListener(this);
    btnCarro5.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro5;
  }

  public JButton agregarCarro6() {
    btnCarro6 = new JButton("Parqueadero Carro #6");
    btnCarro6.setActionCommand(CARRO6);
    btnCarro6.addActionListener(this);
    btnCarro6.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro6;
  }

  public JButton agregarCarro7() {
    btnCarro7 = new JButton("Parqueadero Carro #7");
    btnCarro7.setActionCommand(CARRO7);
    btnCarro7.addActionListener(this);
    btnCarro7.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro7;
  }

  public JButton agregarCarro8() {
    btnCarro8 = new JButton("Parqueadero Carro #8");
    btnCarro8.setActionCommand(CARRO8);
    btnCarro8.addActionListener(this);
    btnCarro8.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro8;
  }

  public JButton agregarCarro9() {
    btnCarro9 = new JButton("Parqueadero Carro #9");
    btnCarro9.setActionCommand(CARRO9);
    btnCarro9.addActionListener(this);
    btnCarro9.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro9;
  }

  public JButton agregarCarro10() {
    btnCarro10 = new JButton("Parqueadero Carro #10");
    btnCarro10.setActionCommand(CARRO10);
    btnCarro10.addActionListener(this);
    btnCarro10.setBackground(new java.awt.Color(255, 255, 255));
    return btnCarro10;
  }

  public JButton botonConsultarVehiculo() {
    Boton_Listar = new JButton("Ver Info Moto/Carro");
    Boton_Listar.setBackground(new java.awt.Color(252, 177, 53 ));
    Boton_Listar.setActionCommand(CONSULTSARVEHICULO);
    Boton_Listar.addActionListener(this);
    return Boton_Listar;
  }

  public JButton botonIngresarVehiculo() {
    Boton_IngresarData = new JButton("Ingresar Moto/Carro");
    Boton_IngresarData.setBackground(new java.awt.Color(252, 177, 53 ));
    Boton_IngresarData.setActionCommand(INGRESARVEHICULO);
    Boton_IngresarData.addActionListener(this);
    return Boton_IngresarData;
  }

  public JButton agregarMoto1() {
    btnMoto1 = new JButton("Parqueadero Moto #1"); 
    btnMoto1.setActionCommand(MOTO1);
    btnMoto1.addActionListener(this);
    btnMoto1.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto1;
  }

  public JButton agregarMoto2() {
    btnMoto2 = new JButton("Parqueadero Moto #2");
    btnMoto2.setActionCommand(MOTO2);
    btnMoto2.addActionListener(this);
    btnMoto2.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto2;
  }

  public JButton agregarMoto3() {
    btnMoto3 = new JButton("Parqueadero Moto #3");
    btnMoto3.setActionCommand(MOTO3);
    btnMoto3.addActionListener(this);
    btnMoto3.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto3;
  }

  public JButton agregarMoto4() {
    btnMoto4 = new JButton("Parqueadero Moto #4");
    btnMoto4.setActionCommand(MOTO4);
    btnMoto4.addActionListener(this);
    btnMoto4.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto4;
  }

  public JButton agregarMoto5() {
    btnMoto5 = new JButton("Parqueadero Moto #5");
    btnMoto5.setActionCommand(MOTO5);
    btnMoto5.addActionListener(this);
    btnMoto5.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto5;
  }

  public JButton agregarMoto6() {
    btnMoto6 = new JButton("Parqueadero Moto #6");
    btnMoto6.setActionCommand(MOTO6);
    btnMoto6.addActionListener(this);
    btnMoto6.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto6;
  }

  public JButton agregarMoto7() {
    btnMoto7 = new JButton("Parqueadero Moto #7");
    btnMoto7.setActionCommand(MOTO7);
    btnMoto7.addActionListener(this);
    btnMoto7.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto7;
  }

  public JButton agregarMoto8() {
    btnMoto8 = new JButton("Parqueadero Moto #8");
    btnMoto8.setActionCommand(MOTO8);
    btnMoto8.addActionListener(this);
    btnMoto8.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto8;
  }

  public JButton agregarMoto9() {
    btnMoto9 = new JButton("Parqueadero Moto #9");
    btnMoto9.setActionCommand(MOTO9);
    btnMoto9.addActionListener(this);
    btnMoto9.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto9;
  }

  public JButton agregarMoto10() {
    btnMoto10 = new JButton("Parqueadero Moto #10");
    btnMoto10.setActionCommand(MOTO10);
    btnMoto10.addActionListener(this);
    btnMoto10.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto10;
  }

  public JButton agregarMoto11() {
    btnMoto11 = new JButton("Parqueadero Moto #11");
    btnMoto11.setActionCommand(MOTO11);
    btnMoto11.addActionListener(this);
    btnMoto11.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto11;
  }

  public JButton agregarMoto12() {
    btnMoto12 = new JButton("Parqueadero Moto #12");
    btnMoto12.setActionCommand(MOTO12);
    btnMoto12.addActionListener(this);
    btnMoto12.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto12;
  }

  public JButton agregarMoto13() {
    btnMoto13 = new JButton("Parqueadero Moto #13");
    btnMoto13.setActionCommand(MOTO13);
    btnMoto13.addActionListener(this);
    btnMoto13.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto13;
  }

  public JButton agregarMoto14() {
    btnMoto14 = new JButton("Parqueadero Moto #14");
    btnMoto14.setActionCommand(MOTO14);
    btnMoto14.addActionListener(this);
    btnMoto14.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto14;
  }

  public JButton agregarMoto15() {
    btnMoto15 = new JButton("Parqueadero Moto #15");
    btnMoto15.setActionCommand(MOTO15);
    btnMoto15.addActionListener(this);
    btnMoto15.setBackground(new java.awt.Color(255, 255, 255));
    return btnMoto15;
  }

  public void crearPanel() {
    jScrollPane1.setPreferredSize(new Dimension(350, 200));

    jList2 = controlador.CrearListaCarros();

    jScrollPane1.add(jList2);
    jScrollPane1.setViewportView(jList2);
    jList2.setVisible(true);
    jScrollPane1.setVisible(true);

    jList1 = controlador.CrearListaMotos();

    jScrollPane2.setPreferredSize(new Dimension(350, 200));

    jScrollPane2.add(jList1);
    jScrollPane2.setViewportView(jList1);
    jList1.setVisible(true);
    jScrollPane2.setVisible(true);

    crearBotones();
    JPanel east = new JPanel();
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel west = new JPanel();
    Panel1 = new JPanel();
    Panel2 = new JPanel();
    Panel3 = new JPanel();
    Panel4 = new JPanel();

    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(2, 2));
    panel1.setBorder(new TitledBorder("Parqueadero"));
    panel1.setPreferredSize(new Dimension(110, 90));
    add(panel1, BorderLayout.CENTER);

    Panel2.setBackground(new java.awt.Color(0, 0, 0));
    Panel1.setLayout(new GridLayout(15, 2));
    Panel1.setBorder(new TitledBorder("Lugares parqueadero"));
    Panel1.setPreferredSize(new Dimension(220, 90));
    Panel1.add(agregarCarro1());
    Panel1.add(agregarCarro2());
    Panel1.add(agregarCarro3());
    Panel1.add(agregarCarro4());
    Panel1.add(agregarCarro5());
    Panel1.add(agregarCarro6());
    Panel1.add(agregarCarro7());
    Panel1.add(agregarCarro8());
    Panel1.add(agregarCarro9());
    Panel1.add(agregarCarro10());
    Panel1.add(agregarMoto1());
    Panel1.add(agregarMoto2());
    Panel1.add(agregarMoto3());
    Panel1.add(agregarMoto4());
    Panel1.add(agregarMoto5());
    Panel1.add(agregarMoto6());
    Panel1.add(agregarMoto7());
    Panel1.add(agregarMoto8());
    Panel1.add(agregarMoto9());
    Panel1.add(agregarMoto10());
    Panel1.add(agregarMoto11());
    Panel1.add(agregarMoto12());
    Panel1.add(agregarMoto13());
    Panel1.add(agregarMoto14());
    Panel1.add(agregarMoto15());

    Panel2.setLayout(new GridLayout(3, 2));
    Panel2.setBorder(new TitledBorder(" "));
    Panel2.setPreferredSize(new Dimension(220, 1));

    JButton CampoVacio = new JButton("               ");
    JButton CampoVacio2 = new JButton("               ");
    JButton CampoVacio3 = new JButton("               ");
    JButton CampoVacio4 = new JButton("               ");

    CampoVacio.setBackground(new java.awt.Color(255, 230, 190 ));
    CampoVacio2.setBackground(new java.awt.Color(255, 230, 190 ));
    CampoVacio3.setBackground(new java.awt.Color(255, 230, 190 ));
    CampoVacio4.setBackground(new java.awt.Color(255, 230, 190 ));
    Panel2.add(CampoVacio3);
    Panel2.add(CampoVacio);
    CampoVacio.setEnabled(false);
    CampoVacio2.setEnabled(false);
    CampoVacio3.setEnabled(false);
    CampoVacio4.setEnabled(false);
    Panel2.add(CampoVacio2);
    Panel2.add(botonIngresarVehiculo());
    Panel2.add(CampoVacio);

    Panel2.add(botonConsultarVehiculo());
    Panel2.add(CampoVacio);

    Panel2.add(CampoVacio4);

    Panel3.setBorder(new TitledBorder("Carros Parqueados"));
    Panel3.setPreferredSize(new Dimension(220, 90));
    Panel3.add(jScrollPane1, BorderLayout.CENTER);
    Panel3.add(retitarCarro(), BorderLayout.SOUTH);

    Panel4.setBorder(new TitledBorder("Motos parqueadas"));
    Panel4.setPreferredSize(new Dimension(220, 90));
    Panel4.add(jScrollPane2, BorderLayout.CENTER);
    Panel4.add(retitarMoto(), BorderLayout.SOUTH);
    Panel2.setBackground(new java.awt.Color(130,  243, 230));
    Panel3.setBackground(new java.awt.Color(130,  243, 230));
    Panel4.setBackground(new java.awt.Color(130,  243, 230));
    Panel1.setBackground(new java.awt.Color(130,  243, 230));
    
    east = new JPanel();
    north = new JPanel();
    south = new JPanel();
    west = new JPanel();
    Centro = new JPanel();

    add(east, BorderLayout.EAST);
    add(north, BorderLayout.NORTH);
    add(west, BorderLayout.WEST);
    add(south, BorderLayout.SOUTH);
    east.setBackground(new java.awt.Color(130,  243, 230));
    west.setBackground(new java.awt.Color(130,  243, 230));
    north.setBackground(new java.awt.Color(130,  243, 230));
    south.setBackground(new java.awt.Color(130,  243, 230));

    panel1.add(Panel1);
    panel1.add(Panel3);
    panel1.add(Panel2);
    panel1.add(Panel4);

    panel1.setBackground(new java.awt.Color(130,  243, 230));
    add(panel1, BorderLayout.CENTER);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

    String ClickCar1 = e.getActionCommand();
    if (ClickCar1.equals(CARRO1)) {
      controlador.buscarCarro1();
    }

    String ClickCar2 = e.getActionCommand();
    if (ClickCar2.equals(CARRO2)) {
      controlador.buscarCarro2();
    }

    String ClickCar3 = e.getActionCommand();
    if (ClickCar3.equals(CARRO3)) {
      controlador.buscarCarro3();
    }
    String ClickCar4 = e.getActionCommand();
    if (ClickCar4.equals(CARRO4)) {
      controlador.buscarCarro4();
    }
    String ClickCar5 = e.getActionCommand();
    if (ClickCar5.equals(CARRO5)) {
      controlador.buscarCarro5();
    }

    String ClickCar6 = e.getActionCommand();
    if (ClickCar6.equals(CARRO6)) {
      controlador.buscarCarro6();
    }
    String ClickCar7 = e.getActionCommand();
    if (ClickCar7.equals(CARRO7)) {
      controlador.buscarCarro7();
    }
    String ClickCar8 = e.getActionCommand();
    if (ClickCar8.equals(CARRO8)) {
      controlador.buscarCarro8();
    }
    String ClickCar9 = e.getActionCommand();
    if (ClickCar9.equals(CARRO9)) {
      controlador.buscarCarro9();
    }
    String ClickCar10 = e.getActionCommand();
    if (ClickCar10.equals(CARRO10)) {
      controlador.buscarCarro10();
    }

    String ClickMot1 = e.getActionCommand();
    if (ClickMot1.equals(MOTO1)) {
      controlador.buscarMoto1();
    }
    String ClickMot2 = e.getActionCommand();
    if (ClickMot2.equals(MOTO2)) {
      controlador.buscarMoto2();
    }
    String ClickMot3 = e.getActionCommand();
    if (ClickMot3.equals(MOTO3)) {
      controlador.buscarMoto3();
    }
    String ClickMot4 = e.getActionCommand();
    if (ClickMot4.equals(MOTO4)) {
      controlador.buscarMoto4();
    }
    String ClickMot5 = e.getActionCommand();
    if (ClickMot5.equals(MOTO5)) {
      controlador.buscarMoto5();
    }
    String ClickMot6 = e.getActionCommand();
    if (ClickMot6.equals(MOTO6)) {
      controlador.buscarMoto6();
    }
    String ClickMot7 = e.getActionCommand();
    if (ClickMot7.equals(MOTO7)) {
      controlador.buscarMoto7();
    }
    String ClickMot8 = e.getActionCommand();
    if (ClickMot8.equals(MOTO8)) {
      controlador.buscarMoto8();
    }
    String ClickMot9 = e.getActionCommand();
    if (ClickMot9.equals(MOTO9)) {
      controlador.buscarMoto9();
    }
    String ClickMot10 = e.getActionCommand();
    if (ClickMot10.equals(MOTO10)) {
      controlador.buscarMoto10();
    }
    String ClickMot11 = e.getActionCommand();
    if (ClickMot11.equals(MOTO11)) {
      controlador.buscarMoto11();
    }
    String ClickMot12 = e.getActionCommand();
    if (ClickMot12.equals(MOTO12)) {
      controlador.buscarMoto12();
    }
    String ClickMot13 = e.getActionCommand();
    if (ClickMot13.equals(MOTO13)) {
      controlador.buscarMoto13();
    }
    String ClickMot14 = e.getActionCommand();
    if (ClickMot14.equals(MOTO14)) {
      controlador.buscarMoto14();
    }
    String ClickMot15 = e.getActionCommand();
    if (ClickMot15.equals(MOTO15)) {
      controlador.buscarMoto15();
    }
    String comandoCONSULTARVEHICULO = e.getActionCommand();
    if (comandoCONSULTARVEHICULO.equals(CONSULTSARVEHICULO)) {
      controlador.Buscar();
    }

    String comandoINGRESARVEHICULO = e.getActionCommand();
    if (comandoINGRESARVEHICULO.equals(INGRESARVEHICULO)) {
      controlador.ValidadorPark();

      jList2 = controlador.ActualizarCarros();
      jScrollPane1.add(jList2);
      jScrollPane1.setViewportView(jList2);
      jList2.setVisible(true);

      jList1 = controlador.ActualizarMotos();
      jScrollPane2.add(jList1);
      jScrollPane2.setViewportView(jList1);
      jList1.setVisible(true);
    }

    String comandoRETIRARCARRO = e.getActionCommand();
    if (comandoRETIRARCARRO.equals(Delede_atCar)) {
      controlador.RetiroCarro();
      jList2 = controlador.ActualizarCarros();
      jScrollPane1.add(jList2);
      jScrollPane1.setViewportView(jList2);
      jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
      jList2.setVisible(true);
    }
    String comandoRETIRARMOTO = e.getActionCommand();
    if (comandoRETIRARMOTO.equals(Delede_atMot)) {
      controlador.RetiroMoto();
      jList1 = controlador.ActualizarMotos();
      jScrollPane2.add(jList1);
      jScrollPane2.setViewportView(jList1);
      jList1.setVisible(true);
    }
  }
}
