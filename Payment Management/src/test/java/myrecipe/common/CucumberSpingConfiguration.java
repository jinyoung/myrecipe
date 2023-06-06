package myrecipe.common;

import io.cucumber.spring.CucumberContextConfiguration;
import myrecipe.PaymentManagementApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentManagementApplication.class })
public class CucumberSpingConfiguration {}
