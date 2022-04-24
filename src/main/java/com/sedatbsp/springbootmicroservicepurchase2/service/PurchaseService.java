package com.sedatbsp.springbootmicroservicepurchase2.service;

import com.sedatbsp.springbootmicroservicepurchase2.model.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
