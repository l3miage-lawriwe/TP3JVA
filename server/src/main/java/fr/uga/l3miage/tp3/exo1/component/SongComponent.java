package fr.uga.l3miage.tp3.exo1.component;

import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.models.UserEntity;
import fr.uga.l3miage.tp3.exo1.repositories.SongRepository;
import fr.uga.l3miage.tp3.exo1.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class SongComponent {
    private final SongRepository songRepository;



    public SongEntity getSong(String title){
        return songRepository.findById(title).orElseThrow();
    }


    public SongEntity createSong(SongEntity songEntity){
        return songRepository.save(songEntity);
    }

    public SongEntity updateDuration(String title, Duration newDuration){
        SongEntity songEntity = songRepository.findById(title).orElseThrow();
        songEntity.setDuration(newDuration);
        return songRepository.save(songEntity);
    }

    public void deleteSong(String title) {
        songRepository.deleteById(title);
    }

    public Set<SongEntity> getsondwithdurationinterval(Duration start,Duration end){
        return songRepository.findAllByDurationIsBetween(start,end);
    }
}