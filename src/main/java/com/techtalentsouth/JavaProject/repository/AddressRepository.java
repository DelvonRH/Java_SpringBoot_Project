package com.techtalentsouth.JavaProject.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techtalentsouth.JavaProject.domian.Address;



public interface AddressRepository extends CrudRepository<Address, Long>{

	Address findByEmailAddress(String emailAddress);
	List<Address> findByFirstNameContainingIgnoreCase(String firstName);
	List<Address> findByLastNameContainingIgnoreCase(String lastName);
	List<Address> findByPhoneNumberContainingIgnoreCase(String phoneNumbeer);
	List<Address> findByEmailAddressContainingIgnoreCase(String emailAddress);
}
