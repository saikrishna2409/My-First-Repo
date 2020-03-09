package com.cts.training.iposervice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@FeignClient("company-service")
@RibbonClient(name="company-service")
public interface CompanyServiceProxy {
	@RequestMapping(value="/company/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findOne(@PathVariable int id);
}
