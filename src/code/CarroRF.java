package code;

import java.util.Arrays;

public class CarroRF implements Runnable{
	private int nivelBateria;
	private int numMovimentos;
	public CarroRF() {
		this.nivelBateria = 100;
		this.numMovimentos = 0;
	}
	
	
	/**
	 * Agenda os movimentos do CarroRF através das direções passadas como argumento do Tipo Direcao)
	 * 
	 * @param direcoesMovimento Representa os movimentos agendados através das direções (exemplo: DIREITA).
	 * @see Direcao
	 * @since 1.0
	 * @version 1.0
	 * @author Lucas Kauã Silva
	 */
	public void agendarMovimentos(Direcao... direcoesMovimentos) {
		System.out.println("=============================>");
		String msg = String.format("Lista de movimentos agendados: %s", Arrays.toString(direcoesMovimentos));
		System.out.println(msg);
		numMovimentos = numMovimentos + direcoesMovimentos.length;
	}

	@Override
	public void run() {
		System.out.println("Executando Movimentos ...\n");
		nivelBateria = nivelBateria - numMovimentos;
		numMovimentos = 0;
	}
	
	@Override
	public String toString() {
		return String.format("  CarroRF {\n"
				           + "      Nível da Bateria: %d%n" 
				           + "      Movimentos a Executar: %d%n"
				           + "  }%n"
				           , nivelBateria, numMovimentos);
	}
	
}