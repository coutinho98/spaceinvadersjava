public class Header extends Componente{

    public Header(int corsombreamento, int corlinha, int corfrontal, int posinicialx, int posinicialy) {
        this.setCorsombreamento(corsombreamento);
        this.setCorfrontal(corfrontal);
        this.setCorlinha(corlinha);
        this.setPosinicialx(posinicialx);
        this.setPosinicialy(posinicialy);
    }
    
    //Sobreescrita
    @Override
    public void imprimir(){
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx(), this.getPosinicialy());
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 1, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("   _____                        _____                     _               ");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 2, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("  / ____|                      |_   _|                   | |              ");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 3, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln(" |  (___  _ __   __ _  ___ ___   | |  _ ____   ____ _  __| | ___ _ __ ___ ");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 4, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("  \\___ \\| '_ \\ / _` |/ __/ _ \\   | | | '_ \\ \\ / / _` |/ _` |/ _ \\ '__/ __|");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 5, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("  ____) | |_) | (_| | (_|  __/  _| |_| | | \\ V / (_| | (_| |  __/ |  \\__ \\");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 6, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln(" |_____/| .__/ \\__,_|\\___\\___| |_____|_| |_|\\_/ \\__,_|\\__,_|\\___|_|  |___/");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 7, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("        | |                                                               ");
        Fjalp2.getTerminal().setCor(this.getCorlinha(), this.getCorsombreamento());
        Fjalp2.getTerminal().setPosicaoCursor(this.getPosinicialx() + 8, this.getPosinicialy());
        Fjalp2.getTerminal().escrevaln("        |_|                                                               ");
    }
   
    
}
