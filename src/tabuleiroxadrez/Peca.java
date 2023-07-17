package tabuleiroxadrez;

public class Peca {
    protected Posicao posicao;
    private  Tabuleiro tabuleiro;
    
    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }
    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    
}
