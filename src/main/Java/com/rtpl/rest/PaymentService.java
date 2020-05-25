package com.rtpl.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rtpl.transaction.EmployeeTransaction;



@Component
@Path("/payment")
public class PaymentService {

	@Autowired
	EmployeeTransaction employeetransaction;

	@GET
	@Path("/done")
	public Response savePayment() {

		String result = employeetransaction.save();
		return Response.status(200).entity(result).build();

		
	
	}
}
