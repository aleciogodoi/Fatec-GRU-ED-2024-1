public class Arvore {
    NoArvore raiz;

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(int valor) {
        NoArvore novo = new NoArvore(valor);
        if (isEmpty()) {
            raiz = novo;
        } else {
            NoArvore auxiliar = raiz, ultimo = raiz;
            while (auxiliar != null) {
                ultimo = auxiliar;
                if (valor > auxiliar.dado)
                    auxiliar = auxiliar.direita;
                else 
                    auxiliar = auxiliar.esquerda;
            }
            if (valor > ultimo.dado) 
                ultimo.direita = novo;
            else 
                ultimo.esquerda = novo;
        }
    }

    public NoArvore father(NoArvore raiz, int valor) {
        NoArvore pai = null;
        if (!isEmpty()) {
            if (raiz.dado == valor) {
                pai = raiz;
            } else {
                NoArvore auxiliar = raiz;
                pai = raiz;
                while (auxiliar != null) {
                    if ( (auxiliar.esquerda != null && auxiliar.esquerda.dado == valor) ||
                         (auxiliar.direita != null && auxiliar.direita.dado == valor)){
                        pai = auxiliar;
                        break;
                    }
                    else if (valor > auxiliar.dado) 
                        auxiliar = auxiliar.direita;
                    else 
                        auxiliar = auxiliar.esquerda;
                }
            }
        }
        return pai;
    }

    public NoArvore find(NoArvore raiz, int valor) {
        NoArvore auxiliar = raiz;
        while (auxiliar != null) {
            if (auxiliar.dado == valor) 
                break;
            else if (valor > auxiliar.dado)
                auxiliar = auxiliar.direita;
            else 
                auxiliar = auxiliar.esquerda;
        }
        return auxiliar;
    }

    public NoArvore findR(NoArvore raiz, int valor) {
        if (raiz != null)
            if (valor > raiz.dado)
                return findR(raiz.direita, valor);
            else if (valor < raiz.dado)
                return findR(raiz.esquerda, valor);
        return raiz;
    }


    public void showLevels() {
        if (isEmpty()) {
            System.out.println("A árvore está vazia.");
            return;
        }
        
        Fila fila = new Fila();
        fila.enqueue(raiz);
        NoArvore atual = raiz;
        int tamanhoFila, itensFila=1;
        while (!fila.isEmpty()) {
            tamanhoFila = itensFila;
            itensFila=0;
            for (int i = 0; i < tamanhoFila; i++) {
                atual = fila.dequeue().dado;
                System.out.print(atual.dado + " ");

                if (atual.esquerda != null) {
                    fila.enqueue(atual.esquerda);
                    itensFila++;
                }
                if (atual.direita != null) {
                    fila.enqueue(atual.direita);
                    itensFila++;
                }
            }
            System.out.println();
        }
    }
 
}
