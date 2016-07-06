package com.mobica.dev.learnica.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

//TODO indicate that this class is an Entity
@Entity

public class TechCatalog
{
   //Any number of final, static fields
   protected String name;
   @Id private String id;
   public TechCatalog() {}
   //Any number of abstract method declarations\
   public TechCatalog(String name,String id){
     this.name = name;
     this.id = id;
  }

   public String getName(){
     return this.name;
   }
   public void setName(String name){
     this.name = name;
   }

   public String getId(){
      return this.id;
   }
   public void setId(String id){
     this.id = id;
   }
   

}