package algoritmosDeOrdenacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<Integer> lerArquivoTxt(String caminhoArquivo) throws IOException {
        List<Integer> numeros = new ArrayList<>();

        FileReader arquivo = new FileReader(caminhoArquivo);
        BufferedReader leitor = new BufferedReader(arquivo);

        String linha;
        while ((linha = leitor.readLine()) != null) {
            numeros.add(Integer.parseInt(linha));
        }

        leitor.close();

        return numeros;
    }
	
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
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> lista;
		
		lista = (ArrayList<Integer>) lerArquivoTxt("caminhoDoArquivo");
	
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

				inicio = System.currentTimeMillis();
				a.selectionSort();
				fim = System.currentTimeMillis();
				System.out.println("SelectionSort: " + lista + "\n-----> Tempo: " + (fim-inicio));

				break;

			case 2: 

				inicio = System.currentTimeMillis();
				a.bubbleSort();
				fim = System.currentTimeMillis();
				System.out.println("BubbleSort: " + lista + "\n-----> Tempo: " + (fim-inicio));

				break;

			case 3:

				inicio = System.currentTimeMillis();
				a.insertionSort();
				fim = System.currentTimeMillis();
				System.out.println("InsertionSort: " + lista + "\n-----> Tempo: " + (fim-inicio));

				break;

			case 4:

				inicio = System.currentTimeMillis();
				a.mergeSort(0, (tamLista - 1));
				fim = System.currentTimeMillis();
				System.out.println("MergeSort: " + lista + "\n-----> Tempo: " + (fim-inicio));

				break;

			case 5:

				inicio = System.currentTimeMillis();
				a.quickSort(0, tamLista - 1);
				fim = System.currentTimeMillis();
				System.out.println("QuickSort: " + lista + "\n-----> Tempo: " + (fim-inicio));

				break;

			default:

				System.out.println("Opcao inválida!!");
			}
		}
	}
