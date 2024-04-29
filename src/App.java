import com.edu.defioiphone.model.music.Artista;
import com.edu.defioiphone.model.music.IntefaceMP3;

public class App {
    public static void main(String[] args) throws Exception {

        IntefaceMP3 mp3 = new IntefaceMP3();

        Artista criolo = new Artista("Criolo");
        Artista MarceloD2 = new Artista("Marcelo D2");

        mp3.addAlbum(criolo, "Nó na Orelha");
        mp3.addSingle(criolo, "Orgulho Loco");


        mp3.addArtista(criolo);
        mp3.addArtista(MarceloD2);

        System.out.println(mp3.listarArtistas());















    }
}
