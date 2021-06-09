import java.util.ArrayList;
import java.util.Scanner;


public class gestorContraseña {
    private ArrayList <datosApp> datos;

    public gestorContraseña() {

        this.datos = new ArrayList<>();
    }
    public void inicializar(){
        boolean seguir = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al gestor de contraseña");
        out:
        do {
            mostrarDatos();
            menu();
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    crearContra();
                    break;
                case 2:
                    leerContra();
                    break;
                case 3:
                    actualizarContra();
                    break;
                case 4:
                    eliminarContra();
                    break;
                case 5:
                    System.out.println("Adios");
                    break out;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;

            }


        }while (seguir);
    }


    public void menu(){
        System.out.println("seleccione una opcion del menu");
        System.out.println("1. crear contraseña");
        System.out.println("2. leer contraseña");
        System.out.println("3. actualizar contraseña");
        System.out.println("4. eliminar contraseña");
        System.out.println("5. salir");

    }

    public void mostrarDatos(){
        int i = 1;
        for (datosApp dato:datos){
            System.out.println(String.valueOf(i)+dato);
            i++;


        }



    }


    public void leerContra(){
        System.out.println("Elija la contraseña que quiere ver por medio de numero de indice");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt()-1;
        datosApp dato = datos.get(opcion);
        System.out.println("La contraseña para la aplicacion "+dato.getNombreApp()+" es " + dato.getContra());
    }

    public void crearContra(){
        System.out.println("ingrese la contraseña a crear: ");
        Scanner teclado = new Scanner(System.in);
        String contraseña = teclado.next();
        System.out.println("Ingrese el correo: ");
        String correo = teclado.next();
        System.out.println("Ingrese el nombre del servicio donde se usaran los datos");
        String app = teclado.next();
        datosApp datoAagregar = new datosApp(correo,contraseña,app );
        datos.add(datoAagregar);
    }

    public void actualizarContra(){
        System.out.println("Ingrese la contraseña a actualizar por medio de numero de indice");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt()-1;
        System.out.println("Ingrese la nueva contraseña");
        String nuevaContra = teclado.next();
        datosApp dato = datos.get(opcion);
        datos.remove(opcion);
        dato.setContra(nuevaContra);
        datos.add(opcion,dato);

    }
    public void eliminarContra(){
        System.out.println("Ingrese la contraseña a eliminar por medio del numero de indice");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt()-1;
        datos.remove(opcion);
        System.out.println("Eliminacion de datos finalizada");
    }

    @Override
    public String toString() {
        return String.valueOf(datos);
    }

}
