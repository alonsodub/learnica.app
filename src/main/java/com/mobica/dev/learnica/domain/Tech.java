package com.mobica.dev.learnica.domain;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
@Entity
public class Tech{
	@Id 
	private String compositeKey;
	@Index private String email;
	protected String name;
	private String id;
	private String value;
	private String level;
	
	public Tech(String compositeKey, String email,String name,String id,String value,String level){
		this.compositeKey = compositeKey;
		this.email = email;    	
		this.name = name;
		this.id = id;
		this.value = value;
		this.level = level;
	}
	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
     * Just making the default constructor private.
     */
	public Tech() {}
	
	/**
	 * @return the compositeKey
	 */
	public String getCompositeKey() {
		return compositeKey;
	}
	/**
	 * @param compositeKey the compositeKey to set
	 */
	public void setCompositeKey(String compositeKey) {
		this.compositeKey = compositeKey;
	}
	public void update(String email, String name, String id, String value, String level) {
		// TODO Auto-generated method stub
		if(email != null){
			this.email = email;
		}
		if(name != null){
			this.name = name;
		}
		if(id != null){
			this.id = id;
		}
		if(value != null){
			this.value = value;
		}
		if(level != null){
			this.level = level;
		}
		
	}

}
