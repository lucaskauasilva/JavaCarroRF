package main;

import static code.Direcao.*;
import code.CarroRF;

public class Main {
	public static void main(String[] args) {
		CarroRF carro = new CarroRF();
		
		carro.agendarMovimentos(CIMA, DIREITA, CIMA, ESQUERDA);
		System.out.println(carro);
		
		carro.run();
		System.out.println(carro);
		
		carro.agendarMovimentos(BAIXO, ESQUERDA, ESQUERDA);
		System.out.println(carro);
		
		carro.run();
		System.out.println(carro);
	}
}
