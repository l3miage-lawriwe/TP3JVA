package fr.uga.l3miage.tp3.exo1.component;

import fr.uga.l3miage.tp3.exo1.enums.GenreMusical;
import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import fr.uga.l3miage.tp3.exo1.models.ArtistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.repositories.AlbumRepository;
import fr.uga.l3miage.tp3.exo1.repositories.ArtistRepository;
import fr.uga.l3miage.tp3.exo1.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Duration;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class ArtistComponent {
    private final ArtistRepository artistRepository;

    public ArtistEntity getAlbum(String name){
        return artistRepository.findById(name).orElseThrow();
    }


    public ArtistEntity createAlbum(ArtistEntity artistEntity){
        return artistRepository.save(artistEntity);
    }

    public ArtistEntity updateBiography(String name, String biography){
        ArtistEntity artistEntity = artistRepository.findById(name).orElseThrow();
        artistEntity.setBiography(biography);
        return artistRepository.save(artistEntity);
    }

    public void deleteAlbum(String name) {
        artistRepository.deleteById(name);
    }

    public Integer getnumberartistfromgenre(GenreMusical genre){
        return artistRepository.countAllByGenreMusicalEquals(genre);
    }
}