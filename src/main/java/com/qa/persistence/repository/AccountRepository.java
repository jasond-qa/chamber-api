package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllAccounts();
	
	String createAccount(String account);
	
	String deleteAccount(Long id);
	
	String amendAccount(Long id, String account);

}