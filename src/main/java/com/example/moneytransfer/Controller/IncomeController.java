package com.example.moneytransfer.Controller;

import com.example.moneytransfer.DTO.ApiResponse;
import com.example.moneytransfer.Model.Card;
import com.example.moneytransfer.Model.Income;
import com.example.moneytransfer.Service.CardService;
import com.example.moneytransfer.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    IncomeService incomeService;

    @GetMapping("/get")
    public HttpEntity<?> registerCard(@RequestBody Card card,Integer id){
        List<Income> incomes = incomeService.get(card, id);

        return ResponseEntity.ok(incomes);
    }

}
