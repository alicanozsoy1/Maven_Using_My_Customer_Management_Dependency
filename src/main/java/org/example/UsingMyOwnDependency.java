package org.example;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class UsingMyOwnDependency {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.Save(new Customer("Ali Can","Özsoy", LocalDate.of(2000,5,19),1));
        System.out.println();

        BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager1.Save(new Customer("Murat","Toprak",LocalDate.of(1997,1,9),1));
        System.out.println();

        customerManager.Delete(new Customer(1));

    }
}
