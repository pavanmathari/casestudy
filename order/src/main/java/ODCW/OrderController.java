package ODCW;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
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
    //addUsers
    @PostMapping(value = "/addOrder")
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
