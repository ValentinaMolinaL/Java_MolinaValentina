package Iterator;

// Iterator Pattern (Patrón Iterador)
//Este patrón proporciona una forma de acceder secuencialmente a los elementos de un
// objeto agregado (colección) sin exponer su representación interna.

import java.util.ArrayList;
import java.util.List;

//Ej: Iterador personalizado para una lista de nombres
public class main {
    // Interfaz del iterador
    interface Iterator<T> {
        boolean hasNext();
        T next();
    }

    // Colección e iterador concreto
    static class NameRepository {
        private List<String> names = new ArrayList<>();

        public void addName(String name) {
            names.add(name);
        }

        public Iterator<String> getIterator() {
            return new NameIterator();
        }

        private class NameIterator implements Iterator<String> {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < names.size();
            }

            @Override
            public String next() {
                if (this.hasNext()) {
                    return names.get(index++);
                }
                return null;
            }
        }
    }

    // Cliente
        public static void main(String[] args) {
            NameRepository repository = new NameRepository();
            repository.addName("Juan");
            repository.addName("María");
            repository.addName("Pedro");
            Iterator<String> iterator = repository.getIterator();
            while (iterator.hasNext()) {
                System.out.println("Nombre: " + iterator.next());
            }
        }
}