package com.app;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/msg")
public class Message {

	@Path("/show")
	@GET
	public String showMsg1() {
		return "Hello::GET1";
	}// showMsg1()

	/*
	 * @GET public void showNoMsg() {
	 * System.out.println("This is from no:return:GET"); }
	 */

	/*
	 * @GET public String showMsg2() { return "Hello::GET2"; }
	 */

	@POST
	public String showMsg4() {
		return "Hello::Post";
	}

	@PUT
	public String showMsg5() {
		return "Hello::PUT";
	}

	@DELETE
	public String showMsg6() {
		return "Hello::DELETE";
	}

	@HEAD
	public String showMsgForHead() {
		return "Hello:HEAD";
	}

}// Message class
