package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\Users\\Higur\\Desktop";
		
		try {
			//arqCont.readDir(dirWin);
			//arqCont.createFile(dirWin, "teste.csv");
			//arqCont.readFile(dirWin, "teste.csv");
			arqCont.openFile(dirWin, "teste.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
