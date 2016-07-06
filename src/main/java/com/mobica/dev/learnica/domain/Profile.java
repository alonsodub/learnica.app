package com.mobica.dev.learnica.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
//import com.google.devrel.training.conference.form.ProfileForm.TeeShirtSize;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;


// TODO indicate that this class is an Entity
@Entity
public class Profile {
    
   // TeeShirtSize teeShirtSize;


    // *** MOBICA PROFILE ** //b 
	// TODO indicate that the email is to be used in the Entity's key
    @Id String email;;
    String displayName;
    String position;
    String phone;
    String skype;
    String location;


    

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
    public Profile (String email, String displayName, String position, String phone, String skype, String location) {
        this.email = email;
        this.displayName = displayName;
        this.position = position;
        this.phone = phone;
        this.skype = skype;
        this.location = location;
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
     * @param teeShirtSize
     */
    public void update(String displayName, String position, String phone, String skype, String location) {
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
