package xadrez;

import tabuleiroxadrez.ExcecaoTabuleiro;

public class ExcecaoXadrez extends ExcecaoTabuleiro{
    
    private static final long serialVersionUID = 1L;

    public ExcecaoXadrez(String msg){
        super(msg);// Repassa chamada para classe RuntimeException 
    }
}
