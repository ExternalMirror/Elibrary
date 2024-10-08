package az.edu.elibrary.repository;

import az.edu.elibrary.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomerIdAndActive(Long customerId, Integer active);
    Transaction findByIdAndActive(Long id, Integer active);

    Transaction findTransactionByBasketIdAndActive(Long basketId, Integer active);
}
