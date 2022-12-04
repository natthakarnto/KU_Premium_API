package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.model.FDA365;
import java.util.UUID;

@Repository
public interface FDA365Repository extends JpaRepository<FDA365, UUID> {
}
