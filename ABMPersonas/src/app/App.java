package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;


public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static List<Persona> Personas = new ArrayList<Persona>();
 

    public static void main(String[] args) {

        int opcionElegida, edad;
        String dni;
        String nombre;
        
        Personas = GetInitialPersons();
        do {

            System.out.println("=====================================");
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1-  Crear Persona");
            System.out.println("2-  Modificar Persona");
            System.out.println("3-  Eliminar Persona");
            System.out.println("4-  Listar Personas");
            System.out.println("0-  Salir");
            System.out.println("=====================================");


            System.out.print("Tu opcion: ");

            opcionElegida = Teclado.nextInt();
            Teclado.nextLine(); // Pasa por alto

            switch (opcionElegida) {
                //Creo la persona y la agreego a la lista
                case 1:
                    System.out.print("Ingrese el Nombre:");
                    nombre = Teclado.nextLine();
                    System.out.print("Ingrese el DNI:");
                    dni = Teclado.nextLine();

                    System.out.print("Ingrese la edad:");
                    edad = Teclado.nextInt();
                    Teclado.nextLine();//purga el buffer despues de leer el int

                    Persona person = new Persona(nombre, dni, edad);

                    Personas.add(person);
                    System.out.println("La persona " + person.getNombre() + " DNI " + person.getDni() + " fue creada con exito.");


                    System.out.print("Presione una tecla para continuar: ");
                    Teclado.nextLine();


                    break;
                case 2:

                    System.out.print("Ingrese el Nombre de la persona a Modificar:");
                    nombre = Teclado.nextLine();

                    Persona lookupPerson = null;

                    lookupPerson = Persona.BuscarPersona(nombre, Personas);
                    if (lookupPerson == null) {
                        System.out.println("No se pudo encontrar la persona, intente otra opcion");
                        break;
                    }

                    System.out.print("Ingrese el Nuevo Nombre(vacio para no modificar):");
                    nombre = Teclado.nextLine();

                    if (!nombre.equals("")) {
                        lookupPerson.setNombre(nombre);
                    }
                    System.out.print("Ingrese el Apellido(vacio para no modificar):");
                    dni = Teclado.nextLine();


                    if (!dni.equals("")) {
                        lookupPerson.setDni(dni);
                    }
                    System.out.print("Ingrese la edad(0 para no modificar):");
                    edad = Teclado.nextInt();
                    Teclado.nextLine(); //purga el buffer despues de leer el entero
                    if (edad != 0) {
                        lookupPerson.setEdad(edad);
                    }

                    System.out.println("Graias! Los datos fueron modificados!");


                    System.out.print("Presione una tecla para continuar: ");
                    Teclado.nextLine();

                    break;

                case 3:

                    System.out.print("Ingrese el Nombre de la persona a Eliminar:");
                    nombre = Teclado.nextLine();

                    Persona deletePerson = Persona.BuscarPersona(nombre, Personas);
                    
                    if (deletePerson == null) {
                        System.out.println("No se pudo encontrar la persona, intente otra opcion");
                        break;
                    }

                    Personas.remove(deletePerson);


                    System.out.println("La persona : " + deletePerson.getNombre()+ " " + deletePerson.getDni() + " se elimino del sistema ");


                    System.out.print("Presione una tecla para continuar: ");
                    Teclado.nextLine();

                    break;
                case 4:

                    System.out.println("Imprimiendo lista de personas");

                    for (Persona p : Personas) {
                        System.out.println("Nombre : " + p.getNombre() + " " + p.getDni() + " Edad: " + p.getEdad());
                    }

                    System.out.print("Presione una tecla para continuar: ");
                    Teclado.nextLine();

                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        while (opcionElegida != 0);


        System.out.println("Gracias!");
    }

    public static List<Persona> GetInitialPersons() {

        List<Persona> listP = new ArrayList<Persona>();

        Persona person1 = new Persona("Ana", "35333222", 32);

        listP.add(person1);

        Persona person2 = new Persona("Pedro", "40005522", 20);

        listP.add(person2);

        Persona person3 = new Persona("Teresa", "270254544", 25);

        listP.add(person3);

        return listP;

    }

}
