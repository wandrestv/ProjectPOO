package uni1a;

public class Podcast extends ContenidoAudiovisual{
	
	public Podcast(String titulo, int duracionEnMinutos, String genero) {
		super (titulo, duracionEnMinutos, genero);		
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println();
	}

	
}
