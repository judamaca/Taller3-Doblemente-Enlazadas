void main() {
    System.out.println("====== INICIANDO PRUEBAS DE LISTA DOBLEMENTE ENLAZADA ======\n");

    // Asumiendo que la clase donde pusiste los métodos se llama MiListaDoble
    MiListaDoble lista = new MiListaDoble();

    // 1. isEmpty() y getSize() en lista vacía
    System.out.println("1. Pruebas iniciales:");
    System.out.println("   ¿Lista vacía? (isEmpty): " + lista.isEmpty());
    System.out.println("   Tamaño (getSize): " + lista.getSize());
    System.out.println("   getHead(): " + lista.getHead());
    System.out.println("   getTail(): " + lista.getTail());

    // 2. add(Object)
    System.out.println("\n2. Agregando elementos (10, 20, 30)...");
    lista.add(10);
    lista.add(20);
    lista.add(30);

    System.out.println("   ¿Lista vacía ahora?: " + lista.isEmpty());
    System.out.println("   Nuevo tamaño: " + lista.getSize());

    // 3. getHead() y getTail() con datos
    System.out.println("\n3. Comprobando extremos de la lista:");
    System.out.println("   getHead() [Debe ser 10]: " + lista.getHead());
    System.out.println("   getTail() [Debe ser 30]: " + lista.getTail());

    // 4. search(Object)
    System.out.println("\n4. Buscando el valor '20' con search():");
    // Ojo: tu firma dice que search retorna un DoubleNode
    DoubleNode nodoEncontrado = lista.search(20);

    if (nodoEncontrado != null) {
        System.out.println("   ¡Nodo encontrado! El dato en el nodo es: " + nodoEncontrado.dato);
    } else {
        System.out.println("   No se encontró el nodo.");
    }

    // 5. get(DoubleNode)
    System.out.println("\n5. Extrayendo el dato del nodo encontrado usando get():");
    Object datoExtraido = lista.get(nodoEncontrado);
    System.out.println("   get(nodoEncontrado) [Debe ser 20]: " + datoExtraido);

    lista.add(10);
    lista.add(20);
    lista.add(30);
    lista.insert(lista.cabeza.siguiente, 50);
    lista.insert(50, 55);
    lista.insertHead(01);
    lista.insertTail(999);
    lista.set(lista.cabeza.siguiente, 67);
    lista.remove(cabeza);



    System.out.println("   Lista actual: " + Arrays.toString(lista.toArray()));
    System.out.println("\n====== PRUEBAS FINALIZADAS ======");
}