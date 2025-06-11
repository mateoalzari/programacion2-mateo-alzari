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
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
    public static int cuadrado (int numero){
        return numero * numero;
    }
    public static long factorial (int n){
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
    public static int sumaNumeros(int[] numeros){
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }
    public static double promedio(double[] numeros) {
        if (numeros.length == 0) return 0;
        double suma = 0;
        for (double n : numeros) {
            suma += n;
        }
        return suma / numeros.length;
    }
    public static boolean buscarValor(int[] array, int valor){
        for (int n : array) {
            if (n == valor) return true;
        }
        return false;
    }
    public static int contarOcurrencias(String[] array, String clave) {
        int contador = 0;
        for (String s : array) {
            if (s.equals(clave)) contador++;
        }
        return contador;
    }
    public static void imprimirArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i<array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }
    public static String mejorEstudiante(String[] nombres, double[] notas){
        if (nombres.length == 0 || nombres.length != notas.length) return null;
        String mejor = nombres[0];
        double notaAlta = notas [0];
        for (int i = 1; i < notas.length; i++){
            if (notas[i] > notaAlta){
                notaAlta = notas[i];
                mejor = nombres[i];
            }
        }
        return mejor;
    }
}