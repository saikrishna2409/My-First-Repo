package com.cts.training.userservice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@SpringBootTest(classes=UserServiceApplication.class,webEnvironment =SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)

class IntegrationTesting {

	@LocalServerPort
	private int port;
	HttpHeaders headers =new HttpHeaders();
	TestRestTemplate restTemplate=new TestRestTemplate();
	@Test
	public void test() {
		String url="http://localhost:"+port+"/users";
		System.out.println("Port : :"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null,headers);
		ResponseEntity<String> response= restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":13,\"username\":\"sac\",\"password\":\"sac\",\"rpassword\":\"sac\",\"email\":\"sac@\",\"mobile\":4365,\"regStatus\":null,\"active\":\"no\"}";
		System.out.println("TEST 1 :: Response Body :::: " + response.getBody());
		assertTrue(response.getBody().contains(expected));
		
	}
	@Test
	public void getByIdtest() {
		String url="http://localhost:"+port+"/users/13";
		System.out.println("Port : :"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null,headers);
		ResponseEntity<String> response= restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":13,\"username\":\"sac\",\"password\":\"sac\",\"rpassword\":\"sac\",\"email\":\"sac@\",\"mobile\":4365,\"regStatus\":null,\"active\":\"no\"}";
		System.out.println("TEST 1 :: Response Body :::: " + response.getBody());
		assertTrue(response.getBody().contains(expected));
		
	}
	@Test
	public void addUser() throws Exception
	{
		String url="http://localhost:"+port+"/users";
		System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		Users users =new Users(123,"sakethhgft","123@","123@","sakethu@gmail.com",917747656,"no",false,"ROLE_USER");
		HttpEntity<Users> entity=new HttpEntity<Users>(users,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.POST,entity,String.class);
		String expected="\"res\":\"1\"";
		System.out.println("TESt adduser :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	
//	@Test
//	public void addUser2() throws Exception
//	{
//		String url="http://localhost:"+port+"/users";
//		System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		Users users =new Users(123,"sakethhgft","123@","123@","sakethu@gmail.com",917747656,"no","no");
//		HttpEntity<Users> entity=new HttpEntity<Users>(users,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.POST,entity,String.class);
//		String expected="\"res\":\"0\"";
//		System.out.println("TESt adduser :: Response Body :::: " +response.getBody());
//		assertTrue(response.getBody().contains(expected));
//	}
	
	

}
