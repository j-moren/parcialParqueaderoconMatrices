import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Vehiculo[][]llenarMatriz(int dimension) {
        Vehiculo[][] m = new Vehiculo[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                
                Vehiculo o = new Vehiculo();
                System.out.println("Ingrese la Placa del Vehiculo para la celda [" + i + "][" + j + "]:");
                o.setPlaca(sc.next());
                System.out.println("Ingrese el Nombre del Propietario:");
                o.setNombre(sc.next());
                System.out.println("Ingrese el Cilindraje del Vehiculo:");
                o.setCilindraje(sc.nextInt());
                System.out.println("Ingrese el Modelo del vehiculo:");
                o.setModelo(sc.nextInt());
                System.out.println("Ingrese 1 si el vehículo está estacionado (ocupado) ó 0 si la celda está libre (disponible):");
                o.setDisponibilidad(sc.nextInt());
                m[i][j] = o; // Asignar el objeto Vehiculo a la celda
            }
        }
        return m;
    }
    public void mostrarCeldasDisponibles(Vehiculo[][] m) {
        System.out.println("\nCeldas Disponibles:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != null && m[i][j].getDisponibilidad() == 0) { // Si la celda está vacía (disponible)
                    System.out.println("Celda [" + i + "][" + j + "] está disponible.");
                }
            }
        }
    }
    public void mostrarCeldasOcupadas(Vehiculo[][] m) {
        System.out.println("\nCeldas Ocupadas:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != null && m[i][j].getDisponibilidad() == 1) { // Si la celda está ocupada
                    System.out.println("Celda [" + i + "][" + j + "] está ocupada por el siguiente vehículo:");
                    System.out.println("Placa: " + m[i][j].getPlaca());
                    System.out.println("Nombre Propietario: " + m[i][j].getNombre());
                    System.out.println("Cilindraje: " + m[i][j].getCilindraje());
                    System.out.println("Modelo: " + m[i][j].getModelo());
                    System.out.println("Disponibilidad: " + m[i][j].getDisponibilidad());
                    System.out.println();
                }
            }
        }
    }
    public double calcularCeldasOcupadas(Vehiculo[][] m) {
        double celdasOcupadas = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != null && m[i][j].getDisponibilidad() == 1) {  // Si la celda está ocupada
                    celdasOcupadas++;
                }
            }
        }
        return celdasOcupadas;
    }
}