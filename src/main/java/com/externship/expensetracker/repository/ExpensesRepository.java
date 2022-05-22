package com.externship.expensetracker.repository;

import com.externship.expensetracker.table.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expenses, String> {
    List<Expenses> findAllByEmail(String email);
}

