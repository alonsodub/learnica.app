package com.mobica.dev.learnica.form;


	public class SkillForm {
		private String email;
		private String name;
	    private String id;
	    private String value;
	    private String level;



	 


	    public SkillForm(String email, String name, String id, String value, String level) {
	        this.email = email;
	    	this.name = name;
	        this.id = id;
	        this.value = value;
	        this.level = level;
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
		private SkillForm() {}

	  }


