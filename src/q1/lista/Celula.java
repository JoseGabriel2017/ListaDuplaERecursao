package q1.lista;

import q1.basicas.Contato;

public class Celula {
    private Contato contato;
    private Celula anterior;
    private Celula proxima;

    public Celula(Contato contato) {
        this.contato = contato;
        this.anterior = null;
        this.proxima = null;
    }

    public Contato getContato() {
        return contato;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
