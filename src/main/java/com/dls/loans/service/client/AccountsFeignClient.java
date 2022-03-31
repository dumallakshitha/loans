package com.dls.loans.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("accounts")
public interface AccountsFeignClient {

	@RequestMapping(method = RequestMethod.POST,value = "/api/v1/accounts",consumes = "application/json")
	List<String> getAccountsDetails(@RequestParam("id") String accNo);
}
