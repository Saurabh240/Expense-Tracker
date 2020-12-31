package info.geekslearning.expensetracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.geekslearning.expensetracker.model.Expense;
import info.geekslearning.expensetracker.repository.ExpenseRepository;
@Service
public class ExpenseServiceImp implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

}
