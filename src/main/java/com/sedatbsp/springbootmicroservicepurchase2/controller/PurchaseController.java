package com.sedatbsp.springbootmicroservicepurchase2.controller;

import com.sedatbsp.springbootmicroservicepurchase2.model.Purchase;
import com.sedatbsp.springbootmicroservicepurchase2.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping // api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        purchaseService.savePurchase(purchase);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("{userId}") //api/purchase/{userId}
    public ResponseEntity<?> getAllPurchasesOfUser(@PathVariable Long userId) {
        var purchasesOfUser = purchaseService.findAllPurchasesOfUser(userId);
        return ResponseEntity.ok(purchasesOfUser);
    }


}
