package Procedure.main;

import Procedure.model.Address;
import Procedure.model.User;
import Procedure.services.UserService;

public class Producer {

    public static void main(String[] args){
        Address address = new Address("Jl.Buaran 2 RW10/RT13", 41,"000001");
        User user = new User((long)1, "Martin", "Yonatan",2021, 25, 01, "martin.yonathan305@gmail.com",address);

        Address newAddress = new Address("Jl Setia Budi 1", 5, "000002");

        new UserService().updateUser(user,address);
    }
}
