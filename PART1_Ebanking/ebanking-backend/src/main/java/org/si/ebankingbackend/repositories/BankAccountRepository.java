package org.si.ebankingbackend.repositories;

import org.si.ebankingbackend.entities.BankAccount;
import org.si.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
