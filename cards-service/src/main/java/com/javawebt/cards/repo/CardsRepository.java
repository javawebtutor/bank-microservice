package com.javawebt.cards.repo;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javawebt.cards.model.Cards;

public interface CardsRepository extends CrudRepository<Cards, Integer>{
	
	List<Cards> findByCustomerId(int customerId);

}
