package jMarket.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jMarket.business.abstracts.UserService;
import jMarket.core.RegisterService;
import jMarket.dataAccess.abstracts.UserDao;
import jMarket.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private RegisterService registerService;
	
	public UserManager(UserDao userDao,RegisterService registerService) {
		this.userDao = userDao;
		this.registerService=registerService;
	}

	@Override
	public void add(User user) {
		//User register kurallarýný yazalým.

		
		
		if (!isPasswordValid(user.getPassword())|| 
				!isEmailValid(user.getEmail()) || 
				isEmail(user.getEmail()) || 
				!isNameValid(user.getFirstName()) ||
				!isNameValid(user.getLastName())) {
			
			return;
		}
		
		
		this.userDao.add(user);
		this.registerService.sendActivationCode(user.getEmail());
		System.out.println(user.getFirstName()+" eklendi");
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		
		return this.userDao.get(id);
	}

	@Override
	public List<User> getAll() {

		return this.userDao.getAll();
	}
	
	private boolean isPasswordValid(String password) {
		if(password.length()<6) {
			System.out.println("Parola en az 6 karakter olmalýdýr!");
			return false;
		}
		return true;
	}
	
	private boolean isEmailValid(String email) {
		String expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr=email;
		
		Pattern pattern=Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(inputStr);
		
		if (!matcher.matches()) {
			System.out.println("E-posta adresi belirtilen formata uygun deðil!");
		}
		
		return matcher.matches();
	}
	
	private boolean isEmail(String email) {
		if(this.userDao.getAll()!=null) {
			for (User user : this.userDao.getAll()) {
				if(email==user.getEmail()) {
					System.out.println("E posta adresi sistemde kayýtlýdýr!");
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean isNameValid(String name) {
		if(name.length()<2) {
			System.out.println("Ýsim ve Soyisim en az 2 karakter olmalýdýr!");
			return false;
		}
		return true;
	}
	
	


}
