package ODCW;
import org.springframework.data.mongodb.repository.MongoRepository;

import Inter.User;


public interface UserRepository extends MongoRepository<User, String> {
    User findUsersById(String Id);

    User findByMobileNumber(String mobilenumber);

    User findByUserName(String username);
}
