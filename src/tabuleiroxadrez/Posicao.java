package tabuleiroxadrez;

public class Posicao {
    private int coluna;
    private int linha;

    public Posicao(int linha, int coluna) {
        this.coluna = coluna;
        this.linha = linha;

    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Peca peca(int linha, int coluna) {
        return peca(linha, coluna);

    }

    public Peca peca(Posicao posicao) {
        return peca(posicao.getLinha(), posicao.getColuna());
    }

    public void setValores(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

}
