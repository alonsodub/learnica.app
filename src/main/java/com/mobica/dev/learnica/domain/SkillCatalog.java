package com.mobica.dev.learnica.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

//TODO indicate that this class is an Entity
@Entity
public class SkillCatalog
{
   
   protected String name;
   @Id private String id;
  
   /**
    * Just making the default constructor private.
    */
   public SkillCatalog() {}
   public SkillCatalog(String name,String id){
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