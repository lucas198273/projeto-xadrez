package xadrez;

import pecasdoxadrez.Bispo;
import pecasdoxadrez.Cavalo;
import pecasdoxadrez.Peao;
import pecasdoxadrez.Rainha;
import pecasdoxadrez.Rei;
import pecasdoxadrez.Torre;
import tabuleiroxadrez.ExcecaoTabuleiro;
import tabuleiroxadrez.Peca;
import tabuleiroxadrez.Posicao;
import tabuleiroxadrez.Tabuleiro;

public class PartidaXadrez {
    
    private Tabuleiro tabuleiro;

    public PartidaXadrez() {   // Houve erro pois meu tabuleiro estava vazio
        tabuleiro = new Tabuleiro(8, 8); // pois eu havia passado tabuleiro como parametro 
        iniciarPartida();
    }
    public PecaXadrez[][] getPecaTabuleiros(){
        PecaXadrez[][] peca = new PecaXadrez[tabuleiro.getLinha()][tabuleiro.getcoluna()];
        for(int i=0; i<tabuleiro.getLinha();i++){
            for(int j=0;j<tabuleiro.getcoluna();j++){
                peca[i][j] = (PecaXadrez) tabuleiro.peca(i,j); // DownCasting para subClasse PecaTabuleiro
            }
        }
        return peca;
    }
    public PecaXadrez executarMovimento(PosicaoXadrez posicaoPartida, PosicaoXadrez posicaoDestino){
        Posicao partida = posicaoPartida.paraPosicao();
        Posicao destino = posicaoDestino.paraPosicao();
        ValidarPosicaoOrigem(partida);
        Peca pecaCapturada = relizarMovimento(partida,destino);
        return(PecaXadrez) pecaCapturada; //downCasting
    }
    private void ValidarPosicaoOrigem(Posicao posicao){
        if(!tabuleiro.haUmaPeca(posicao)){
            throw new ExcecaoTabuleiro("POSIÇÃO NAO EXISTE NO TABULEIRO");
        }
    }
    private Peca relizarMovimento(Posicao partida, Posicao destino){
        Peca p = tabuleiro.removePeca(partida);
        Peca pecaCapturada = tabuleiro.removePeca(destino);
        tabuleiro.LugarPeca(p, destino);
        return pecaCapturada;
    }
    public void novoLugarPeca(char coluna, int linha , PecaXadrez peca){
        tabuleiro.LugarPeca(peca, new PosicaoXadrez(coluna, linha).paraPosicao()); // estudar esta linha
    }
    public void iniciarPartida(){

        // Peças Pretas
        novoLugarPeca('a', 8, new Torre(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 1, new Torre(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 7, new Cavalo(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 2, new Cavalo(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 3, new Bispo(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 6, new Bispo(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 5, new Rei(tabuleiro, Color.BLACK));
        novoLugarPeca('a', 4, new Rainha(tabuleiro,Color.BLACK));
        novoLugarPeca('b', 8, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 7, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 6, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 5, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 4, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 3, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 2, new Peao(tabuleiro, Color.BLACK));
        novoLugarPeca('b', 1, new Peao(tabuleiro, Color.BLACK));

        //Peças Brancas
                
        novoLugarPeca('h', 1, new Torre(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 8, new Torre(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 7, new Cavalo(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 2, new Cavalo(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 3, new Bispo(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 6, new Bispo(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 5, new Rei(tabuleiro, Color.WHITE));
        novoLugarPeca('h', 4, new Rainha(tabuleiro,Color.WHITE));
        novoLugarPeca('g', 8, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 7, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 6, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 5, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 4, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 3, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 2, new Peao(tabuleiro, Color.WHITE));
        novoLugarPeca('g', 1, new Peao(tabuleiro, Color.WHITE));


 
    }
 

    
}
