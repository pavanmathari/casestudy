package ODCW;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderRepository  extends MongoRepository<Order, String> {
    Order findOrdersById(String Id);

    //Order findByMobileNumber(String mobilenumber);

    //Order findByUserName(String username);
}
