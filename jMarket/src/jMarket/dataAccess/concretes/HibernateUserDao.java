package jMarket.dataAccess.concretes;

import java.util.List;

import jMarket.dataAccess.abstracts.UserDao;
import jMarket.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� Hibernate ile eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� Hibernate ile g�ncellendi.");

		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� Hibernate ile silindi.");
		
	}

	@Override
	public User get(int id) {
		System.out.println(id +" id'li kullan�c� bilgileri Hibernate ile getirildi.");

		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Kullan�c�lara ait bilgileri Hibernate ile getirildi.");
		return null;
	}

}
