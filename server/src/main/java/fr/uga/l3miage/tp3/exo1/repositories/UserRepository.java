package fr.uga.l3miage.tp3.exo1.repositories;

import fr.uga.l3miage.tp3.exo1.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
    public Set<UserEntity> findAllByMailContaining(String domaine);

}