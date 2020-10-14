package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	
	
	@Override
	public List<Product> getList() {
		return Stream.of(new Product(1,"book",12.99),
				new Product(2,"pen",13.99),
				new Product(3,"copy",14.99),
				new Product(4,"pencil",15.99)
				).collect(Collectors.toList());
	}

}
