package controlador;

import vista.FrontEnd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    FrontEnd gui = new FrontEnd(null);
        gui.setVisible(true);
		BackEnd c = new BackEnd();
	}

}
