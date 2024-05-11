public class Fila {
    NoFila inicio;
    
    public void enqueue(NoArvore d) {
        NoFila aux = inicio;
        NoFila novo = new NoFila(d);
        if (isEmpty()) {
            novo.proximo = inicio;
            inicio = novo;
        } else  {
            while (aux.proximo != null ) { // loop para o fim da lista
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public NoFila dequeue() {
        NoFila aux = inicio;
        if (!isEmpty()) {
            inicio = inicio.proximo;
        }
        return aux;
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }

    public void print() {
        NoFila aux = inicio;
        while (aux != null ) {
            System.out.print(aux.dado+" ");
            aux = aux.proximo;
        }
        System.out.println();
    }

}
