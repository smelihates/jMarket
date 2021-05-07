package jMarket.core;

import jMarket.entities.concretes.User;

public interface RegisterService {
	void sendActivationCode(String email);
	boolean isRegisterUser(User user);
	void setRegisteredUser(User user);
}
