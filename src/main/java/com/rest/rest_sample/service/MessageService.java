package com.rest.rest_sample.service;

import java.util.ArrayList;
import java.util.List;

import com.rest.rest_sample.model.Message;

public class MessageService {
	
	public List<Message> getMessages(){
		
		Message m1 = new Message(1L, "Hello WOrld", "Roushan");
		Message m2 = new Message(2L, "Hello Rest", "Roushan");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}

}
