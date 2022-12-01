package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.KuPremiumAPI.model.Food;
import th.ac.ku.KuPremiumAPI.model.Research;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<Food, UUID> {
}
