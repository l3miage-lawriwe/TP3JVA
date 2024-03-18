package fr.uga.l3miage.tp3.exo1.component;

import fr.uga.l3miage.tp3.exo1.enums.GenreMusical;
import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.repositories.PlaylistRepository;
import fr.uga.l3miage.tp3.exo1.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class PlaylistComponent {
    private final PlaylistRepository playlistRepository;



    public PlaylistEntity getPlaylist(String title){
        return playlistRepository.findById(title).orElseThrow();
    }


    public PlaylistEntity createPlaylist(PlaylistEntity albumEntity){
        return playlistRepository.save(albumEntity);
    }

    public PlaylistEntity updateDescription(String name, String newDescription){
        PlaylistEntity playlistEntity = playlistRepository.findById(name).orElseThrow();
        playlistEntity.setDescription(newDescription);
        return playlistRepository.save(playlistEntity);
    }

    public void deletePlaylist(String title) {
        playlistRepository.deleteById(title);
    }

    public Set<PlaylistEntity> getplayliststhatcontainsmusic(SongEntity song){
        return playlistRepository.findAllBySongEntitiesIsIn(song);
    }
}