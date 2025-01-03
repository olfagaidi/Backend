package tn.iteam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.iteam.entities.Profile;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByEmail(String email);
}
