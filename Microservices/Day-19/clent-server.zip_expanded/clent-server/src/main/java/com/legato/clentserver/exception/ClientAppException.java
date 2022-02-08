package com.legato.clentserver.exception;

@SuppressWarnings("serial")
public class ClientAppException extends Exception{
	
	public ClientAppException(){
		super();
	}
	public ClientAppException(String message){
		super(message);
		
	}
}
