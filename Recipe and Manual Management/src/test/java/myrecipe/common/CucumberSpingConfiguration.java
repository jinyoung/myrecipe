package myrecipe.common;

import io.cucumber.spring.CucumberContextConfiguration;
import myrecipe.RecipeAndManualManagementApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RecipeAndManualManagementApplication.class })
public class CucumberSpingConfiguration {}
