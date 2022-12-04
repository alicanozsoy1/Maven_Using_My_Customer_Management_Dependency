package org.example;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class UsingMyOwnDependency {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManagerNero = new NeroCustomerManager();
        customerManagerNero.Save(new Customer("Ali Can","Özsoy", LocalDate.of(2000,5,19),1));
        System.out.println();

        BaseCustomerManager customerManagerStarBucks = new StarbucksCustomerManager(new CustomerCheckManager(){});

        customerManagerStarBucks.Save(new Customer("Murat","Toprak",LocalDate.of(1997,1,9),5));
        System.out.println();

        customerManagerNero.Delete(new Customer(3));
    }
}
