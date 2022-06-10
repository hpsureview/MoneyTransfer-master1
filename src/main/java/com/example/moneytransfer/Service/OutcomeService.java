package com.example.moneytransfer.Service;

import com.example.moneytransfer.Model.Card;
import com.example.moneytransfer.Model.Income;
import com.example.moneytransfer.Model.Outcome;
import com.example.moneytransfer.Repository.IncomeRepository;
import com.example.moneytransfer.Repository.OutcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutcomeService {
    @Autowired
    OutcomeRepository outcomeRepository;
    public List<Outcome> get(Card card, Integer id){
        List<Outcome> outcomes = outcomeRepository.findAll();
        return outcomes;
    }
}
