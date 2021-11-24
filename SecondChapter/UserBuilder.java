package SecondChapter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
// в этом классе создамим строителя вместо  описания каждого возможного конструктора.
public class UserBuilder { // просто  класс
	private final String nickname;
	private final String password;
	private final Date created;
	private final String firstName;
	private final String lastName;
	private final String email;
	
	private UserBuilder(UserBuilders builder) {
		this.nickname=builder.nickname;
		this.password=builder.password;
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.email=builder.email;
		this.created=builder.created;
		//this.created=new Date();
	}
public static UserBuilders getBuilders(String nickname, String password) {// метод для создания обьета
	return new UserBuilder.UserBuilders(nickname, password);
}

public static final class UserBuilders {// создаем страителя класса
	@NotNull(message= "Can not be null")
	@Size (min = 3, max = 20, message  = "must be between 3 and 20 characters")
	private final String nickname;
	@NotNull(message= "Can not be null")
	@Size (min = 3, max = 50, message  = "must be between 3 and 20 characters")
	private final String password;
	
	@Size (min = 3, max = 50, message  = "must be between 3 and 20 characters")
	private String firstName;
	@Size (min = 3, max = 50, message  = "must be between 3 and 20 characters")
	private String lastName;
	@Email(message="email @")
	private String email;
	private final Date created;
	public  UserBuilders(String nickname, String password) {
		this.nickname=nickname;
		this.password=password;
		this.created=new Date();
	}
	public UserBuilders FirstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	public UserBuilders LastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	public UserBuilders Email(String email) {
		this.email=email;
		return this;
	}
	public UserBuilder build() {
		return new UserBuilder(this);
	}
}
	public String getNickname() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Date getCreated() {
		return new Date(created.getTime());
		
	}
	@Override
	public String toString() {
		return "UserBuilder{"+"firstName" +firstName + "Lastname "+ lastName+"date"+created+"email"+email+'}';
	}
	
}
