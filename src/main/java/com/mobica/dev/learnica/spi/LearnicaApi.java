package com.mobica.dev.learnica.spi;


import static com.mobica.dev.learnica.service.OfyService.ofy;

import java.util.List;

import javax.inject.Named;
import java.net.URL;
//import com.google.appengine.api.appidentity;
//import com.google.apphosting.api.ApiProxy;
import com.google.appengine.api.appidentity.AppIdentityService;
import com.google.appengine.api.appidentity.AppIdentityServiceFactory;
import java.util.Collections;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.BearerToken;

//import com.google.api.client.googleapis.auth.oauth2.Credential;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.client.spreadsheet.FeedURLFactory;
import com.google.gdata.util.ServiceException;

//import com.google.gdata.client.spreadsheet.SpreadsheetService;
//import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
//import com.google.gdata.data.spreadsheet.SpreadsheetQuery;
import com.google.gdata.data.spreadsheet.WorksheetFeed;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import com.google.gdata.data.spreadsheet.CellFeed;
import com.google.gdata.data.spreadsheet.CellEntry;
import java.security.GeneralSecurityException;


//import javax.xml.rpc.ServiceException;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;


import com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential;
import com.google.api.services.sheets.v4.SheetsScopes;
/*
import com.google.api.services.sqladmin.SQLAdminScopes;
import com.google.api.services.sqladmin.SQLAdmin;
import com.google.api.services.sqladmin.SQLAdmin.Instances;
import com.google.api.services.sqladmin.SQLAdmin.Instances.List;
*/
//import com.google.api.services.sheets.v4.SheetsScopes;
//import com.google.api.client.googleapis.sheets.v4.model.*;
//import com.google.api.client.googleapis.sheets.v4.Sheets;




import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.appengine.api.users.User;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.Query;
import com.mobica.dev.learnica.constants.Constants;
import com.mobica.dev.learnica.domain.Profile;
import com.mobica.dev.learnica.domain.Skill;
import com.mobica.dev.learnica.domain.SkillCatalog;
import com.mobica.dev.learnica.domain.Tech;
import com.mobica.dev.learnica.domain.TechCatalog;
import com.mobica.dev.learnica.domain.UserLogin;
import com.mobica.dev.learnica.domain.Test;

import com.mobica.dev.learnica.form.ProfileForm;
import com.mobica.dev.learnica.form.SkillCatalogForm;
import com.mobica.dev.learnica.form.SkillForm;
import com.mobica.dev.learnica.form.TechCatalogForm;
import com.mobica.dev.learnica.form.TechForm;

//import com.google.api.server.sheet //
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.google.gdata.client.spreadsheet.CellQuery;


// CONSTANTS
// CLASSES
// FORMS



/**
 * Defines conference APIs.
 */
@Api(
  name = "learnicaEndPoints",
  version = "v2",
  //namespace = @ApiNamespace(ownerDomain="com.mobica.learnica",ownerName="com.mobica.learnica",packagePath=""),
  scopes = { Constants.EMAIL_SCOPE },
  clientIds = {
        Constants.WEB_CLIENT_ID,
        Constants.ANDROID_CLIENT_ID,
        Constants.API_EXPLORER_CLIENT_ID },
  audiences = {Constants.ANDROID_AUDIENCE},
  description = "API for the Lernica Backend application :P")
public class LearnicaApi {

    /*
     * Get the display name from the user's email. For example, if the email is
     * lemoncake@example.com, then the display name becomes "lemoncake."
     */
    private static final Boolean True = null;
    private static final Boolean False = null;
    private static final UserLogin login = null;
    private static String extractDefaultDisplayNameFromEmail(String email) {
        return email == null ? null : email.substring(0, email.indexOf("@"));
    }

    /**
     * Creates or updates a Profile object associated with the given user
     * object.
     *
     * @param user
     *            A User object injected by the cloud endpoints.
     * @param profileForm
     *            A ProfileForm object sent from the client form.
     * @return Profile object just created.
     * @throws UnauthorizedException
     *             when the User object is null.
     */

    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "saveProfile", path = "profile", httpMethod = HttpMethod.POST)
    // The request that invokes this method should provide data that
    // conforms to the fields defined in ProfileForm
    // TODO 1 Pass the ProfileForm parameter
    // TODO 2 Pass the User parameter
//    public Profile saveProfile(final User user, ProfileForm newProfileForm)
//            throws UnauthorizedException {
    public Profile saveProfile(ProfileForm newProfileForm){
        // TODO 2
        // If the user is not logged in, throw an UnauthorizedException
//        if (user == null) {
//            throw new UnauthorizedException("Authorization required");
//        }

        // TODO 2
        // Get the userId and mainEmail
        String mainEmail = newProfileForm.getEmail();
        //String userId = user.getUserId();
       // ProfileForm profileForm = new ProfileForm("Doge","Software Eng","123456789","doge@gmail.com", "doge.mobica", "gdl");

        String displayName = newProfileForm.getDisplayName();
        String position = newProfileForm.getPosition();
        String phone = newProfileForm.getPhone();
        String skype = newProfileForm.getSkype();
        String location = newProfileForm.getLocation();
        String office = newProfileForm.getOffice();
        String deparment = newProfileForm.getDepartment();
        String role = newProfileForm.getRole();
        String responsible = newProfileForm.getResponsible();
        String starDate = newProfileForm.getstarDate();
        String profilePicture=newProfileForm.getproilePicture();



        // Get the Profile from the datastore if it exists
        // otherwise create a new one
        Profile profile = ofy().load().key(Key.create(Profile.class, mainEmail))
                .now();
        /*
        if (profile == null) {
            // Populate the displayName and teeShirtSize with default values
            // if not sent in the request
            if (displayName == null) {
                displayName = extractDefaultDisplayNameFromEmail(mainEmail);
            }

            // Now create a new Profile entity
            profile = new Profile(userId, displayName, mainEmail, teeShirtSize);
        } else {
            // The Profile entity already exists
            // Update the Profile entity
            profile.update(displayName, teeShirtSize);
        }*/


        // TODO 3
        // Save the entity in the datastore

        if (profile == null) {
        	profile = new Profile(mainEmail, displayName, position, phone, skype, location,office,deparment,role,responsible,starDate,profilePicture);
        }else {
            // The Profile entity already exists
            // Update the Profile entity
            profile.update(displayName, position,phone,skype,location,office,deparment,role,responsible,starDate,profilePicture);

        }

        //Save
        ofy().save().entity(profile).now();
        // Return the profile
        return profile;
    }

    /**
     * Returns a Profile object associated with the given user object. The cloud
     * endpoints system automatically inject the User object.
     *
     * @param user
     *            A User object injected by the cloud endpoints.
     * @return Profile object.
     * @throws UnauthorizedException
     *             when the User object is null.
     */
    @ApiMethod(name = "getProfile", path = "getprofile", httpMethod = HttpMethod.POST)
//    public Profile getProfile(final User user) throws UnauthorizedException {
    public List<Profile> getProfile(@Named("userEmail") final String userEmail){
//        if (user == null) {
//            throw new UnauthorizedException("Authorization required");
//        }

    	Key<Profile> key = Key.create(Profile.class, userEmail);

    	Query<Profile> query = ofy().load().type(Profile.class).ancestor(key);

    	return query.list();
    }


    @ApiMethod(name="getSkills",path = "getSkills", httpMethod = HttpMethod.POST)
    //TODO public List<Skill> getSkills(final User user)throws UnauthorizedException {
    public List<Skill> getSkills(@Named("userEmail") final String userEmail){
    	//      if (user == null)
    	//        throw new UnauthorizedException("Authorization required");
//    	String composite;
//
//    	composite = skillForm.getEmail()+skillForm.getId();
//   	Key<Skill> key = Key.create(Skill.class, userEmail);
    	//Query<Conference> query = ofy().load().type(Conference.class);
    	Query<Skill> query = ofy().load().type(Skill.class);
    	query = query.filter("email =", userEmail); //.toString()
    	return query.list();

    }
    @ApiMethod(name="addSkill",path = "addSkills", httpMethod = HttpMethod.POST)
   //TODO public Skill addSkill(final User user, SkillForm skillForm)throws UnauthorizedException {
    	//public Skill addSkill(@Named("userEmail") final String userEmail, SkillForm skillForm){
    public Skill addSkill(SkillForm skillForm){
//      if (user == null)
//        throw new UnauthorizedException("Authorization required");
    	String composite;

    	composite = skillForm.getEmail()+skillForm.getId();

    	Skill skill = ofy().load().key(Key.create(Skill.class, composite))
                 .now();
    	 if (skill == null) {

    		 //TODO
    		 skill = new Skill(composite, skillForm.getEmail(), skillForm.getName(), skillForm.getId(), skillForm.getValue(), skillForm.getLevel());

         }
    	 else {
    	        // The Profile entity already exists
    	        // Update the Profile entity
    	        skill.update(skillForm.getEmail(), skillForm.getName(), skillForm.getId(),skillForm.getValue(),skillForm.getLevel());

    	    }
    	 ofy().save().entity(skill).now();
      return skill;
    }
    @ApiMethod(name="getTech",path = "getTechs", httpMethod = HttpMethod.POST)
    //TODO public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public List<Tech> getTechs(@Named("userEmail") final String userEmail){
//      if (user == null)
//        throw new UnauthorizedException("Authorization required");
    	Query<Tech> query = ofy().load().type(Tech.class);
    	System.out.println("RRH:"+userEmail);
    	query = query.filter("email =", userEmail);


    	return query.list();
    }
    @ApiMethod(name="addTech",path = "addTechs", httpMethod = HttpMethod.POST)
    //TODO public Tech addTech(final User user, TechForm techForm)throws UnauthorizedException {
    //public Tech addTech(@Named("userEmail") final String userEmail, TechForm techForm){
    public Tech addTech(TechForm techForm){
//      if (user == null)
//        throw new UnauthorizedException("Authorization required");
    	String composite;

    	composite = techForm.getEmail()+techForm.getId();
    	Tech tech = ofy().load().key(Key.create(Tech.class, composite))
                .now();
   	 if (tech == null) {

   		 //TODO
   		 tech = new Tech(composite, techForm.getEmail(), techForm.getName(), techForm.getId(), techForm.getValue(), techForm.getLevel());


    }else {
        // The Profile entity already exists
        // Update the Profile entity
        tech.update(techForm.getEmail(),techForm.getName(), techForm.getId(),techForm.getValue(),techForm.getLevel());

    }
   	ofy().save().entity(tech).now();
      return tech;
    }


    @ApiMethod(name="getTechCatalog",path = "TechCatalog", httpMethod = HttpMethod.GET)
    //public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public List<TechCatalog> getTechCatalog(){

        Query<TechCatalog> query = ofy().load().type(TechCatalog.class);
      return query.list();
    }
    @ApiMethod(name="setTechCatalog",path = "TechCatalog", httpMethod = HttpMethod.POST)
    //public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public TechCatalog setTechCatalog(TechCatalogForm tech){
    	// Get the Profile from the datastore if it exists
        // otherwise create a new one
    	//TechCatalog tec = ofy().load().key(Key.create(TechCatalog.class, tech.getId()))
        //        .now();
    	TechCatalog tec = new TechCatalog(tech.getName(),tech.getId());
    	ofy().save().entity(tec).now();
      return tec;
    }
    @ApiMethod(name="getSkillCatalog",path = "SkillCatalog", httpMethod = HttpMethod.GET)
    //public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public List<SkillCatalog> getSkillCatalog(){

    	Query<SkillCatalog> query = ofy().load().type(SkillCatalog.class);
        return query.list();

    }
    @ApiMethod(name="setSkillCatalog",path = "SkillCatalog", httpMethod = HttpMethod.POST)
    //public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public SkillCatalog setSkillCatalog(SkillCatalogForm skill){

    	SkillCatalog newSkill = new SkillCatalog(skill.getName(),skill.getId());
    	ofy().save().entity(newSkill).now();
      return newSkill;
    }
    @ApiMethod(name="getProfileCatalog",path = "ProfileCatalog", httpMethod = HttpMethod.GET)
    public List<Profile> getProfileCatalog(final User user)throws UnauthorizedException {
    if (user == null)
      throw new UnauthorizedException("authorization is required");
    	Query<Profile> query = ofy().load().type(Profile.class);
        return query.list();

    }
    @ApiMethod(name="getAllSkills",path = "AllSkills", httpMethod = HttpMethod.POST)
    //public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public List<Skill> getAllSkills(){

    	Query<Skill> query = ofy().load().type(Skill.class);
        return query.list();

    }
    @ApiMethod(name="getAllTechs",path = "AllTechs", httpMethod = HttpMethod.POST)
    //public List<Tech> getTechs(final User user)throws UnauthorizedException {
    public List<Tech> getAllTechs(){

    	Query<Tech> query = ofy().load().type(Tech.class);
        return query.list();

    }

    @ApiMethod(name="getSpreadSheet",path ="SpreadSheet", httpMethod = HttpMethod.GET)
    public List<SpreadsheetEntry>  getSpreadSheet()
    throws UnauthorizedException,GeneralSecurityException,IOException, ServiceException{

      List scopes = Arrays.asList("https://spreadsheets.google.com/feeds");
      AppIdentityService appIdentity = AppIdentityServiceFactory.getAppIdentityService();
      AppIdentityService.GetAccessTokenResult accessToken = appIdentity.getAccessToken(scopes);
      Credential creds = new Credential(
        BearerToken.authorizationHeaderAccessMethod());
      creds.setAccessToken(accessToken.getAccessToken());
      SpreadsheetService service = new SpreadsheetService("DBM4G-demo");

          URL feedUrl = null;

          //try{
              feedUrl = new URL(Constants.SPREADSHEET_IDURL);
        //  }catch(MalformedURLException e){
        //      e.printStackTrace();
        //  }

      //try{
        service.setOAuth2Credentials(creds);
    //  } catch(UnauthorizedException e){
    //    throw new UnauthorizedException("authorization is required");
    //  }
    //  try {
             SpreadsheetFeed feed = service.getFeed(feedUrl, SpreadsheetFeed.class);
             List<SpreadsheetEntry> spreadsheets = feed.getEntries();
            // if(spreadsheets != null)// {
                //   for (SpreadsheetEntry spreadsheet : spreadsheets) {
                //       System.out.println(spreadsheet.getTitle().getPlainText());
                //   }
                return spreadsheets;
      //        }
      //   } catch (ServiceException e) {
      //       e.printStackTrace();
      //   }

}







}
