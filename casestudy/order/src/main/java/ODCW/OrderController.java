package ODCW;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    RestTemplate restTemplate;
  //getorders
    @GetMapping(value = "/orderlist")
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    //addorders
    @PostMapping(value = "/addorder")
    public String addOrder(@RequestBody Order order){
    	orderRepository.save(order);
        return "order Added Succesfully";
    }
    //deleteUsers
    @DeleteMapping(value = "/delete/{orderID}")
    public String deleteOrder(@PathVariable String orderID) {
        System.out.println("Delete method called");
        orderRepository.deleteById(orderID);
        return "Deleted Successfully";
    }
    //updateUser
    @PutMapping(value = "/update/{orderID}")
    public String updateOrder(@RequestBody Order order, @PathVariable String orderID){
    	orderRepository.save(order);
        return "order is Updated Succesfully";
    }
}


