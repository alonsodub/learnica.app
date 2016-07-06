package com.mobica.dev.learnica.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class UserLogin
{
   //Any number of final, static fields
 
   @Id private String email;
   private String password;

   //Any number of abstract method declarations\
   public UserLogin(String name,String email,String password){
   
     this.email = email;
     this.password = password;

   }


   public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}