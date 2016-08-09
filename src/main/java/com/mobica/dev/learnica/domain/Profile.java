package com.mobica.dev.learnica.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
//import com.google.devrel.training.conference.form.ProfileForm.TeeShirtSize;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


// TODO indicate that this class is an Entity
@Entity
public class Profile {

   // TeeShirtSize teeShirtSize;


    // *** MOBICA PROFILE ** //b
	// TODO indicate that the email is to be used in the Entity's key
    @Id String email;;
    @Index String displayName;
    String position;
    String phone;
    String skype;
    String location;
    String office;
    String role;
    String contactImg;
    String department;
    String responsible;
    String starDate;



    String office;
    String deparment;
    String role;
    String responsible;
    String starDate;
    String profilePicture;




    /**
     * Keys of the conferences that this user registers to attend.
     */
   // private List<String> conferenceKeysToAttend = new ArrayList<>(0);

    /**
     * Public constructor for Profile.
     * @param userId The user id, obtained from the email
     * @param displayName Any string user wants us to display him/her on this system.
     * @param mainEmail User's main e-mail address.
     * @param
     *
     */
<<<<<<< HEAD
    public Profile (String email, String displayName, String position, String phone, String skype, String location,
    String office,String deparment,String role,String responsible,String starDate,String profilePicture) {
=======
    public Profile (String email, String displayName, String position, String phone, String skype, String location,String office,String role,
    String contactImg,String department,String responsible,String starDate) {
>>>>>>> dev
        this.email = email;
        this.displayName = displayName;
        this.position = position;
        this.phone = phone;
        this.skype = skype;
        this.location = location;
<<<<<<< HEAD

        this.office = office;
        this.deparment = deparment;
        this.role = role;
        this.responsible = responsible;
        this.starDate = starDate;
        this.profilePicture = profilePicture;

=======
        this.office = office;
        this.role = role;
        this.contactImg = contactImg;
        this.department = department;
        this.responsible=responsible;
        this.starDate=starDate;
>>>>>>> dev
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the skype
	 */
	public String getSkype() {
		return skype;
	}

	/**
	 * @param skype the skype to set
	 */
	public void setSkype(String skype) {
		this.skype = skype;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
        return displayName;
    }
<<<<<<< HEAD
    /**
  	 * @param
  	 */
  	public void setOfficeName(String office) {
  		this.office = office;
  	}

  	public String getOfficeName() {
      return office;
    }
      /**
       * @param
       */
    public void setDeparment(String deparment) {
      this.deparment = deparment;
    }

    public String getDeparment() {
        return deparment;
        }

        public void setRole(String role) {
          this.role = role;
        }

        public String getRole() {
            return role;
            }
            public void setResponsible(String responsible) {
              this.responsible = responsible;
            }

            public String getResponsible() {
                return responsible;
                }
                public void setstarDate(String starDate) {
                  this.starDate=starDate;
                }

                public String getstarDate() {
                    return starDate;
                    }
                    public void setprofilePicture(String profilePicture) {
                      this.profilePicture = profilePicture;
                    }

                    public String getproilePicture() {
                        return profilePicture;
                        }
=======
    public void setOffice(String office) {
        this.office = office;
    }
    public String getOffice() {
        return office;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setContactImg(String contactImg) {
        this.contactImg = contactImg;
    }
    public String getContactImg() {
        return contactImg;
    }
    public void setDepartment(String department) {
      this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setResponsible(String responsible) {
      this.responsible=responsible;

    }
    public String getResponsible() {
            return responsible;
        }
    public void setStarDate(String starDate) {
          this.starDate=starDate;
        }
        public String getStarDate() {
            return starDate;
        }

>>>>>>> dev
    /**
     * Getter for conferenceIdsToAttend.
     * @return an immutable copy of conferenceIdsToAttend.
     */
//    public List<String> getConferenceKeysToAttend() {
//        return ImmutableList.copyOf(conferenceKeysToAttend);
//    }

    /**
     * Just making the default constructor private.
     */
    public Profile() {}

    /**
     * Update the Profile with the given displayName and teeShirtSize
     *
     * @param displayName
     * @param location
     * @param skype
     * @param phone
     * @param position
<<<<<<< HEAD
     * @param teeShirtSize
     */
    public void update(String displayName, String position, String phone, String skype, String location,
    String office,String deparment,String role,String responsible,String starDate,String profilePicture) {
=======
     * @param office
     */
    public void update(String displayName, String position, String phone, String skype, String location,String office,String role,
    String contactImg,String department,String responsible,String starDate) {
>>>>>>> dev
        if (displayName != null) {
            this.displayName = displayName;
        }
        if(position != null){
        	this.position = position;
        }
        if(phone != null){
        	this.phone = phone;
        }
        if(skype != null){
        	this.skype = skype;
        }
        if(location != null){
        	this.location = location;
        }
<<<<<<< HEAD
        if(office!= null){
          this.office = office;
        }
        if(deparment!= null){
          this.deparment = deparment;
        }
        if(role!= null){
          this.role = role;
        }
        if(responsible!= null){
          this.responsible = responsible;
        }
        if(starDate!= null){
          this.starDate =starDate;
        }
        if(profilePicture!= null){
          this.profilePicture =profilePicture ;
        }
=======
        if(office != null){
        	this.office = office;
        }
        if(role != null){
        	this.role = role;
        }
        if(contactImg != null){
        this.contactImg = contactImg;
      }
        if(department != null){
        this.department = department;
      }
      if(responsible != null){
        this.responsible=responsible;
      }
    if(starDate != null){
        this.starDate=starDate;
      }
>>>>>>> dev
    }

    /**
     * Adds a ConferenceId to conferenceIdsToAttend.
     *
     * The method initConferenceIdsToAttend is not thread-safe, but we need a transaction for
     * calling this method after all, so it is not a practical issue.
     *
     * @param conferenceKey a websafe String representation of the Conference Key.
     */
//    public void addToConferenceKeysToAttend(String conferenceKey) {
//        conferenceKeysToAttend.add(conferenceKey);
//    }

    /**
     * Remove the conferenceId from conferenceIdsToAttend.
     *
     * @param conferenceKey a websafe String representation of the Conference Key.
     */
//    public void unregisterFromConference(String conferenceKey) {
//        if (conferenceKeysToAttend.contains(conferenceKey)) {
//            conferenceKeysToAttend.remove(conferenceKey);
//        } else {
//            throw new IllegalArgumentException("Invalid conferenceKey: " + conferenceKey);
//        }
//    }

}
