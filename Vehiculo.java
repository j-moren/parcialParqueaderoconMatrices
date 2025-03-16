public class Vehiculo {
    private String placa;
    private String nombre;
    private int cilindraje;
    private int modelo;
    private int disponibilidad; // 0 para disponible, 1 para ocupado

    // Métodos getters y setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método para calcular la disponibilidad
    public int calcularDisponibilidadTotal() {
        return this.disponibilidad;
    }
}
