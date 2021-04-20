package com.harishpatarla.shoppingcart;

import com.harishpatarla.shoppingcart.web.ShoppingCartWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ShoppingCartWebConfiguration.class})
public class ShoppingCartApplication {

   public static void main(String[] args) {
      SpringApplication.run(ShoppingCartApplication.class, args);
   }

}
