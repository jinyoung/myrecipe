package myrecipe.common;

import io.cucumber.spring.CucumberContextConfiguration;
import myrecipe.CustomerManagementApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerManagementApplication.class })
public class CucumberSpingConfiguration {}
