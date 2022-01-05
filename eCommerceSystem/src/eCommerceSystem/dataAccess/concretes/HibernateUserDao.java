package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users=new ArrayList<User>();

	@Override
	public void register(User user) {
		System.out.println(user.getName()+"isimli kullanýcý hibernate ile sisteme kaydoldu");
		users.add(user);
	}

	@Override
	public void login(User user) {
		System.out.println(user.getName()+"isimli kullanýcý hibernate ile giriþ yaptý.");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.geteMail()+"email adresininz hibernate ile onaylanmýþtýr.");
		user.setVerify(true);
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getName()+user.getSurname()+" kullanýcý hibernate ile silindi ");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+user.getSurname()+" kullanýcý hibernate ile güncellendi ");
		
	}

	@Override
	public List<User> getAll() {
	
		return this.users;
	}

	

	
		
	}
	

	

