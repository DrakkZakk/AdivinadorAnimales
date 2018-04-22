package adivinavisual;

import java.io.Serializable;

/**
 *
 * @author Drakkar
 */
public class ArbolB<T> implements Serializable {

    private static final long serialVersionUID = 1;
    int altura;

    static class Nodo<T> implements Serializable {

        int cant;
        T info;
        Nodo<T> izq, der, raiz;
        Nodo<T> nuevo;

        public Nodo() {

        }

        public Nodo(T palabra) {
            info = palabra;
            izq = null;
            der = null;
        }

        public boolean validaEmpty(Nodo<T> nodo) {
            if (nodo.izq != null || nodo.der != null) {
                return true;
            }
            return false;
        }
        
        // Calcula la altura del arbol.
        public int altura(Nodo<T> ab) {
            if (ab == null) {
                return -1;
            } else {
                cant = 0;
            }
            return (1 + Math.max(altura(ab.izq), altura(ab.der)));
        }

        // Calcula la cantida de nodos del arbol.
        public int cantidad(Nodo<T> reco) {
            if (reco != null) {
                cant++;
                cantidad(reco.izq);
                cantidad(reco.der);
                return cant;
            }
            //cant = 0;
            return -1;
        }
    }

    /*public <T extends Comparable<T>> void insertar (T info){
        Nodo nuevo;
        nuevo = new Nodo<>();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;

        if (raiz == null)
            raiz = (Nodo) nuevo;
        else{
            Nodo<T> anterior = null;
            Nodo<T> reco;  //reco se utiliza en toso el programa para recorrer el arbol
            reco = (Nodo) raiz;

            while (reco != null){     // hasta encontrar un lugar vacio, respetando el orden
                anterior = reco;
                if (info.compareTo(reco.info) < 0)
                    reco = reco.izq;
                else
                    reco = reco.der;
            }
            if (info.compareTo(anterior.info) < 0)     // de acuerdo a si es mayor o menor se coloca a la izq o der
                anterior.izq = nuevo;
            else
                anterior.der = nuevo;
        }
    }


    private void preOrder (Nodo<T> reco){
        if (reco != null){
            System.out.print(reco.info + " ");
        preOrder (reco.izq);
        preOrder (reco.der);
        }
    }

    public void preOrder (){
        preOrder (raiz);
        System.out.println();
    }

    private void inOrder (Nodo<T> reco){
        if (reco != null){
            inOrder (reco.izq);
        System.out.print(reco.info + " ");
        inOrder (reco.der);
        }
    }

    public void inOrder (){
        inOrder (raiz);
        System.out.println();
    }


    private void postOrder (Nodo<T> reco){
        if (reco != null){
            postOrder (reco.izq);
        postOrder (reco.der);
        System.out.print(reco.info + " ");
        }
    }

    public void postOrder (){
        postOrder (raiz);
        System.out.println();
    }*/
}
