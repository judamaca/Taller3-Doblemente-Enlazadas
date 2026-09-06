void main() {
    MiListaDoble lista = new MiListaDoble();

    System.out.println("1. isEmpty inicial: " + lista.isEmpty());

    // --- POBLAR LA LISTA (add, insertHead, insertTail) ---
    lista.add("C");                 // [C]
    lista.insertHead("A");          // [A, C]
    lista.insertTail("F");          // [A, C, F]

    // --- INSERCIONES EN MEDIO ---
    DoubleNode nodoC = lista.search("C"); // 7. search
    lista.insert(nodoC, "D");             // 9. insert por Nodo -> [A, C, D, F]
    lista.insert("D", "E");               // 10. insert por Valor -> [A, C, D, E, F]
    lista.insertHead("B");                // [B, A, C, D, E, F]

    System.out.println("\nLista poblada: " + Arrays.toString(lista.toArray()));

    // --- CONSULTAS ---
    System.out.println("2. getSize: " + lista.getSize());
    System.out.println("4. getHead: " + lista.getHead());
    System.out.println("5. getTail: " + lista.getTail());
    System.out.println("6. get(nodoC): " + lista.get(nodoC));
    System.out.println("15. contains('E'): " + lista.contains("E"));
    System.out.println("15. contains('Z'): " + lista.contains("Z"));

    // --- MODIFICACIONES (set y remove) ---
    lista.set(nodoC, "X"); // 13. set (Cambiamos 'C' por 'X')
    System.out.println("\n13. Después de set ('C' -> 'X'): " + Arrays.toString(lista.toArray()));

    lista.remove(lista.search("X")); // 14. remove
    System.out.println("14. Después de remove('X'): " + Arrays.toString(lista.toArray()));

    // --- SUBLIST Y ORDENAMIENTO ---
    DoubleNode from = lista.search("D");
    DoubleNode to = lista.search("F");
    MiListaDoble sub = lista.subList(from, to); // 18. subList
    System.out.println("\n18. subList ('D' a 'F'): " + Arrays.toString(sub.toArray()));

    lista.sortList(); // 19. sortList (Ordena alfabéticamente)
    System.out.println("19. Después de sortList: " + Arrays.toString(lista.toArray()));

    // --- ARREGLOS Y LIMPIEZA ---
    Object[] destino = new Object[10];
    Object[] resultado = lista.toArray(destino); // 17. toArray con parámetro
    System.out.println("\n17. toArray(Object[]): " + Arrays.toString(resultado));

    lista.clear(); // 3. clear
    System.out.println("3. isEmpty final (tras clear): " + lista.isEmpty());
}
