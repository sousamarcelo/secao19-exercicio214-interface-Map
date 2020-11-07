package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.next();
		
		Map<String, Integer> votos = new TreeMap<String, Integer>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			
			
			while (linha != null) {
				
				
				String[] campo = linha.split(",");
				String nome = campo[0];
				Integer contandoVotos = Integer.parseInt(campo[1]);					
				
				if (votos.containsKey(nome)) {
					int votosAteAgora = votos.get(nome);
					votos.put(nome, contandoVotos + votosAteAgora);
				} else {
					votos.put(nome, contandoVotos);
				}
				
				linha = br.readLine();
				
			}
			System.out.println();
			
			for (String key : votos.keySet()) {
				System.out.println(key + " " + votos.get(key));
			}				
			
				
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		sc.close();

	}

}
