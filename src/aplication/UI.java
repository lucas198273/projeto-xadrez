package aplication;


import xadrez.PecaXadrez;
public class UI {
    // Esta classe é responsavel por exibir o jogo de xadrez

    public static void exibirtabuleiro(PecaXadrez[][] peca){
        for(int i=0;i< peca.length;i++){ // Imprimi linha
            System.out.print((8-i) +"  ");
            for(int j=0;j<peca.length;j++){ // imprime coluna

                exibirPeca(peca[i][j]); // Verifica se a Peça esta vazia , se nao imprime a peca
            }
            System.out.println();
        }
        System.out.println("\n   A  B  C  D  E  F  G  H ");
        
    }

    private static void exibirPeca(PecaXadrez peca){

        if(peca == null){
            System.out.print("-");
        }
        else{
            System.out.print(peca);
        }
        System.out.print("  ");
    }
}
