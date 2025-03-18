public class Connect {
    public static void main(String[] args) {
        // obtiene la única instancia del Router
        RouterWifi router = RouterWifi.getInstancia();

        System.out.println("\n Conectando \n");
        // simular la conexión de dispositivos al router
        router.conectarDispositivo("PC");
        router.conectarDispositivo("iPad");
    }
}
