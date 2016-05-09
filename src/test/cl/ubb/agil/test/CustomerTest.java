package cl.ubb.agil.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.model.Customer;

public class CustomerTest {
	
	@Test
	public void canCreateCustomer(){
		Customer clien= new Customer("matias");
	}
	@Test
	public void GetNameLuis(){
		Customer clien=new Customer("Luis");
		assertEquals("Luis",clien.getName());
	}
	
	@Test
	public void GetNameGloria(){
		Customer clien=new Customer("Gloria");
		assertEquals("Gloria",clien.getName());
	}
	
	@Test
	public void GetNameJuan(){
		Customer clien=new Customer("Juan");
		assertEquals("Juan",clien.getName());
	}

}
