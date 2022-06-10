package com.example.moneytransfer.Controller;

import com.example.moneytransfer.Model.Card;
import com.example.moneytransfer.Model.Income;
import com.example.moneytransfer.Model.Outcome;
import com.example.moneytransfer.Service.IncomeService;
import com.example.moneytransfer.Service.OutcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/outcome")
public class OutcomeController {
    @Autowired
    OutcomeService outcomeService;

    @GetMapping("/get")
    public HttpEntity<?> out(@RequestBody Card card, Integer id){
        List<Outcome> outcomes = outcomeService.get(card, id);
        return ResponseEntity.ok(outcomes);
    }
}
