package kodlamaio.Northwind.business.abstracts;

import kodlamaio.Northwind.core.entities.User;
import kodlamaio.Northwind.core.utilities.results.DataResult;
import kodlamaio.Northwind.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	DataResult<User>findByEmail(String email);
}
