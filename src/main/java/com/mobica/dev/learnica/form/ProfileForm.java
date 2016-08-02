package com.mobica.dev.learnica.form;

/**
 * Pojo representing a profile form on the client side.
 */
public class ProfileForm {
    /**
     * Any string user wants us to display him/her on this system.
     */
    private String displayName;
    private String position;
    private String phone;
    private String email;
    private String skype;
    private String location;

    private String office;
    private String deparment;
    private String role;
    private String responsible;
    private String starDate;
    private String profilePicture;


    private ProfileForm () {}

    /**
     * Constructor for ProfileForm, solely for unit test.
     * @param displayName A String for displaying the user on this system.
     * @param notificationEmail An e-mail address for getting notifications from this system.
     */
    public ProfileForm(String displayName,String position,String phone, String email, String skype, String location,
    String office,String deparment,String role,String responsible,String starDate,String profilePicture) {
        this.displayName = displayName;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.skype = skype;
        this.location = location;
        this.office = office;
        this.deparment = deparment;
        this.role = role;
        this.responsible = responsible;
        this.starDate = starDate;
        this.profilePicture = profilePicture;
    }

    public String getDisplayName() {
        return displayName;
    }
    public String getPosition() {
        return position;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getSkype() {
        return skype;
    }
    public String getLocation() {
        return location;
    }
    public String getOffice() {
        return office;
    }
    public String getDepartment() {
        return deparment;
    }
    public String getRole() {
        return role;
    }
    public String getResponsible() {
        return responsible;
    }
    public String getstarDate() {
        return starDate;
    }
    public String getproilePicture() {
        return profilePicture;
    }


}
