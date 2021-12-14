package com.satishlabs.csv.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.satishlabs.csv.service.AccountServiceImpl;

@RestController
public class AccountController {
	
	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	@PostMapping("/upload")
	public String UploadCSVToDatabase(@RequestParam("file") MultipartFile file) throws IOException {
		accountServiceImpl.uploadCSV(file);
		
		return "Uploaded success !!";
	}
}
