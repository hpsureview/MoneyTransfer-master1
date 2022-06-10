package com.example.moneytransfer.Service;

import com.example.moneytransfer.DTO.ApiResponse;
import com.example.moneytransfer.Model.Card;
import com.example.moneytransfer.Model.Income;
import com.example.moneytransfer.Repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IncomeService {
    @Autowired
    IncomeRepository incomeRepository;
    public List<Income> get(Card card, Integer id){
        List<Income> incomeOptional = incomeRepository.findAll();
            return incomeOptional;
    }
}
