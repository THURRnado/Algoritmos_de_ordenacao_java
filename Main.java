package algoritmosDeOrdenacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void criaLista(ArrayList<Integer> lista) {
		
		lista.add(5);
		lista.add(7);
		lista.add(6);
		lista.add(14);
		lista.add(1);
		lista.add(30);
		lista.add(80);
		lista.add(20);
		lista.add(100);
		lista.add(42);
		lista.add(56);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		criaLista(lista);
		int tamLista = lista.size();

		Algoritmos a = new Algoritmos(lista);
		
		long inicio, fim;
		
		int opcao;
		
		System.out.println("Escolha qual algoritmo deseja usar(Digite: 1, 2, 3, 4 ou 5): ");
		System.out.println("1) SelectionSort;\n2) BubbleSort;\n3) InsertionSort;\n4) MergeSort;\n5) QuickSort.");
		System.out.print("Digite:");
		opcao = new Scanner(System.in).nextInt();
		
			switch(opcao) {
			case 1:

				inicio = System.nanoTime();
				a.selectionSort();
				fim = System.nanoTime();
				System.out.println("SelectionSort: " + lista + "-----> Tempo: " + (fim-inicio));

				break;

			case 2: 

				inicio = System.nanoTime();
				a.bubbleSort();
				fim = System.nanoTime();
				System.out.println("BubbleSort: " + lista + "-----> Tempo: " + (fim-inicio));

				break;

			case 3:

				inicio = System.nanoTime();
				a.insertionSort();
				fim = System.nanoTime();
				System.out.println("InsertionSort: " + lista + "-----> Tempo: " + (fim-inicio));

				break;

			case 4:

				inicio = System.nanoTime();
				a.mergeSort(0, (tamLista - 1));
				fim = System.nanoTime();
				System.out.println("MergeSort: " + lista + "-----> Tempo: " + (fim-inicio));

				break;

			case 5:

				inicio = System.nanoTime();
				a.quickSort(0, tamLista - 1);
				fim = System.nanoTime();
				System.out.println("QuickSort: " + lista + "-----> Tempo: " + (fim-inicio));

				break;

			default:

				System.out.println("Opcao inválida!!");
			}
		}
	}
