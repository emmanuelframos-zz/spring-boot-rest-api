package com.test.api.service;

import com.api.domain.Customer;
import com.api.repository.CustomerRepository;
import com.api.service.CustomerService;
import com.test.api.common.BusinessLayerTestBase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class CustomerRepositoryServiceTest extends BusinessLayerTestBase {

    @InjectMocks
    private CustomerService customerServiceSpy;

    @Mock
    private CustomerRepository customerRepositoryMock;

    @Test
    public void testFindByLastName() throws Exception {
        Customer dummy = new Customer();
        dummy.setId(1L);
        dummy.setFirstName("dummy first name");
        dummy.setLastName("dummy last name");

        when(customerRepositoryMock.findByLastName("dummy last name")).thenReturn(Arrays.asList(dummy));

        List<Customer> customers = customerServiceSpy.findByLastName("dummy last name");

        Assert.assertEquals(dummy.getFirstName(), customers.get(0).getFirstName());
        Assert.assertEquals(dummy.getLastName(), customers.get(0).getLastName());
    }
}