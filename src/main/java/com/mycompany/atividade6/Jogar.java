package com.mycompany.atividade6; // Pacote Atividade 6
import java.util.Random; // Importa a Classe Random
import java.util.Scanner; // Importa a Classe Scanner

abstract class Jogar {
    // Método Jogar
    public static void jogar(int tentativas){
        Scanner scanner = new Scanner(System.in); // Instancia a Classe Scanner
        Random random = new Random(); // Instancia a Classe Scanner
        int moedas = 0; // Inicializa o Premio com 0
        int escolhaPremio = 0; // Inicializa a Escolha do Prêmio com 0
        // Loop de Repetição que roda de acordo com uma certa quantidade de tentativas
        for (int i = 0; i < tentativas; i++) {
            System.out.println("\nEscolha: 1 - Pedra, 2 - Papel, 3 - Tesoura"); // Escolhe Pedra, Papel ou Tesoura
            int escolhaUsuario = scanner.nextInt(); // Captura a Escolha Anterior do Usuário
            int escolhaComputador = random.nextInt(2) + 1; // Gera um número aleátorio de 1 a 3
            System.out.println("Escolha do Computador: " + escolhaComputador); // Printa a Escolha do Computador
            
            // Lógica do Jogo
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate! Tente novamente."); // Se a Escolha do Computador for a mesma do usuário, ele classifica como empate
            } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                       (escolhaUsuario == 2 && escolhaComputador == 1) ||
                       (escolhaUsuario == 3 && escolhaComputador == 2)) {
                System.out.println("Você ganhou! +200 moedas de ouro."); // Lógica caso o usuario ganhe
                moedas += 200; // Adiciona 200 moedas de ouro
            } else {
                System.out.println("Você perdeu! Tente novamente."); // Senão a vitória é do Computador
            }
        }System.out.println("\nFim do jogo. Você ganhou um total de " + moedas + " moedas de ouro."); // Diz a quantidade de Moedas Ganhas
        boolean continuar ; // Loop Infinito como Verdadeiro
        if(moedas >= 500){
            continuar = true; // Continua caso as moedas sejam maior ou igual a 500
        } else{
            System.out.println("Você não ganhou nenhum prêmio, mas a prática leva a perfeição, então tente novamente.");
            continuar = false; // Encerra o jogo caso não seja
        }   while(continuar){
             System.out.println("Digite 1 para trocar por uma Desert Eagle, 2 para trocar pelo elixir e 3 para escolher o gênio da lâmpada"); // Prêmio
             escolhaPremio = scanner.nextInt(); // Captura a Escolha do Premio
            if(moedas >= 500 && escolhaPremio == 1){
                System.out.println("Agora você é dono de uma Desert Eagle .50AE"); // Premio 1 - Desert Eagle .50AE
                continuar = false; // Encerra o Jogo
            } else if(moedas >= 500 && escolhaPremio == 2){
                System.out.println("Agora você é dono de um Elixir da Imortalidade"); // Premio 2 - Elixir da Imortalidade
                continuar = false; // Encerra o Jogo
            } else if(moedas >= 500 && escolhaPremio == 3){
                System.out.println("Agora você recebeu seu pedido do Gênio da Lâmpada e conseguiu o que queria, mas perdeu os outros prêmios anteriores.");
                continuar = false; // Encerra o Jogo
            }else{
                System.out.println("Digite um número válido."); // Digita um numero válido e retorna ao loop
            }
        }
    }
}
