package com.melissa;

import org.springframework.data.jpa.repository.JpaRepository;
//needed to pass in entity: customer and ID type
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //this allows us to perform all the CRUD applications


}
