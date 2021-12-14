package com.satishlabs.csv.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface AccountService {
	public String uploadCSV(MultipartFile file) throws IOException;
}
 