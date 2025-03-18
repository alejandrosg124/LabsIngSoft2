public class RouterWifi {
    private static RouterWifi instancia;
    
    private String nombreRed;
    private String contrasena;

    //constructor privado, para solo una instancia, dos atributos
    private RouterWifi() {
        this.nombreRed = "WIFIUAO"; 
        this.contrasena = "12345678";
    }

    // metodo para obtener la instancia
    public static RouterWifi getInstancia() {
        if (instancia == null) { // verifica si ya la instancia existe, sino la crea
            instancia = new RouterWifi();
        }
        return instancia;
    }

    // simula la conexión de un dispositivo al router
    public void conectarDispositivo(String dispositivo) {
        System.out.println(dispositivo + " se ha conectado satisfactoriamente a " + nombreRed + " con la contraseña " + contrasena);
    }
}

