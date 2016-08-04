'use strict';

/**
 * The root learnicaApp module.
 *
 * @type {learnicaApp|*|{}}
 */
var learnicaApp = learnicaApp || {};

/**
 * @ngdoc module
 * @name controllers
 *
 * @description
 * Angular module for controllers.
 *
 */
learnicaApp.controllers = angular.module('Controllers', ['ui.bootstrap']);

/**
 * @ngdoc Factory
 * @name controllers.factory
 *
 * @description
 * A Factory used for share data between controllers.
 */
learnicaApp.controllers.factory('mainData',function(){
  return {mainEmail:''}
});

/**
 * @ngdoc controller
 * @name AdminSkillMatrixCtrl
 *
 * @description
 * A controller used for the My Admin page.
 */
learnicaApp.controllers.controller('AdminSkillMatrixCtrl',
    function ($scope, $log, oauth2Provider, HTTP_ERRORS) {
      gapi.client.learnicaEndPoints.getProfileCatalog().execute(function (resp) {
        $scope.profiles=resp.items;
      });

      $scope.officeLocation = [
          'Gdl Mx',
          'Poland',
          'USA',
          'England',
      ];

      $scope.ordenarPor = function(orden) {
          $scope.ordenSeleccionado = orden;
        };
      $scope.saveProfile = function(profileForm){
        alert(JSON.stringify(profileForm));
        gapi.client.learnicaEndPoints.saveProfile(profileForm).
          execute(function(resp){
              alert(JSON.stringify(resp.items));
          });

        alert(JSON.stringify(profileForm.displayName));
      }
      $scope.setSelected = function (id) {
        gapi.client.learnicaEndPoints.getSkill({'userEmail': id}).
          execute(function(resp){
            if(!resp.error){
              $scope.skills = [{"name":"cant find skills("+id+")"}];
            }
            //if(resp.err)
            //  alert("cant find skill("+id+")");
          });
        gapi.client.learnicaEndPoints.getTech({'userEmail': id}).
            execute(function(resp){
              if(!resp.error){
                $scope.skills = [{"name":"cant find techs("+id+")"}];
              }
              //if(resp.err)
              //  alert("cant find tech("+id+")");
            });


      };
      $scope.something = function(){ alert("add new skill");};

      $scope.skillCatalog = function(){
        gapi.client.learnicaEndPoints.getSkillCatalog().
          execute(function(resp){
              $scope.skillCat=resp.items;
              //alert(JSON.stringify(resp.items));
          });
      };
      $scope.techCatalog = function(){
        gapi.client.learnicaEndPoints.getTechCatalog().
          execute(function(resp){
              $scope.techCat=resp.items;
              //alert(JSON.stringify(resp.items));
          });
      };
      $scope.saveSkill = function(skillForm){
        //alert($scope.skillName+", "+$scope.skillId);


        //alert(JSON.stringify(skillForm));

        gapi.client.learnicaEndPoints.setSkillCatalog({"id":$scope.skillId,"name":$scope.skillName}).
          execute(function(resp){
            if(!resp.error)
            console.log("new skill :)");
            else
              console.log("no skill add ");
          } );
          // $scope.rootMessages = 'new skill ' + $scope.skillName+' in catalog';
          //  location.reload(); //$window.location.reload();

          //**/
        //alert(JSON.stringify(profileForm.displayName));
        //**/
      }
      $scope.saveTech = function(techForm){
        gapi.client.learnicaEndPoints.setTechCatalog({"id":$scope.techId,"name":$scope.techName}).
          execute(function(resp){
            if(!resp.error)
            console.log("new tech :)");
            else
              console.log("no tech add ");
          } );
      }

    });

/**
 * @ngdoc controller
 * @name MyProfileCtrl
 *
 * @description
 * A controller used for the My Profile page.
 */
learnicaApp.controllers.controller('MyProfileCtrl',
    function ($scope, $log, oauth2Provider, mainData, HTTP_ERRORS) {
        $scope.submitted = false;
        $scope.loading = false;
        /**
         * The initial profile retrieved from the server to know the dirty state.
         * @type {{}}
         */
        $scope.initialProfile = {};

        /**
         * Candidates for the teeShirtSize select box.
         * @type {string[]}
         */

        $scope.officeLocation = [
            'Gdl Mx',
            'Poland',
            'USA',
            'England',

        ];
        /**
         * Initializes the My profile page.
         * Update the profile if the user's profile has been stored.
         */
        $scope.init = function () {
            var retrieveProfileCallback = function () {
                $scope.profile = {};
                $scope.loading = true;
                //alert(mainEmail);
                gapi.client.learnicaEndPoints.getProfile({'userEmail': mainData.mainEmail}).
                    execute(function (resp) {
                        $scope.$apply(function () {
                            $scope.loading = false;
                            if (resp.error) {
                                // Failed to get a user profile.
                            } else {
                              resp.items.forEach( function (items)
                              { $scope.profile.displayName = items.displayName;
                                $scope.profile.jobPosition = items.position;
                                $scope.profile.phone = items.phone;
                                $scope.profile.email = items.email;
                                $scope.profile.skype = items.skype;
                                $scope.profile.officeLocation = items.location;
                              //  alert(JSON.stringify(items.jobPosition);
                              });
                                //alert(JSON.stringify(resp));
                                // Succeeded to get the user profile.
                                // = resp.displayName;
                                /* var displayName
                                var position
                                alert(userEmail);
                                */
                                //$scope.profile.teeShirtSize = resp.result.teeShirtSize;
                                $scope.initialProfile = resp.result;
                            }
                        });
                    }
                );
            };
            if (!oauth2Provider.signedIn) {
                var modalInstance = oauth2Provider.showLoginModal();
                modalInstance.result.then(retrieveProfileCallback);
            } else {
                retrieveProfileCallback();
            }
        };

        /**
         * Invokes the conference.saveProfile API.
         *
         */
        $scope.saveProfile = function () {
            $scope.submitted = true;
            $scope.loading = true;
            alert($scope.profile);






/**
String mainEmail = newProfileForm.getEmail();
//String userId = user.getUserId();
// ProfileForm profileForm = new ProfileForm("Doge","Software Eng","123456789","doge@gmail.com", "doge.mobica", "gdl");

String displayName = newProfileForm.getDisplayName();
String position = newProfileForm.getPosition();
String phone = newProfileForm.getPhone();
String skype = newProfileForm.getSkype();
String location = newProfileForm.getLocation();

this.displayName = displayName;
this.position = position;
this.phone = phone;
this.email = email;
this.skype = skype;
this.location = location;

**/
          gapi.client.learnicaEndPoints.saveProfile({"displayName":$scope.profile.displayName,"position":$scope.profile.jobPosition,
          "phone":$scope.profile.phone,"email":$scope.profile.email,"skype":$scope.profile.skype,"location":$scope.profile.officeLocation}).
                execute(function (resp) {
                    $scope.$apply(function () {
                        $scope.loading = false;
                        if (resp.error) {
                            // The request has failed.
                            var errorMessage = resp.error.message || '';
                            $scope.messages = 'Failed to update a profile : ' + errorMessage;
                            $scope.alertStatus = 'warning';
                            $log.error($scope.messages + 'Profile : ' + JSON.stringify($scope.profile));

                            if (resp.code && resp.code == HTTP_ERRORS.UNAUTHORIZED) {
                                oauth2Provider.showLoginModal();
                                return;
                            }
                        } else {
                            // The request has succeeded.
                            $scope.messages = 'The profile has been updated';
                            $scope.alertStatus = 'success';
                            $scope.submitted = false;
                            $scope.initialProfile = {
                                displayName: $scope.profile.displayName,
                                teeShirtSize: $scope.profile.teeShirtSize
                            };
                            $log.info($scope.messages + JSON.stringify(resp.result));
                        }
                    });
                });
        };
    })
;

/**
 * @ngdoc controller
 * @name ShowSkillMatrixCtrl
 *
 * @description
 * A controller used for the Show the Skill Matrix of the singned User.
 */
learnicaApp.controllers.controller('ShowSkillMatrixCtrl',
function ($scope, $log, oauth2Provider,mainData, HTTP_ERRORS){
  $scope.types = [{ name:'Skill' }, {name:'Tech'},];
  $scope.init = function () {
  var Callback = function () {
  $scope.profile = {};
  $scope.loading = true;

  alert("skills("+mainData.mainEmail+")");
  gapi.client.learnicaEndPoints.getSkill({'userEmail':mainData.userEmail}).
  execute(function(resp){
    if(resp.error){
      alert("no skills("+mainData.mainEmail+")");
      //console.log("fail to get <skill> list, using dummies skills ");+JSON.stringify(resp.items)
      $scope.skills= [{ name: "skill list 0", hecho:true },
                           { name: "skill list 1", hecho:true },
                           { name: "skill list 2", hecho:true },
                           { name: "skill list 3", hecho:true },
                           { name: "skill list 4", hecho:true },  ];
    } else {
      $scope.skills = resp.items; }
    });
  //alert(mainData.mainEmail);
  //var stringMail = mainData.mainEmail;
  //alert("get profile "+ mainEmail);
  gapi.client.learnicaEndPoints.getTech({'userEmail': mainData.mainEmail}). //String(mainEmail)
    execute(function (resp) {
      if(resp.error){
        //console.log("fail to get <tech> list,  using dummies techs");
        $scope.techs =  [{ name: "tech list 0", hecho:true },
                             { name: "tech list 1", hecho:true },
                             { name: "tech list 2", hecho:true },
                             { name: "tech list 3", hecho:true },
                             { name: "tech list 4", hecho:true },  ];
      } else {
        $scope.skills = resp.items;
      }
      //alert(JSON.stringify(resp));
      //alert(JSON.stringify(resp.items));
      //alert(JSON.stringify(resp.items[0]));
      //var userEmail;
      //resp.items.forEach( function (items)
      //{   userEmail = items.email;
      //    alert(userEmail);
      //});

      //var obj = JSON.stringify(resp.items);
          //alert(obj);
        //  $scope.skill=resp.items;


        /*************************************
        /$scope.$apply(function () {
        /*  $scope.loading = false;
          if (resp.error) {
            alert("Failed to get a user profile.");
          } else {
            alert("resp.success profile");

        gapi.client.learnicaEndPoints.getSkill().
          execute(function (resp) {
              alert(JSON.stringify(resp.items));
              //alert(objects);
              $scope.skills=resp.items;

              resp.items.forEach( function (items)
              {   // add to table
                  var x = items.name;
                  var y = items.value;
                  alert(x+","+y);
              });

            });
        //}
        //});
        *************************************
        **/




    }
    );
    };
    if (!oauth2Provider.signedIn) {
    var modalInstance = oauth2Provider.showLoginModal();
    modalInstance.result.then(Callback);
    } else { Callback(); }
    };


function addType(){
    //$scope.skills.push({name:$scope.skillName,  hecho:false});
    //$scope.skillName="";
    alert("addType function");
    alert("addForm: "+$scope.FormModel.type +", "+ $scope.FormModel.catalog);
    //$dialog.dialog({}).open('addForm.html');

};

$scope.getCatalog = function() {
    if(document.getElementById("typeSelected").value == 0) {
      gapi.client.learnicaEndPoints.getSkillCatalog().
        execute(function(resp){
          //alert(JSON.stringify(resp.items));
          //document.getElementById("catalog").value="";
          $scope.catalogs=resp.items; });
    } else {
      gapi.client.learnicaEndPoints.getTechCatalog().
        execute(function(resp){
          //document.getElementById("catalog").value="";
          //alert(JSON.stringify(resp.items));
          $scope.catalogs=resp.items; });
    }
}

/*
$scope.addSkill = function(){
    alert ("Add Skill!");

    gapi.client.learnicaEndPoints.getSkillCatalog().
      execute(function(resp){
        $scope.skillCatalog;
        var objects = JSON.stringify(resp.items);
        alert(objects);
      });

    gapi.client.learnicaEndPoints.getTechCatalog().
        execute(function(resp){
          $scope.techsCatalog;
          var objects = JSON.stringify(resp.items);
          alert(objects);
        });


  };
* */



});

/**
 * @ngdoc controller
 * @name ProfileCatalogCtrl
 *
 * @description
 * The controller get a list of profile elements
 * it require user authentication.
 *
 */


learnicaApp.controllers.controller('ProfileCatalogCtrl',
function ($scope, $log, oauth2Provider,mainData, HTTP_ERRORS){
  gapi.client.learnicaEndPoints.getProfileCatalog().
  execute(function(resp){
    if(resp.error)
      alert("getProfileCatalog fail!");
   else
      //$scope.profileCatalog = resp.items;
      alert(resp.items);
    } );
});





/**
 * @ngdoc controller
 * @name RootCtrl
 *
 * @description
 * The root controller having a scope of the body element and methods used in the application wide
 * such as user authentications.
 *
 */
learnicaApp.controllers.controller('RootCtrl', function ($scope, $location,mainData, oauth2Provider) {

    /**
     * Returns if the viewLocation is the currently viewed page.
     *
     * @param viewLocation
     * @returns {boolean} true if viewLocation is the currently viewed page. Returns false otherwise.
     */
    $scope.isActive = function (viewLocation) {
        return viewLocation === $location.path();
    };

    /**
     * Returns the OAuth2 signedIn state.
     *
     * @returns {oauth2Provider.signedIn|*} true if siendIn, false otherwise.
     */
    $scope.getSignedInState = function () {
        return oauth2Provider.signedIn;
    };

    /**
     * Calls the OAuth2 authentication method.
     */
    $scope.signIn = function () {
        oauth2Provider.signIn(function () {
            gapi.client.oauth2.userinfo.get().execute(function (resp) {
                $scope.$apply(function () {
                    if (resp.email) {
                      mainData.mainEmail =resp.email;
                        oauth2Provider.signedIn = true;
                        $scope.alertStatus = 'success';
                        $scope.rootMessages = 'Logged in with ' + resp.email;
                    }
                });
            });
        });
    };

    /**
     * Render the signInButton and restore the credential if it's stored in the cookie.
     * (Just calling this to restore the credential from the stored cookie. So hiding the signInButton immediately
     *  after the rendering)
     */
    $scope.initSignInButton = function () {
        gapi.signin.render('signInButton', {
            'callback': function () {
                jQuery('#signInButton button').attr('disabled', 'true').css('cursor', 'default');
                if (gapi.auth.getToken() && gapi.auth.getToken().access_token) {
                    $scope.$apply(function () {
                        oauth2Provider.signedIn = true;
                    });
                }
            },
            'clientid': oauth2Provider.CLIENT_ID,
            'cookiepolicy': 'single_host_origin',
            'scope': oauth2Provider.SCOPES
        });
    };

    /**
     * Logs out the user.
     */
    $scope.signOut = function () {
        oauth2Provider.signOut();
        $scope.alertStatus = 'success';
        $scope.rootMessages = 'Logged out';
    };

    /**
     * Collapses the navbar on mobile devices.
     */
    $scope.collapseNavbar = function () {
        angular.element(document.querySelector('.navbar-collapse')).removeClass('in');
    };

});


/**
 * @ngdoc controller
 * @name OAuth2LoginModalCtrl
 *
 * @description
 * The controller for the modal dialog that is shown when an user needs to login to achive some functions.
 *
 */
learnicaApp.controllers.controller('OAuth2LoginModalCtrl',
    function ($scope, $modalInstance, $rootScope,mainData, oauth2Provider) {
        $scope.singInViaModal = function () {
            oauth2Provider.signIn(function () {
                gapi.client.oauth2.userinfo.get().execute(function (resp) {
                    $scope.$root.$apply(function () {
                        mainData.mainEmail =resp.email;
                        oauth2Provider.signedIn = true;
                        $scope.$root.alertStatus = 'success';
                        $scope.$root.rootMessages = 'Logged in with ' + resp.email;
                    });
                    $modalInstance.close();
                });
            });
        };
    });
