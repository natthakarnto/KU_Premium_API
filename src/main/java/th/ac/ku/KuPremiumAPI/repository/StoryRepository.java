package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.KuPremiumAPI.model.Story;

import java.util.UUID;

public interface StoryRepository extends JpaRepository<Story, UUID> {
}
