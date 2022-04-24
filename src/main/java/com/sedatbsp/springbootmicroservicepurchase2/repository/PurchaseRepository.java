package com.sedatbsp.springbootmicroservicepurchase2.repository;

import com.sedatbsp.springbootmicroservicepurchase2.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findAllByUserId(Long userId);

}
