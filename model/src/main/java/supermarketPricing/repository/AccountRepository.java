package supermarketPricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supermarketPricing.UserAccount;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<UserAccount, Long>{
    Optional<UserAccount> findByUserID(Long userId);
}
