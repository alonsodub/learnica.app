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
<<<<<<< HEAD

    private String office;
    private String deparment;
    private String role;
    private String responsible;
    private String starDate;
    private String profilePicture;

=======
    private String office;
    private String role;
    private String contactImg;
    private String department;
    private String responsible;
    private String starDate;
>>>>>>> dev

    private ProfileForm () {}

    /**
     * Constructor for ProfileForm, solely for unit test.
     * @param displayName A String for displaying the user on this system.
     * @param notificationEmail An e-mail address for getting notifications from this system.
     */
<<<<<<< HEAD
    public ProfileForm(String displayName,String position,String phone, String email, String skype, String location,
    String office,String deparment,String role,String responsible,String starDate,String profilePicture) {
=======
    public ProfileForm(String displayName,String position,String phone, String email, String skype, String location,String office, String role,
    String contactImg,String department,String responsible,String starDate) {
>>>>>>> dev
        this.displayName = displayName;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.skype = skype;
        this.location = location;
        this.office = office;
<<<<<<< HEAD
        this.deparment = deparment;
        this.role = role;
        this.responsible = responsible;
        this.starDate = starDate;
        this.profilePicture = profilePicture;
=======
        this.role = role;
        this.contactImg = contactImg;
        this.department = department;
        this.responsible=responsible;
        this.starDate=starDate;
>>>>>>> dev
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
<<<<<<< HEAD
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


=======
    public String getRole() {
        return role;
    }
    public String getContactImg() {
        return contactImg;
    }
    public String getDepartment() {
        return department;
    }
    public String getResponsible() {
        return responsible;
    }
    public String getStarDate() {
        return starDate;
    }
>>>>>>> dev
}
