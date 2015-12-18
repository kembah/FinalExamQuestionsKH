package QuestionA;

import java.util.Date;

public interface IpersonReadWrite {
	
	public default void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public default void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}
	public default void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public default void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	public default void setAddress(String newAddress) {
		address = newAddress;
	}
	

	public default void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	}
	
	public default void setEmail(String newEmail) {
		email_address = newEmail;
	}
	
	
	
}
