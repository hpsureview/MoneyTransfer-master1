package com.example.moneytransfer.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Long fromCard;

    @Column(nullable = false)
    private Long toCard;

    @Column(nullable = false)
    private Long amount;

    @CreationTimestamp
    @Column(nullable = false)
    private Timestamp date;
}