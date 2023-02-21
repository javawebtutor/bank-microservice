package com.javawebt.loans.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javawebt.loans.model.Loans;

public interface LoansRepository extends CrudRepository<Loans, Integer> {

	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
