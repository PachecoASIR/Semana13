public class Entidad {
    private int vida;
    private int ataque;
    private int defensa;
    private String nombre;

    public Entidad() {
    }

    public Entidad(int vida, int ataque, int defensa, String nombre) {
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
        this.defensa=defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida() {
        this.vida=vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque() {
        this.ataque=ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa() {
        this.defensa=defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre=nombre;
    }

    public int turno (int accion) {
        int result=0;
        return result;
    }

    public void info() {
    }
}