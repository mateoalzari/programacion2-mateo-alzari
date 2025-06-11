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

    }
}
