package tabuleiroxadrez;

import javax.swing.text.Position;

public class Tabuleiro {
    private int linha;
    private int coluna;
    private Peca[][] pecas;


    public Tabuleiro(int linha, int coluna) {
        if(linha < 1 || coluna < 1){// exemplo de tratamento de personalizad0o
            throw new ExcecaoTabuleiro("O TABULEIRO DEVE CONTER PELO MENOS 1 LINHA E 1 COLUNA");
        }
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca[linha][coluna];
    }
    public int getLinha() {
        return linha;
    }
    public int getcoluna() {
        return coluna;
    }



    public Peca peca(int linha, int coluna){
        if(!posicaoExiste(linha, coluna)){
            throw new ExcecaoTabuleiro("POSIÇÃO NAO EXISTE NO TABULEIRO");
        }
        return pecas [linha][coluna];
    }
    public Peca peca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new ExcecaoTabuleiro("POSIÇÃO NAO EXISTE NO TABULEIRO");
        }
        return pecas [posicao.getLinha()][posicao.getColuna()];
    }
    // este metodo peca(Posicao posicao) retorna a pessa na posição passada
    // este mesmo metodo é utilizado no metodo haUmaPeca

    public void LugarPeca(Peca peca, Posicao posicao){
        if(haUmaPeca(posicao)){
            throw new ExcecaoTabuleiro("JA EXISTE UMA PEÇA NESTA POSIÇÃO"+ posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;

    }// O metodo abaixo retorna booleana , Verifica se a posição da linha e coluna é existente no tabuleiro
    public boolean posicaoExiste(int Linha, int colunas){
        return Linha >= 0 && Linha < linha && colunas >= 0 && colunas < coluna;
    }
    // O metodo abaixo retorna booleana , Verifica se a posição é existente no tabuleiro
     public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(),posicao.getColuna());
    }
    // estamos reaproveitando o metodo posicaoExiste(int linha, int coluna)
    
    // metodo abaixo testa se existe uma peca
    public boolean haUmaPeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new ExcecaoTabuleiro("POSIÇÃO NAO EXISTE NO TABULEIRO");
        }
        return peca(posicao) != null;

    }
    
}