package Solid.ISP;

public class Bad {
    //interface segregation principle (ISP)-principio de segregacion 
    //de interface
    //las interfaces deben ser especificas y no forzar a una class a 
    //implementar metodos que no necesitan
    interface worker {
        void work();
        void aet();
    }
    abstract class Robot implements worker{
        public void work(){
            System.out.println("Trabajando0");
        }
        public void eat(){
            throw new UnsupportedOperationException("un robot no come");
        }
    }
    
}
// un robot no necesita un metodo para comer (eat())
//pero la interface lo obliga a implementarlo