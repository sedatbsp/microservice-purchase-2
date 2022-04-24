package com.sedatbsp.springbootmicroservicepurchase2.service;

import com.sedatbsp.springbootmicroservicepurchase2.model.Purchase;
import com.sedatbsp.springbootmicroservicepurchase2.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<Purchase> findAllPurchasesOfUser(Long userId) {
        return purchaseRepository.findAllByUserId(userId);
    }

}
