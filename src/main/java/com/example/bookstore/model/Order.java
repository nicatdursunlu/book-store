package com.example.bookstore.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;
    private List<Integer> bookList;
    private Double totalPrice;
}
