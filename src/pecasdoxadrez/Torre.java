package pecasdoxadrez;

import tabuleiroxadrez.Posicao;
import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

    public Torre(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        
    }

    @Override
    public String toString() {
        return "T";
    }
   
    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] matriz = new boolean[getTabuleiro().getLinha()][getTabuleiro().getcoluna()]; // Boolean inicia como false
        
        Posicao p = new Posicao(0, 0); // Variavel auxiliar

        // Acessando posição do objeto Peca == (Classe Mae)
        

        // AGORA NOSSA POSIÇÃO P É A POSIÇÃO DO NOSSO OBJETO, ENTAO PARA TRABALHAR COM A POSIÇÃO DO NOSSO OBJETO 
        // É PRECISO APENAS TRABLHAR COM A VARIAVEL P
        // while( tabuleiro existir a posição (p) e Nao houver uma peça la)


        // Movimentação para cima Reduz -1 na linha 

        p.setValores(posicao.getLinha() - 1, posicao.getColuna()); // atribuindo posição da variavel auxiliar a posição do nosso objeto em movimento 
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            // Marcando a posição como verdadeira
            matriz[p.getColuna()][p.getLinha()] = true;
            p.setLinha(p.getLinha() - 1);
            // posição marcada como verdadeira pois sera permitido que a peça avance para esta posição em especifico
        
        }
        if(getTabuleiro().posicaoExiste(p) && pecaOponente(p)){
            matriz[p.getColuna()][p.getLinha()] = true;
        }

        // Movimentação para baixo acressenta +1 na linha
        p.setValores(posicao.getLinha() + 1, posicao.getColuna()); // atribuindo posição da variavel auxiliar a posição do nosso objeto em movimento 
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            // Marcando a posição como verdadeira
            matriz[p.getColuna()][p.getLinha()] = true;
            p.setLinha(p.getLinha() + 1);
            // posição marcada como verdadeira pois sera permitido que a peça avance para esta posição em especifico
        
        }
        if(getTabuleiro().posicaoExiste(p) && pecaOponente(p)){
            matriz[p.getColuna()][p.getLinha()] = true;
        }

        // Movimentação Lateral  Esquerda  Reduz -1 na coluna
        p.setValores(posicao.getLinha() , posicao.getColuna()-1 ); // atribuindo posição da variavel auxiliar a posição do nosso objeto em movimento 
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            // Marcando a posição como verdadeira
            matriz[p.getColuna()][p.getLinha()] = true;
            p.setLinha(p.getColuna() -1);
            // posição marcada como verdadeira pois sera permitido que a peça avance para esta posição em especifico
        
        }
        if(getTabuleiro().posicaoExiste(p) && pecaOponente(p)){
            matriz[p.getColuna()][p.getLinha()] = true;
        }


        // Movimentação Lateral Direita Acressenta +1 na coluna 
        p.setValores(posicao.getLinha() , posicao.getColuna()+1 ); // atribuindo posição da variavel auxiliar a posição do nosso objeto em movimento 
        while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().haUmaPeca(p)){
            // Marcando a posição como verdadeira
            matriz[p.getColuna()][p.getLinha()] = true;
            p.setLinha(p.getColuna() +1);
            // posição marcada como verdadeira pois sera permitido que a peça avance para esta posição em especifico
        
        }
        if(getTabuleiro().posicaoExiste(p) && pecaOponente(p)){
            matriz[p.getColuna()][p.getLinha()] = true;
        }




        return matriz;
    }
    
    

}
