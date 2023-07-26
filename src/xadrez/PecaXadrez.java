package xadrez;

import tabuleiroxadrez.Peca;
import tabuleiroxadrez.Posicao;
import tabuleiroxadrez.Tabuleiro;

public abstract class PecaXadrez extends Peca {
    
    private Color color;

    

    public PecaXadrez(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    protected boolean pecaOponente(Posicao posicao){ // o alvo do metodo é uma possição onde testamos se a posição
        PecaXadrez cm = (PecaXadrez)getTabuleiro().peca(posicao);// esta vazia ou se existe uma peça ,e se a cor é diferente da cor da peça 
        return cm != null && cm.getColor() != color;// que esta se movimentando , Retorna TRUE || FALSE
    }

    

    
}
