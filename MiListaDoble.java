public class MiListaDoble {

    @Override
    public boolean isEmpty() {
        return this.cabeza == null;
    }

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

    @Override
    public Object getHead() {
        if (this.cabeza == null) {
            return null;
        }
        return this.cabeza.dato;
    }

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

    @Override
    public Object get(DoubleNode node) {
        if (node == null) {
            return null;
        }
        return node.dato;
    }

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


    @Override
    public boolean insert(DoubleNode node, Object object);


    @Override
    public boolean insert(Object objectRef, Object object);


    @Override
    public boolean insertHead(Object object);


    @Override
    public boolean insertTail(Object object);


    @Override
    public boolean set(DoubleNode node, Object object);


    @Override
    public boolean remove(DoubleNode node);


    @Override
    public boolean contains(Object object);


    @Override
    public Object[] toArray();


    @Override
    public Object[] toArray(Object[] object);


    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to);


    @Override
    public MiListaDoble sortList();



}
