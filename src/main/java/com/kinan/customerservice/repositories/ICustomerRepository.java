package com.kinan.customerservice.repositories;

import com.kinan.customerservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Eren
 **/
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
