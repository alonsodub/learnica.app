/**
 * 
 */
package com.mobica.dev.learnica.form;

/**
 * @author admin
 *
 */
public class TechCatalogForm {
	private String name;
    private String id;
    
    private TechCatalogForm () {}

    /**
     * Constructor for ProfileForm, solely for unit test.
     * @param displayName A String for displaying the user on this system.
     * @param notificationEmail An e-mail address for getting notifications from this system.
     */
    public TechCatalogForm(String id,String name) {
        this.name = name;
        this.id = id;
        
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
}
