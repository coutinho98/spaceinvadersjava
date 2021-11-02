
public class TelaInicial extends Componente implements Tela {

    @Override
    public void imprimir() {
        int width = Fjalp2.getTerminal().getJlineTerminal().getTerminalWidth();
        int height = Fjalp2.getTerminal().getJlineTerminal().getTerminalHeight();

        new Header(CorFundo.PRETO, CorFonte.VERDE, CorFonte.BRANCO, 4, 25).imprimir();

        if (getComponentselect() == 0) {
            new Botao(CorFonte.PRETO, CorFundo.VERDE, 12, 50, "Play").imprimir();
        } else {
            new Botao(CorFonte.VERDE, CorFundo.PRETO, 12, 50, "Play").imprimir();
        }

        if (getComponentselect() == 1) {
            new Botao(CorFonte.PRETO, CorFundo.VERDE, 16, 50, "Sobre").imprimir();
        } else {
            new Botao(CorFonte.VERDE, CorFundo.PRETO, 16, 50, "Sobre").imprimir();
        }

        /* if (getComponentselect() == 2) {
            new Botao(CorFonte.PRETO, CorFundo.AMARELO, 20, 50, "Help").imprimir();
        } else {
            new Botao(CorFonte.AMARELO, CorFundo.PRETO, 20, 50, "Help").imprimir();
        }

        if (getComponentselect() == 3) {
            new Botao(CorFonte.PRETO, CorFundo.AMARELO, 24, 50, "Quit").imprimir();
        } else {
            new Botao(CorFonte.AMARELO, CorFundo.PRETO, 24, 50, "Quit").imprimir();
        }
         */
        Fjalp2.getTerminal().setPosicaoCursor(height - 1, 0);
        Fjalp2.getTerminal().setCor(CorFundo.PRETO, CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("Navegue entre as opcoes com as setas e selecione com enter!");

        int tecla = Fjalp2.getTerminal().leiaTecla();

        if (getComponentselect() == 0 && tecla == 14) {
            setComponentselect(1);
        }
        if (getComponentselect() == 1 && tecla == 16) {
            setComponentselect(0);
        }

        getComponentselect();
        if (tecla == 13) {
            Fjalp2.getTerminal().limparTela();

            if (getComponentselect() == 0) {
                System.out.println("Comecar");
            }

            if (getComponentselect() == 1) {
                new TelaSobre().imprimir();
            }

        } else {
            Fjalp2.getTerminal().limparTela();
            this.imprimir();
        }

    }

    @Override
    public void imprimircabecalho() {
        new Cabecalho().imprimir();
    }

    @Override
    public void resetCursorPosition() {

    }

}
