package fr.uga.l3miage.tp3.exo1.component;

import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import fr.uga.l3miage.tp3.exo1.models.UserEntity;
import fr.uga.l3miage.tp3.exo1.repositories.AlbumRepository;
import fr.uga.l3miage.tp3.exo1.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class AlbumComponent {
    private final AlbumRepository albumRepository;
    public AlbumEntity getAlbum(String title){
        return albumRepository.findById(title).orElseThrow();
    }


    public AlbumEntity createAlbum(AlbumEntity albumEntity){
        return albumRepository.save(albumEntity);
    }

    public AlbumEntity updatereleaseDate(String name, Date realiseDate){
        AlbumEntity albumEntity = albumRepository.findById(name).orElseThrow();
        albumEntity.setReleaseDate(realiseDate);
        return albumRepository.save(albumEntity);
    }

    public void deleteAlbum(String title) {
        albumRepository.deleteById(title);
    }
}