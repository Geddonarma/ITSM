package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Table(name="User")
@DiscriminatorValue("a")
@Entity

public class Administrator extends User{

	public Administrator() {

	}

	public Administrator(String email, String role, String name, String password)
	{
		super(email, role, name, password);
	}
	
	
} 