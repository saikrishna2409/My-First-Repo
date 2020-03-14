package com.cts.training.sectorservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient("netflix-zuul-api-gateway-server")
//@FeignClient("user-service")
//@FeignClient(name="",url="http://localhost:8000/users")
//@RibbonClient(name="user-service")
public interface UserServiceProxy {
	@RequestMapping(value = "/user-service/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsers();
}
