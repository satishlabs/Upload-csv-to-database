package com.satishlabs.csv.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.satishlabs.csv.dto.AccountDetailsDTO;
import com.satishlabs.csv.model.AccountDetails;
import com.satishlabs.csv.repository.AccountRepository;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.common.record.Record;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String uploadCSV(MultipartFile file) throws IOException {
		List<AccountDetails> accountList = new ArrayList<AccountDetails>();
		InputStream inputStream = file.getInputStream();
		CsvParserSettings settings = new CsvParserSettings();
		settings.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(settings);
		
		
		List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record -> {
			//// convert entity to DTO
			//AccountDetailsDTO accountDto = new AccountDetailsDTO();
			
			AccountDetails account = new AccountDetails();
			account.setAccountNumber(Integer.parseInt(record.getString("account_number")));
			account.setFirstname(record.getString("firstname"));
			account.setLastname(record.getString("lastname"));
			account.setAccount_type(record.getString("account_type"));
			account.setAddress(record.getString("address"));
			account.setEmail(record.getString("email"));
			account.setZipcode(record.getString("zipcode"));
			
			accountList.add(account);
		});
		
		accountRepository.saveAll(accountList);
		return "Upload successfully !!";
	}
	
	
}
