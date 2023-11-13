package com.mycompany.atividade6; // Pacote Atividade 6
import java.util.Scanner; // Importa o Scanner

// Classe Main e Herança da Classe Jogar
public class Main extends Jogar{
    // Método Main
    public static void main(String[] args) {
        System.out.println("\n----------JOGO PEDRA, PAPEL E TESOURA----------\n"); // Título do Jogo
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNesse jogo você tem a chance de ganhar até 1000 moedas de ouro, que poderão ser resgatadas para no futuro. E com 500 moedas de ouro você poderá trocar por uma Desert Eagle, poderá trocar por um elixir que te dá a eternidade ou por uma lâmpada a qual o gênio te dará 3 desejos, desde que não seja qualquer um dos exemplos anteriores. Será que você conseguira o que deseja?\nQUE COMEÇEM OS JOGOS!!!\n"); // Descrição do Jogo
        System.out.println("Digite 1 para nivel fácil, 2 para nível médio e 3 para nível difícil."); // Seleciona o Nível Fácil, Médio ou Difícil
        int level = scanner.nextInt(); // Captura o Nivel
        switch(level){
            case 1 -> facil(); // Nivel 1 - Fácil
            case 2 -> medio(); // Nivel 2 - Médio
            case 3 -> dificil(); // Nivel 3 - Difícil
            default -> System.out.println("Digite uma opção válida."); // Diz ao usuário inserir um número válido
        }
    } public static void facil(){ // Libera Fácil
        jogar(12); // Seleciona 12 Tentativas
    } public static void medio(){ // Nível Médio
        jogar(8); // Libera 8 Tentativas
    } public static void dificil(){ // Nivel Difícil
        jogar(3); // Libera 3 Tentativas
    } 
}
