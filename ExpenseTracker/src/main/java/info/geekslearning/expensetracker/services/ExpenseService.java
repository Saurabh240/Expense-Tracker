package info.geekslearning.expensetracker.services;

import java.util.List;

import info.geekslearning.expensetracker.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
}
