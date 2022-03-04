package com.telusko.springMVC;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceSaveName {

	@Autowired
	private RepositorySaveName reposi;
	
	public SaveName newadd(SaveName savename)
	{
		UUID uuid = UUID.randomUUID();
		savename.setNid(uuid.toString());
		return  reposi.save(savename);
	}
}
