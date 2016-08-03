package com.mobica.dev.learnica.constants;

import com.google.api.server.spi.Constant;

/**
 * Contains the client IDs and scopes for allowed clients consuming the conference API.

 public static final String WEB_CLIENT_ID = "114294263067-fvd6rjsl439gbas8ta8dfb87feda089b.apps.googleusercontent.com";
 public static final String ANDROID_CLIENT_ID = "114294263067-fvd6rjsl439gbas8ta8dfb87feda089b.apps.googleusercontent.com	";
 public static final String IOS_CLIENT_ID = "AIzaSyD67GSJOx2E917ccYOywYpuRbuDVi5AzKU";

<! ---------------- >
cliente learnica gold

public static final String WEB_CLIENT_ID = "1042909630422-8me3vdutp6k21cl8crc57atoq9jcf2uj.apps.googleusercontent.com";
public static final String ANDROID_CLIENT_ID = "1042909630422-j8rekseuctet6ebdco9vmrg7puusuovl.apps.googleusercontent.com";
public static final String IOS_CLIENT_ID = "";
<!----------------- >
 */
public class Constants {                    //1042909630422-8me3vdutp6k21cl8crc57atoq9jcf2uj.apps.googleusercontent.com
  public static final String WEB_CLIENT_ID = "1042909630422-8me3vdutp6k21cl8crc57atoq9jcf2uj.apps.googleusercontent.com";
  public static final String ANDROID_CLIENT_ID = "1042909630422-jq3este9mmpv5pevo1ji5eg84hu58oa0.apps.googleusercontent.com";
  public static final String IOS_CLIENT_ID = "";
  public static final String SERVICE = "ec54e51e8a39a028e6e937e7ee11baef39c0792f";
  public static final String SPREADSHEET_SCOPE= "'https://www.googleapis.com/auth/drive','https://spreadsheets.google.com/feeds','https://docs.google.com/feeds'";
  //"https://docs.google.com/spreadsheets/d/1cbjIOx8-622sX_1RdxP2zMNEBfPdKEUf6wJ_zLznP98/edit?usp=sharing";

  public static final String SPREADSHEET_IDURL = "https://spreadsheets.google.com/feeds/spreadsheets/private/full/";
  public static final String SPREADSHEET = "1cbjIOx8-622sX_1RdxP2zMNEBfPdKEUf6wJ_zLznP98";
  public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID; //ANDROID_CLIENT_ID
  public static final String IOS_AUDIENCE = WEB_CLIENT_ID; //ANDROID_CLIENT_ID
  public static final String EMAIL_SCOPE = Constant.API_EMAIL_SCOPE;
  public static final String API_EXPLORER_CLIENT_ID = Constant.API_EXPLORER_CLIENT_ID;
  public static final String MEMCACHE_ANNOUNCEMENTS_KEY = "RECENT_ANNOUNCEMENTS";

}
