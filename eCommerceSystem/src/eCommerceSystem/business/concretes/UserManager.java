package eCommerceSystem.business.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.core.AuthService;
import eCommerceSystem.core.GoogleAuthManagerAdapter;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private AuthService authService;
	

	

	
	public UserManager(UserDao userDao, AuthService authService) {
		
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length()<6){
            System.out.println("þifre en az 6 karakterden oluþmalýdýr.");
        }
        final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.geteMail());
        if (!matcher.matches()){
            System.out.println(user.geteMail()+" bu e-posta, e-posta formatýna uygun deðil.");
        }
        for(User users:userDao.getAll()){
            if (users.geteMail().equals(user.geteMail())){
                System.out.println(user.geteMail()+" bu e-posta adresi sistemde mevcuttur.");
            }
        }
        if (user.getName().length()<2 && user.getSurname().length()<2){
            System.out.println("Ad ve Soyad en az 2 karakterden oluþmalýdýr.");
        }
	}

	@Override
	public void login(User user) {
		if(user.isVerify()==true) {
			userDao.login(user);
		}
		else {
			System.out.println("Giriþ baþarýsýz mail adresinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify()==true) {
			userDao.confirm(user);
			System.out.println(user.geteMail()+"email adresiniz doðrulanmýþtýr.");
		}else {
			System.out.println(user.geteMail()+"email adresiniz doðrulanmamýþtýr.");
		}
		
	}

	@Override
	public void registerWithAccount(User user) {
		user.setVerify(true);
		this.authService.register(user);
		
	}

	@Override
	public void loginWithAccount(User user) {
		if(user.isVerify()==true) {
			this.authService.login(user);
			
		}
		else {
			System.out.println("Henüz kayýt olunmamýþ.");
		}
	}
}

