
public class CaixaSobre extends Componente {

    public CaixaSobre(int corlinha, int corsombreamento, int posinicialx, int posinicialy) {
        this.setPosinicialx(posinicialx);
        this.setPosinicialy(posinicialy);
        this.setCorsombreamento(corsombreamento);
        this.setCorlinha(corlinha);
    }

    @Override
    public void imprimir() {
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx(), this.getPosinicialy());
        Fjalp2.getTerminal().setCor(CorFundo.CYAN, CorFonte.PRETO);
        Fjalp2.getTerminal().escreva("                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 1, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("       Autor         ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 2, this.getPosinicialy());
        Fjalp2.getTerminal().escreva("                     ");
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 4, this.getPosinicialy());
        Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  Mateus Couto      ");

    }

}
