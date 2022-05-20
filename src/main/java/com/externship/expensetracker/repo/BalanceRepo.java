package com.externship.expensetracker.repo;

import com.externship.expensetracker.util.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepo extends JpaRepository<Balance, String> {
    Balance findByEmail(String email);
}

