package com.javawebt.account.repo;

import org.springframework.data.repository.CrudRepository;

import com.javawebt.account.model.Accounts;
import com.javawebt.account.model.Customer;

public interface AccountsRepository extends CrudRepository<Accounts, Integer>{
	
	Accounts findByCustomerId(int customerId);

}
