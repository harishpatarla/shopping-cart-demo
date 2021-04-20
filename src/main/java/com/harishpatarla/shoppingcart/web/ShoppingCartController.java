package com.harishpatarla.shoppingcart.web;

import com.harishpatarla.shoppingcart.domain.ShoppingCartService;
import com.harishpatarla.shoppingcart.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShoppingCartController {
   private final ShoppingCartService shoppingCartService;
   private final UserRepository userRepository;

   @GetMapping(path = "/user/{userId}")
   public ResponseEntity getUser(@PathVariable long userId) {
      return userRepository.findById(userId)
         .map(user -> new ResponseEntity<>(HttpStatus.OK))
         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
   }
}
