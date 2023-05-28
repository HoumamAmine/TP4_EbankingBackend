package org.si.ebankingbackend.repositories;

import org.si.ebankingbackend.entities.AccountOperation;
import org.si.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
