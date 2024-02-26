package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		
		VetorController vControler = new VetorController();
		int[] vetor = {-1, 10, 5, 0, -10, -2, 15};
		int tamanho = vetor.length;
		
		System.out.println(vControler.qtdNegativos(vetor, tamanho, 0));
	}

}
