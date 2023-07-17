package xadrez;

public class ExcecaoPeca extends RuntimeException {

    private static final long serialVersionUID = 1L;

    // versao padrao
    public ExcecaoPeca(String msg) {
        super(msg);// repassa a menssagem para a super classe
    }

}
