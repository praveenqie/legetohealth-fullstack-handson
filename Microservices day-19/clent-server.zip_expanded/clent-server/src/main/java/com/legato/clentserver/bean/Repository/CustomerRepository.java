package com.legato.clentserver.bean.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.legato.clentserver.bean.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
