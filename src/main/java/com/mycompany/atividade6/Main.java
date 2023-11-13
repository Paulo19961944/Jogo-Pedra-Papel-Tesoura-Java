package com.mycompany.atividade6;
import java.util.Scanner;

public class Main extends Jogar{
    public static void main(String[] args) {
        System.out.println("\n----------JOGO PEDRA, PAPEL E TESOURA----------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNesse jogo você tem a chance de ganhar até 1000 moedas de ouro, que poderão ser resgatadas para no futuro. E com 500 moedas de ouro você poderá trocar por uma Desert Eagle, poderá trocar por um elixir que te dá a eternidade ou por uma lâmpada a qual o gênio te dará 3 desejos, desde que não seja qualquer um dos exemplos anteriores. Será que você conseguira o que deseja?\nQUE COMEÇEM OS JOGOS!!!\n");
        System.out.println("Digite 1 para nivel fácil, 2 para nível médio e 3 para nível difícil.");
        int level = scanner.nextInt();
        switch(level){
            case 1 -> facil();
            case 2 -> medio();
            case 3 -> dificil();
            default -> System.out.println("Digite uma opção válida.");
        }
    } public static void facil(){
        jogar(12);
    } public static void medio(){
        jogar(8);
    } public static void dificil(){
        jogar(3);
    } 
}
