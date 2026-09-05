public class MiListaDoble implements ListInterface {
    DoubleNode cabeza;


    // 1
    @Override
    public boolean isEmpty() {
        return this.cabeza == null;
    }

    // 2
    @Override
    public int getSize() {
        DoubleNode iterador = this.cabeza;
        int contador = 0; // Iniciamos en 0 por si la lista está vacía
        while (iterador != null) { // Evaluamos el nodo actual
            contador++;
            iterador = iterador.siguiente;
        }
        return contador;
    }

    // 3
    public void clear() {
        this.cabeza = null;
        return;
    }

    // 4
    @Override
    public Object getHead() {
        if (this.cabeza == null) {
            return null;
        }
        return this.cabeza.dato;
    }

    // 5
    @Override
    public Object getTail() {
        if(this.cabeza == null) {
            return null;
        }
        DoubleNode iterador = this.cabeza;
        while (iterador.siguiente != null) {
            iterador = iterador.siguiente;
        }
        return iterador.dato;
    }

    // 6
    @Override
    public Object get(DoubleNode node) {
        if (node == null) {
            return null;
        }
        return node.dato;
    }

    // 7
    @Override
    public DoubleNode search(Object object) {
        DoubleNode actual = this.cabeza;
        while (actual != null) {
            if (actual.dato != null && actual.dato.equals(object)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // 8
    @Override
    public boolean add(Object object) {
        DoubleNode newNode = new DoubleNode(object);
        if (this.cabeza == null) {
            this.cabeza = newNode;
            return true;
        }
        DoubleNode actual = this.cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = newNode;
        newNode.anterior = actual;
        return true;
    }


    // 9
    @Override
    public boolean insert(DoubleNode node, Object object) {
        if (this.cabeza == null) {
            return false;
        }

        DoubleNode actual = this.cabeza;
        DoubleNode newNode = new DoubleNode(object);

        while (actual != null) {
            if (actual == node) {
                newNode.siguiente = actual.siguiente;
                newNode.anterior = actual;

                if (actual.siguiente != null) {
                    newNode.siguiente.anterior = newNode;
                }
                actual.siguiente = newNode;
                return true;
            }
        actual = actual.siguiente;
        }
    return false;
    }


    // 10
    @Override
    public boolean insert(Object objectRef, Object object) {return false;}


    // 11
    @Override
    public boolean insertHead(Object object) {return false;}


    // 12
    @Override
    public boolean insertTail(Object object) {return false;}


    // 13
    @Override
    public boolean set(DoubleNode node, Object object) {return false;}


    // 14
    @Override
    public boolean remove(DoubleNode node) {return false;}


    // 15
    @Override
    public boolean contains(Object object) {return false;}


    // 16
    @Override
    public Object[] toArray() {return null;}

    // 17
    @Override
    public Object[] toArray(Object[] object) {return object;}


    // 18
    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to) {return null;}


    // 19
    @Override
    public MiListaDoble sortList() {return null;}



}
