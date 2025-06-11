public class Funciones {
    public static void mostrarSaludo() {
        System.out.println("Hola,mundo");
    }
    public static void saludar (String nombre) {
        System.out.println("Hola, "+ nombre);
    }
    public static double areaRectangulo(double base, double altura){
        return base * altura;
    }
    public static String convertirMayusculas(String texto){
        return texto.toUpperCase();
    }
    public static void mostrarMenu(){
        System.out.println("Menú de opciones");
        System.out.println("1 Ver imágenes");
        System.out.println("2 Subir imágenes");
        System.out.println("3 Salir");
    }
}