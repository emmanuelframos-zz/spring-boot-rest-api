package com.api.utils;

import com.api.web.rest.v1.resource.CustomerResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class CustomerUtils {

    private static String[] lowPrizeArray    = {"Pacote de Bala Yogurte 100", "Um beijo da Débora", "Coleção Bíblia Em Aúdio Cid Moreira", "Discografia em K7 Molejão + Raça Negra", "Fardão Dolly 2L"};
    private static String[] mediumPrizeArray = {"1000ão de Crédito na 25 de Março", "Coleção Jaspion em VHS", "Uno Zerinho", "Coleção da Playboy", "Air Fryer"};
    private static String[] highPrizeArray   = {"Fds em Ubatuba", "Rolê na Augusta", "Happy Hour Outback na Faixa", "Natal em Campos do Jordão", "Almoço no Thiane Por 1 Ano"};

    private static Random random = new Random();

    public static List<CustomerResource> getCustomers(){

        List<CustomerResource> customers = new ArrayList();

        customers.add(CustomerResource.build()
                .login("jdoe")
                .name("John Doe")
                .age(27)
                .birthDate("1989-05-11")
                .photoUrl("")
                .salary(5000.26)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("cdoe")
                .name("Cris Doe")
                .age(29)
                .birthDate("1987-10-13")
                .photoUrl("")
                .salary(7000.47)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("tdoe")
                .name("Tyler Doe")
                .age(31)
                .birthDate("1985-11-29")
                .photoUrl("")
                .salary(4500.46)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("ldoe")
                .name("Louis Doe")
                .age(24)
                .birthDate("1992-09-05")
                .photoUrl("")
                .salary(6900.34)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("adoe")
                .name("Alan Doe")
                .age(31)
                .birthDate("1985-09-23")
                .photoUrl("")
                .salary(4000.28)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("gdoe")
                .name("Gilbert Doe")
                .age(27)
                .birthDate("1988-09-23")
                .photoUrl("")
                .salary(7600.50)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("rdoe")
                .name("Richard Doe")
                .age(27)
                .birthDate("1988-02-23")
                .photoUrl("")
                .salary(9670.78)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        customers.add(CustomerResource.build()
                .login("mdoe")
                .name("Mark Doe")
                .age(36)
                .birthDate("1980-04-08")
                .photoUrl("")
                .salary(8000.18)
                .productivityMonths(ProductivityUtils.getProductivityMonths())
                .productivityAverage()
        );

        return customers;
    }

    public static List<CustomerResource> getCustomersPrize(){
        List<CustomerResource> customers = getCustomers();

        customers.stream().forEach((customer)-> {
            customer.prize(getPrize(customer.getProductivityAverage()));
        });

        return customers;
    }

    private static String getPrize(Double productivityAverage){
        if (productivityAverage < 50){
            return lowPrizeArray[random.nextInt(lowPrizeArray.length)];
        }else if (productivityAverage >= 50 && productivityAverage < 70){
            return mediumPrizeArray[random.nextInt(mediumPrizeArray.length)];
        }else {
            return highPrizeArray[random.nextInt(highPrizeArray.length)];
        }
    }
}
