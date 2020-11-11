package com.my.bye;

import org.springframework.stereotype.Service;

@Service
public class ByeService implements IByeService {

	@Override
	public String sayBye(String message) {
		return "Bye" + message;
	}

}
