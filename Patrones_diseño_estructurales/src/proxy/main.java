/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

//Proxy
//Controla el acceso a un objeto.

//Ej: Un proxy de imagen que carga bajo demanda.
public class main {
    interface Image {
        void display();
    }

    class RealImage implements Image {
        private String fileName;

        public RealImage(String fileName) {
            this.fileName = fileName;
            System.out.println("Cargando " + fileName);
        }

        public void display() {
            System.out.println("Mostrando " + fileName);
        }
    }

    class ProxyImage implements Image {
        private RealImage realImage;
        private String fileName;

        public ProxyImage(String fileName) {
            this.fileName = fileName;
        }

        public void display() {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }

}
