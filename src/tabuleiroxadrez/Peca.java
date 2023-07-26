package tabuleiroxadrez;

public abstract class Peca {
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
        // abstract , apenas classe que herdarem a classe mae iram poder acessar 
    public abstract boolean[][] movimentosPossiveis();

    public boolean movimentoPossivel(Posicao posicao){
        return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
    }
    public boolean existeMovimentoPossivel(Posicao posica){
        boolean[][] matriz = movimentosPossiveis();
        for(int i=0;i<matriz.length;i++){
            for(int j =0; j<matriz.length;j++){
                if(matriz[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    
}
