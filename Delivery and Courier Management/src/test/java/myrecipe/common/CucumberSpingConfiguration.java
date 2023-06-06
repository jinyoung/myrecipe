package myrecipe.common;

import io.cucumber.spring.CucumberContextConfiguration;
import myrecipe.DeliveryAndCourierManagementApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryAndCourierManagementApplication.class })
public class CucumberSpingConfiguration {}
