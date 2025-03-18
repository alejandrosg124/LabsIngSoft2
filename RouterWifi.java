public class RouterWifi {
    private static RouterWifi instancia;
    
    private String nombreRed;
    private String contrasena;

    //constructor privado, para solo una instancia
    private RouterWifi() {
        this.nombreRed = "Mi_Red_Wifi";
        this.contrasena = "12345678";
    }

    // metodo para obtener la instancia
    public static RouterWifi getInstance() {
        if (instancia == null) {
            instancia = new RouterWifi();
        }
        return instancia;
    }

    // simula la conexión de un dispositivo al router
    public void conectarDispositivo(String dispositivo) {
        System.out.println(dispositivo + " se ha conectado satisfactoriamente a " + nombreRed + " con la contraseña " + contrasena);
    }
}

