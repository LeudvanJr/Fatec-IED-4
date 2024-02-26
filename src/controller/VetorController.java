package controller;

public class VetorController {
	public VetorController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para verificar a quantidade de negativos em um vetor
	public int qtdNegativos(int[] vetor, int tamanho, int qtd) {
		
		//Condicao de Parada - Quando nao se tem mais versoes menores do vetor para verificar
		if(tamanho <= 0)
			return qtd;
		
		//Verifica a ultima posicao do vetor e depois de uma versao menor do mesmo vetor
		if(vetor[tamanho-1] < 0)
			qtd++;
		
		return qtdNegativos(vetor, --tamanho, qtd);
	}
}
