
package dia_3_hospital_molinavalentina;

public class Dia_3_Hospital_MolinaValentina {

            public static void main(String[] args) {
                
                Persona per1=new Persona();
                per1.id="1";
                per1.nombre="valentina";
                per1.apellido="molina";
                per1.direccion="kennedy";
                System.out.println(per1);
                
                Paciente pac1=new Paciente();
                pac1.fechaIngreso="10-03-2021";
                pac1.fechaNacimiento="20-01-2004";
                pac1.diagnostico="gripe";
                System.out.println(pac1);
                
                Empleado emp1=new Empleado();
                emp1.titulo="doctor";
                emp1.fechaVinculacion="10-04-2024";
                emp1.salario=3000000;
                System.out.println(emp1);
                
                Hospital hos1=new Hospital();
                hos1.departamento="administrativo";
                hos1.pabellon="recuperacion";
                hos1.lider="lider grupo #1";
                System.out.println(hos1);

                
                
                
        }
    }