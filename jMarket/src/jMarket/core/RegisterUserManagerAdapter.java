package jMarket.core;

import jMarket.entities.concretes.User;
import jMarket.register.register;

public class RegisterUserManagerAdapter implements RegisterService{

	@Override
	public void sendActivationCode(String email) {
		register register=new register();
		register.register(email);
		
	}


	public boolean isRegisterUser(User user) {
		if(user.isStatus()==false) {
			System.out.println(user.getFirstName() + " isimli kullanýcýnýn aktivasyonu eksik." );
			return false;
		}
		System.out.println(user.getFirstName() + " isimli kullanýcýnýn aktivasyonu tamam." );
		
		return user.isStatus();
		
	}
	
	public void setRegisteredUser(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullanýcýnýn aktivasyonu yapýlmýþtýr." );
		user.setStatus(true);
	}



}
