package com.harishpatarla.shoppingcart.web;

import com.harishpatarla.shoppingcart.domain.ShoppingCartDomainConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import({ShoppingCartDomainConfiguration.class})
public class ShoppingCartWebConfiguration {
}
