package xadrez;

import tabuleiroxadrez.Posicao;

public class PosicaoXadrez {
    
    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha){
        if(coluna < 'a' || coluna > 'h' || linha <1 || linha>8){
            throw new ExcecaoPeca("ERRO AO INSTANCIAR A POSIÇÃO DA PECA , COLUNA E LINHA DEVE ESTAR DE a1 ATE h8;");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    protected Posicao paraPosicao(){
        return new Posicao(8 - linha,coluna - 'a'); // estudar esta linha
    }
    protected static PosicaoXadrez Posicaopartida(Posicao posicao){
        return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha()); // estudar esta linha
    }

    @Override
    public String toString() {
        return " "+coluna+" " + linha;
    }

}
