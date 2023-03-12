public class Jugador extends Entidad{
    private int experiencia;
    private int nivel;

public Jugador() {
}

public Jugador(int vida, int ataque, int defensa, String nombre, int experiencia, int nivel) {
    super(vida, ataque, defensa, nombre);
    this.experiencia=experiencia;
    this.nivel=nivel;
}

public int turno(int accion) {
    int result = 0;
    switch (accion) {
        case 0:
            result = getAtaque()*nivel;
            return result;

        case 1:
            result = getDefensa()*nivel;
            return result;

        //Si no coincide con ninguna de las anteriores devolvemos el valor sin modificaciones

        default:
            return result;
        }
    }
}