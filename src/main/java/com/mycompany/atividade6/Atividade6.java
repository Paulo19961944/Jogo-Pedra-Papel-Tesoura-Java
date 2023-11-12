package com.mycompany.atividade6;
import java.util.Scanner;
import java.util.Random;

public class Atividade6 {
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
    } public static void jogar(int tentativas){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int moedas = 0;
        int escolhaPremio = 0;
        for (int i = 0; i < tentativas; i++) {
            System.out.println("\nEscolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");
            int escolhaUsuario = scanner.nextInt();
            int escolhaComputador = random.nextInt(3) + 1;
            System.out.println("Escolha do Computador: " + escolhaComputador);
            
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate! Tente novamente.");
            } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                       (escolhaUsuario == 2 && escolhaComputador == 1) ||
                       (escolhaUsuario == 3 && escolhaComputador == 2)) {
                System.out.println("Você ganhou! +200 moedas de ouro.");
                moedas += 200;
            } else {
                System.out.println("Você perdeu! Tente novamente.");
            }
        }System.out.println("\nFim do jogo. Você ganhou um total de " + moedas + " moedas de ouro.");
        boolean continuar ;
        if(moedas >= 500){
            continuar = true;
        } else{
            System.out.println("Você não ganhou nenhum prêmio, mas a prática leva a perfeição, então tente novamente.");
            continuar = false;
        }   while(continuar){
             System.out.println("Digite 1 para trocar por uma Desert Eagle, 2 para trocar pelo elixir e 3 para escolher o gênio da lâmpada");
             escolhaPremio = scanner.nextInt();
            if(moedas >= 500 && escolhaPremio == 1){
                System.out.println("Agora você é dono de uma Desert Eagle .50AE");
                continuar = false;
            } else if(moedas >= 500 && escolhaPremio == 2){
                System.out.println("Agora você é dono de um Elixir da Imortalidade");
                continuar = false;
            } else if(moedas >= 500 && escolhaPremio == 3){
                System.out.println("Agora você recebeu seu pedido do Gênio da Lâmpada e conseguiu o que queria, mas perdeu os outros prêmios anteriores.");
                continuar = false;
            }else{
                System.out.println("Digite um número válido.");
            }
        }
    }
}
