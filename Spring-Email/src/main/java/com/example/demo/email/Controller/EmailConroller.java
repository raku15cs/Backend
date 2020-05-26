package com.example.demo.email.Controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.email.dto.MailRequest;
import com.example.demo.email.dto.MailResponse;
import com.example.demo.email.service.MailService;

@RestController
public class EmailConroller {
	
	@Autowired
	private MailService service;
	
	@RequestMapping(method=RequestMethod.POST ,value="/Sendingmail" )
	public MailResponse sendEMail(@RequestBody MailRequest request)
	{
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("Name", request.getName());
		model.put("Location", "Bangaloe,india");
		return service.sendEmail(request,model);
	}

}
