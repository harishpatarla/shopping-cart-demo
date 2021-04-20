package com.harishpatarla.shoppingcart.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Access(AccessType.FIELD)
public class User {
   @Id
   private long userId;



}
