package jMarket.dataAccess.concretes;

import java.util.List;

import jMarket.dataAccess.abstracts.UserDao;
import jMarket.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" isimli kullanıcı Hibernate ile eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" isimli kullanıcı Hibernate ile güncellendi.");

		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" isimli kullanıcı Hibernate ile silindi.");
		
	}

	@Override
	public User get(int id) {
		System.out.println(id +" id'li kullanıcı bilgileri Hibernate ile getirildi.");

		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Kullanıcılara ait bilgileri Hibernate ile getirildi.");
		return null;
	}

}
