package com.test.LearningBoot.swaggerdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerAPIController {
   @RequestMapping(value = "/productsswagger", method = RequestMethod.GET)
   public List<String> getProducts() {
      List<String> productsList = new ArrayList<>();
      productsList.add("Honey");
      productsList.add("Almond");
      return productsList;
   }
   @RequestMapping(value = "/productsswagger", method = RequestMethod.POST)
   public String createProduct() {
      return "Product is saved successfully";
   }
}
