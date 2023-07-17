package tabuleiroxadrez;

public class ExcecaoTabuleiro extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    // versao padrao
    public ExcecaoTabuleiro(String msg){
        super(msg); // repassa a menssagem para a super classe
    }
}
