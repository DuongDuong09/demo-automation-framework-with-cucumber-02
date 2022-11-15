package org.example.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JSONFileReader {
    public static Customer getEmployeeInfoByNumber(String idInput) throws IOException {
        Customer customer = new Customer();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<Customer> employeeList = objectMapper.readValue(Paths.get("src/test/resources/datatest_11.json").toFile(),
                new TypeReference<List<Customer>>() {
                });
        for (Customer emp : employeeList) {
            if (emp.getNumber().equals(idInput)) {
                customer = new Customer(idInput, emp.getName(), emp.getBirthdate(),emp.getAddress(),emp.getCity(),
                emp.getState(),emp.getPhone(),emp.getPin(),emp.getEmail(),emp.getPassword());
                break;
            }
        }
        return customer;

    }
}
