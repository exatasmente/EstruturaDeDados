package Binaria;

public class Arvore {

    Node raiz;

    public Arvore(Node elemento) {
        raiz = elemento;
    }

    public Arvore() {
        raiz = null;
    }

    public void removerChave(int chave) {
        raiz = _removerChave(raiz, chave);
    }

    private Node _removerChave(Node raiz, int chave) {
        if (raiz == null) {
            return raiz;
        }

        if (chave < raiz.getValor()) {
            raiz.setEsquerda(_removerChave(raiz.getEsquerda(), chave));
        } else if (chave > raiz.getValor()) {
            raiz.setDireita(_removerChave(raiz.getDireita(), chave));
        } else {
            if (raiz.getEsquerda() == null) {
                return raiz.getDireita();
            } else if (raiz.getDireita() == null) {
                return raiz.getEsquerda();
            }

            raiz.setValor(min(raiz.getDireita()));

            raiz.setDireita(_removerChave(raiz.getDireita(), chave));
        }

        return raiz;
    }

    private int min(Node raiz) {
        int min = raiz.getValor();
        while (raiz.getEsquerda() != null) {
            min = raiz.getEsquerda().getValor();
            raiz = raiz.getEsquerda();
        }
        return min;
    }

    public void inserir(int chave) {
        this.raiz = _inserir(this.raiz, chave);
    }

    private Node _inserir(Node raiz, int chave) {

        if (raiz == null) {
            raiz = new Node(chave);
            return raiz;
        }

        if (chave < raiz.getValor()) {
            raiz.setEsquerda(_inserir(raiz.getEsquerda(), chave));
        } else if (chave > raiz.getValor()) {
            raiz.setDireita(_inserir(raiz.getDireita(), chave));
        }

        return raiz;
    }

    public void percorrer() {
        _percorrer(this.raiz);
    }

    // A utility function to do inorder traversal of BST
    private void _percorrer(Node raiz) {
        if (raiz != null) {
            _percorrer(raiz.getEsquerda());
            System.out.print(raiz.getValor() + " ");
            _percorrer(raiz.getDireita());
        }
    }

    public boolean busca(int valor) {

        if (this.raiz == null) {
            return false;
        } else {
            return this.raiz.busca(valor);
        }

    }

}
