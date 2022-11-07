package com.example.billlingservice.repository;


import com.example.billlingservice.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillingRepository extends JpaRepository<Billing,Integer> {
}
