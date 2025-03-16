public class Punto1 {
    public void P1(int d) {
        Metodos m = new Metodos();
        Vehiculo[][] M = new Vehiculo[d][d];
        M = m.llenarMatriz(d);
        System.out.println("Celdas Disponibles: ");
        m.mostrarCeldasDisponibles(M);
        System.out.println("Celdas Ocupadas: ");
        m.mostrarCeldasOcupadas(M);
        double calcularDisponibilidadTotal = m.calcularCeldasOcupadas(M);
        System.out.println("Numero de Celdas Ocupadas: " + calcularDisponibilidadTotal);
    }
}
