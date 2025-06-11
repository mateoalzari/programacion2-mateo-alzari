public class Main {
    public static void main(String[] args){
        Funciones Funciones = new Funciones();
        Funciones.mostrarSaludo();

        Funciones.saludar("Mateo");

        System.out.println("Área: " + Funciones.areaRectangulo(5, 10));

        System.out.println(Funciones.convertirMayusculas("hola mundo"));

        Funciones.mostrarMenu();

        Funciones.esPar(8);

        Funciones.cuadrado(41);

        Funciones.factorial(891);



    }
}
