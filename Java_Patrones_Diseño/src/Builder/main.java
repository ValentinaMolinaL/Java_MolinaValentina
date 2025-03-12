package Builder;
//
//
//

public class main {

    static class Computadora {

        private String procesador;
        private int ram;
        private boolean targetaGrafica;

        //contructor privado
        private Computadora(Builder builder) {
            this.procesador = builder.procesador;
            this.ram = builder.ram;
            this.targetaGrafica = builder.targetaGrafica;
        }

        public void mostrarConfiguracion() {
            System.out.println("Computadora con: " + procesador + ", RAM:" + ram + "GB, Targeta grafica: " + targetaGrafica);
        }

        //clase
        public static class Builder {

            private String procesador;
            private int ram;
            private boolean targetaGrafica;

            public Builder setProcesador(String procesador) {
                this.procesador = procesador;
                return this;
            }

            public Builder setRam(int ram) {
                this.ram = ram;
                return this;
            }

            public Builder setTargetaGrafica(boolean targetaGrafica) {
                this.targetaGrafica = targetaGrafica;
                return this;
            }
            public Computadora build(){
                return new Computadora(this);
            }
        }
    }  
    //uso 

        public static void main(String[] args){
            Computadora pc =new Computadora.Builder()
                    .setProcesador("intel 17")
                    .setRam(16)
                    .setTargetaGrafica(true)
                    .build();
                    pc.mostrarConfiguracion();
        }
    
}
