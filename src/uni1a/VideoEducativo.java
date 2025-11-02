package uni1a;

public class VideoEducativo extends ContenidoAudiovisual{
		
	public VideoEducativo(String titulo, int duracionEnMinutos, String genero) {
		super (titulo, duracionEnMinutos, genero);		
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Video Educativo:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println();
	}

	
}
