package q1.lista;

import q1.basicas.Contato;

public class Lista {
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public Lista() {
        this.primeira = null;
        this.ultima = null;
        this.totalDeElementos = 0;
    }

    public void adicionar(Contato contato) {
        Celula nova = new Celula(contato);
        if (this.totalDeElementos == 0) {
            this.primeira = nova;
            this.ultima = nova;
        } else {
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
        }
        this.totalDeElementos++;
    }

    public void remover(String nome) {
        Celula atual = this.primeira;
        while (atual != null) {
            if (atual.getContato().getNome().equals(nome)) {
                removerCelula(atual);
                break;
            }
            atual = atual.getProxima();
        }
    }

    public void removerPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= totalDeElementos) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        Celula atual = this.primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        removerCelula(atual);
    }

    private void removerCelula(Celula celula) {
        if (celula == this.primeira && celula == this.ultima) {
            this.primeira = null;
            this.ultima = null;
        } else if (celula == this.primeira) {
            this.primeira = celula.getProxima();
            this.primeira.setAnterior(null);
        } else if (celula == this.ultima) {
            this.ultima = celula.getAnterior();
            this.ultima.setProxima(null);
        } else {
            Celula anterior = celula.getAnterior();
            Celula proxima = celula.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
        }
        this.totalDeElementos--;
    }

    public Contato pesquisarPorNome(String nome) {
        Celula atual = this.primeira;
        while (atual != null) {
            if (atual.getContato().getNome().equals(nome)) {
                return atual.getContato();
            }
            atual = atual.getProxima();
        }
        return null;
    }

    public void mostrar() {
        Celula atual = this.primeira;
        while (atual != null) {
            System.out.println(atual.getContato());
            atual = atual.getProxima();
        }
    }
}
