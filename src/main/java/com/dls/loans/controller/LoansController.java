package com.dls.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dls.loans.service.client.AccountsFeignClient;

@RestController
@RequestMapping("/loans")
public class LoansController {
	
	@Autowired
	AccountsFeignClient accountsFeignClient;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getLoanDetails(@PathVariable String id){
		
		List<String> accNos = accountsFeignClient.getAccountsDetails(id);
		
		return ResponseEntity.ok(accNos);
		
	}

}
