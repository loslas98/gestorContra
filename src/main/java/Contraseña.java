public class Contraseña {
    private String contraseña;

    public Contraseña(String contraseña) {

        this.contraseña = contraseña;
    }
    public String checkContra(){
        if(checkLetras() && checkMayus() && checkLargo() && checkNumeros()){
            return "contraseña segura";
        }else if((checkNumeros() && checkLetras()) || (checkNumeros() && checkMayus()) || (checkLetras() && checkMayus())){
            return "contraseña moderada";
        }else{
            return "contraseña insegura";
        }



    }
    public boolean checkNumeros(){
        String numRegex   = ".*[0-9].*";
        if (contraseña.matches(numRegex)){
            return true;
        }
        return false;

    }
    public boolean checkLetras(){
        String alphaRegex = ".*[a-z].*";
        if (contraseña.matches(alphaRegex)){
            return true;
        }
        return false;


    }
    public boolean checkLargo(){
        if (contraseña.length() < 8){
            return false;
        }
        return true;
    }
    public boolean checkMayus(){
        String mayusRegex = ".*[A-Z].*";
        if(contraseña.matches(mayusRegex)){
            return true;
        }
        return false;

    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }
    public int largoContra(){
        return contraseña.length();
    }

    @Override
    public String toString() {
        return contraseña;
    }
}
