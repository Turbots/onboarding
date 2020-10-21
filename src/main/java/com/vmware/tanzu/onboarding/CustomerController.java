package com.vmware.tanzu.onboarding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public List<Customer> getCustomers() {
        return List.of(new Customer("Qvantel", "AWESOME!"));
    }
}
