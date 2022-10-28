package com.mtm.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mtm.entity.Customer;
import com.mtm.entity.Item;
import com.mtm.repository.CustomerRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	CustomerRepository custRepo;

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setCustomerId(1001);
		c.setCustomerName("Goutham");
		
		Customer c1 = new Customer();
		c1.setCustomerId(1002);
		c1.setCustomerName("Sarika");
		
		Item i1 = new Item();
		i1.setItemId(101);
		i1.setItemName("Mobile");
		
		Item i2 = new Item();
		i2.setItemId(102);
		i2.setItemName("Washing");
		
		Item i3 = new Item();
		i3.setItemId(103);
		i3.setItemName("Iron");
		
		List<Item> itemList1 = new ArrayList<Item>();
		itemList1.add(i1);
		itemList1.add(i2);
		itemList1.add(i3);
		
		List<Item> itemList2 = new ArrayList<Item>();
		itemList2.add(i1);
		itemList2.add(i2);
		
		
		c.setItems(itemList1);
		c1.setItems(itemList2);
		
		custRepo.save(c);
		custRepo.save(c1);
		
		
		
		
	}

}
