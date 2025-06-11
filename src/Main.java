public class Main {
    public static void main(String[] args){
        Funciones Funciones = new Funciones();
        Funciones.mostrarSaludo();

        Funciones.saludar("Mateo");

        System.out.println("Área: " + Funciones.areaRectangulo(5, 10));

        System.out.println(Funciones.convertirMayusculas("hola mundo"));

        Funciones.mostrarMenu();

        System.out.println("¿Es par?: " + Funciones.esPar(8));


        System.out.println("Cuadrado: " + Funciones.cuadrado(4));

        System.out.println("Factorial: " + Funciones.factorial(5));

        System.out.println("Suma: " + Funciones.sumaNumeros(new int[]{1, 2, 3, 4, 5}));

        double[] notas = {7.5, 8.0, 6.0, 10.0};
        System.out.println("Promedio: " + Funciones.promedio(notas));

        int[] numeros = {3, 8, 2, 5, 9};
        System.out.println("¿Está El número 5?" + Funciones.buscarValor(numeros, 5));

        String[] palabras = {"hola", "adios", "profe", "hola", "queso", "hola"};
        System.out.println("Ocurrencias de hola: " + Funciones.contarOcurrencias(palabras, "hola"));


        System.out.println("Array original: " );
        Funciones.imprimirArray(numeros);

        int[] invertido = Funciones.invertirArray(numeros);
        System.out.println("Array invertido: ");
        Funciones.imprimirArray(invertido);

        String[] nombres = {"Luis", "Agustina", "Mateo", "Salchicha"};
        double[] notas = {7.5, 8.1, 9.2, 9.0}
        String mejor = Funciones.mejorEstudiante(nombres, notas);
        System.out.println("El mejor estudiante es: " + mejor);
    }
}
