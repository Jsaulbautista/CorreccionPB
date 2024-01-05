public class Videojuego {
    public String nombre;
    public String tipo;
    public String clasificacion;
    public String apto_todo_publico;
    public Videojuego(String nombre, String tipo, String clasificacion, String apto_todo_publico){
        this.nombre = nombre;
        this.tipo = tipo;
        this.clasificacion = clasificacion;
        this.apto_todo_publico = apto_todo_publico;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }
    public String getApto_todo_publico(){
        return apto_todo_publico;
    }
    public void setApto_todo_publico(String apto_todo_publico){
        this.apto_todo_publico = apto_todo_publico;
    }

    public  void juego(){
        System.out.println("Los datos de los videojuegos son:\n");
    }
}
