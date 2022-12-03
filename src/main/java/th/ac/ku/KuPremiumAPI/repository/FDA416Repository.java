package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.KuPremiumAPI.model.FDA414;
import th.ac.ku.KuPremiumAPI.model.FDA416;

import java.util.UUID;

public interface FDA416Repository extends JpaRepository<FDA416, UUID> {
}
