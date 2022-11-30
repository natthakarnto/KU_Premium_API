package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.model.Research;

import java.util.UUID;

public interface ResearchRepository extends JpaRepository<Research, UUID> {
}
