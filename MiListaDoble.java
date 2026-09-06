import java.util.Arrays;

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
        if (this.cabeza == null) {
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
        if (node == null || this.cabeza == null) {
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
    public boolean insert(Object objectRef, Object object) {
        if (this.cabeza == null) {
            return false;
        }
        DoubleNode actual = this.cabeza;
        while (actual != null) {
            if (actual.dato != null && actual.dato.equals(objectRef)) {
                DoubleNode newNode = new DoubleNode(object);
                newNode.anterior = actual;
                newNode.siguiente = actual.siguiente;

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


    // 11
    @Override
    public boolean insertHead(Object object) {
        DoubleNode nuevaCabeza = new DoubleNode(object);

        if (this.cabeza != null) {
            cabeza.anterior = nuevaCabeza;
            nuevaCabeza.siguiente = cabeza;
        }
        this.cabeza = nuevaCabeza;
        return true;
    }


    // 12
    @Override
    public boolean insertTail(Object object) {
        DoubleNode nuevaCola = new DoubleNode(object);

        if (this.cabeza != null) {
            DoubleNode actual = this.cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaCola;
            nuevaCola.anterior = actual;
            return true;
        } else {
            this.cabeza = nuevaCola;
            return true;
        }
    }


    // 13
    @Override
    public boolean set(DoubleNode node, Object object) {
        if (this.cabeza == null) {
            return false;
        }
        DoubleNode actual = this.cabeza;
        while (actual != null) {
            if (actual == node) {
                actual.dato = object;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }


    // 14
    @Override
    public boolean remove(DoubleNode node) {
        if (this.cabeza == null || node == null) {
            return false;
        }
        DoubleNode actual = this.cabeza;

        while (actual != null) {
            if (actual == node) {
                if (actual == this.cabeza) {
                    this.cabeza = actual.siguiente;

                    if (this.cabeza != null) {
                        this.cabeza.anterior = null;
                    }
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    if (actual.siguiente != null) {
                        actual.siguiente.anterior = actual.anterior;
                    }
                }
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }


    // 15
    @Override
    public boolean contains(Object object) {
        if (this.cabeza == null) {
            return false;
        }

        DoubleNode actual = this.cabeza;
        while (actual != null) {
            if (actual.dato != null && actual.dato.equals(object)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }


    // 16
    @Override
    public Object[] toArray() {
        if (this.cabeza == null) return new Object[0];
        DoubleNode iterador = this.cabeza;
        int contador = 1;
        while (iterador.siguiente != null) {
            iterador = iterador.siguiente;
            contador++;
        }

        Object[] arreglo = new Object[contador];
        int i = 0;
        iterador = this.cabeza;

        while (iterador != null) {
            arreglo[i] = iterador.dato;
            i++;
            iterador = iterador.siguiente;
        }
        return arreglo;
    }

    // 17
    @Override
    public Object[] toArray(Object[] object) {
        int contador = 0;
        DoubleNode iterador = this.cabeza;
        while (iterador != null) {
            contador++;
            iterador = iterador.siguiente;
        }

        Object[] destino = object;
        if (destino.length < contador) {
            destino = new Object[contador];
        }

        int i = 0;
        iterador = this.cabeza;
        while (iterador != null) {
            destino[i] = iterador.dato;
            i++;
            iterador = iterador.siguiente;
        }

        if (destino.length > contador) {
            destino[contador] = null;
        }
        return destino;
    }


    // 18
    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to) {
        MiListaDoble nuevaLista = new MiListaDoble();
        if (this.cabeza == null || from == null || to == null) {
            return nuevaLista;
        }

        DoubleNode actual = this.cabeza;
        while (actual != null && actual != from) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            return nuevaLista;
        }

        boolean finAlcanzado = false;

        while (actual != null) {
            nuevaLista.insertTail(actual.dato);
            if (actual == to) {
                finAlcanzado = true;
                break;
            }
            actual = actual.siguiente;
        }
        if (!finAlcanzado) {
            return new MiListaDoble();
        }
        return nuevaLista;
    }


    // 19
    @Override
    public MiListaDoble sortList() {
        Object[] arreglo = this.toArray();

        Arrays.sort(arreglo);
        DoubleNode actual = this.cabeza;
        int i = 0;
        while (actual != null) {
            actual.dato = arreglo[i];
            i++;
            actual = actual.siguiente;
        }
        return this;
    }
}
