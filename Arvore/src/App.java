public class App {
    public static void main(String[] args) throws Exception {
        Arvore a01 = new Arvore();
        a01.add(10);
        a01.add(15);
        a01.add(8);
        a01.add(9);
        a01.add(22);
        a01.add(7);
        a01.add(3);
        a01.add(1);
        a01.add(4);
        a01.add(50);
        a01.add(30);
        a01.add(15);
        a01.add(100);
        a01.showLevels();
        /* 
        NoArvore pai = a01.father(a01.raiz, 10);
        System.out.println(pai.dado);
        pai = a01.father(a01.raiz, 9);
        System.out.println(pai.dado);
        pai = a01.father(a01.raiz, 8);
        System.out.println(pai.dado);
        pai = a01.father(a01.raiz, 9);
        System.out.println(pai.dado);

        NoArvore auxiliar = a01.find(a01.raiz, 10);
        if (auxiliar != null) 
            System.out.println("Achou - "+auxiliar.dado);
        else
            System.out.println("Não Achou");     
            
        auxiliar = a01.findR(a01.raiz, 10);
        if (auxiliar != null) 
            System.out.println("Achou - "+auxiliar.dado);
        else
            System.out.println("Não Achou");    
         
        Fila f1 = new Fila();
        f1.enqueue(10);
        f1.enqueue(20);
        f1.enqueue(30);
        f1.enqueue(40);
        f1.print();
        f1.dequeue();
        f1.print();
        f1.dequeue();
        f1.print();
        f1.dequeue();
        f1.print();
        f1.dequeue();
        f1.print(); */

    }
}
