/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    //private int temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        //this.temporadas = temporadas;
    }

    //public int getTemporadas() {
        //return temporadas;
    //}

    //public void setTemporadas(int temporadas) {
        //this.temporadas = temporadas;
    //}
    
    @Override
    public void mostrarDetalles() {
    	Temporada temp1 = new Temporada(1,25);
    	int temporada = temp1.getTemporada();
    	int episodios = temp1.getEpisodios();
    	
        System.out.println("Detalles de la SerieTV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        //System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Temporada: " + temporada);
        System.out.println("Cantidad de Episodios: " + episodios);        
        System.out.println();
        
    }
}