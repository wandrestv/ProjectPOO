/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
    	Investigador inv1 = new Investigador("Gil Grissom","Química",7);
    	String investigador = inv1.getNombre();
    	String espe = inv1.getEspecialidad();
    	int exp = inv1.getExp();
    	
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigador: " + investigador);
        System.out.println("Especialidad: " + espe);
        System.out.println("Años de Experiencia: " + exp);
        System.out.println();
    }
}