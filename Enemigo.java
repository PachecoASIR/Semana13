public class Enemigo extends Entidad{
    private int dificultad;

public Enemigo() {
}

public Enemigo(int vida, int ataque, int defensa, String nombre, int dificultad){
    //Usamos super para invocar al constructor de la clase superior
    super(vida, ataque, defensa, nombre);
    this.dificultad=dificultad;
}

public int turno(int accion) {
    int result = 0;
    switch (accion) {
        case 0:
            result = getAtaque()*dificultad;
            return result;

        case 1:
            result = getAtaque()/2;
            return result;

        default:
            return result;
        }
    }
}
