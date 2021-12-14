package com.satishlabs.csv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.csv.model.AccountDetails;

public interface AccountRepository extends JpaRepository<AccountDetails, Integer>{

}
