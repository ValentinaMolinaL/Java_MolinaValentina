package dia_3_hospital_molinavalentina;

public class Paciente{
    
    String fechaIngreso;
    String fechaNacimiento;
    String diagnostico;

    public Paciente() {
    }

    public Paciente(String fechaIngreso, String fechaNacimiento, String diagnostico) {
        this.fechaIngreso = fechaIngreso;
        this.fechaNacimiento = fechaNacimiento;
        this.diagnostico = diagnostico;
    }

    
    public void metodoPac1(){}
    public void metodoPac2(){}
    public void metodoPac3(){}
    public void metodoPac4(){}
    public void metodoPac5(){}
    public void metodoPac6(){}
    public void metodoPac7(){}
    public void metodoPac8(){}

    @Override
    public String toString() {
        return "Paciente{" + "fechaIngreso=" + fechaIngreso + ", fechaNacimiento=" + fechaNacimiento + ", diagnostico=" + diagnostico + '}';
    }

    
}