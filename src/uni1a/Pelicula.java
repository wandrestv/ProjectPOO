/**
 * Class Pelicula
 */
package uni1a;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }
    
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
        
    
    @Override
    public void mostrarDetalles() {
    	Actor actor1 = new Actor("Zoë Saldaña", 47);
    	String nombre = actor1.getNombre();
    	int edad = actor1.getEdad();
    	
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Nombre del Actor: " + nombre);
        System.out.println("Edad del Actor: " + edad);
        System.out.println();
        
    }

	
}

