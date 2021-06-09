import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class datosApp {
    private String email;
    private Contraseña contra;
    private String nivelSeguridad;
    private  String nombreApp;

    public datosApp(String email, String contrasena ,String nombreApp) {
        this.email = email;
        this.contra= new Contraseña(contrasena);
        this.nivelSeguridad = contra.checkContra();
        this.nombreApp = nombreApp;
    }



    public void setContra(String contrasena) {
        contra.setContraseña(contrasena);
    }


    public Contraseña getContra() {
        return contra;
    }


    public String getNombreApp() {
        return nombreApp;
    }


    @Override
    public String toString() {
        return  "\n"+
                "DATOS PARA LA APP " + nombreApp+"\n"+
                "Email: " + email + "\n"+
                "Contraseña: "+ ocultarContra(contra) +"\n"+
                "Seguridad de la contraseña: "+ nivelSeguridad+"\n"+
                "---------------------------------------------";
    }

    public String ocultarContra(Contraseña contra){
        int largo = contra.largoContra();
        char[] asterisc = new char[largo];
        Arrays.fill(asterisc, '*');
        return new String(asterisc);

    }
}
