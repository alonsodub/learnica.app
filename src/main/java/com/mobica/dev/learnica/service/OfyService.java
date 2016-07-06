package com.mobica.dev.learnica.service;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.mobica.dev.learnica.domain.Profile;
import com.mobica.dev.learnica.domain.Skill;
import com.mobica.dev.learnica.domain.SkillCatalog;
import com.mobica.dev.learnica.domain.Tech;
import com.mobica.dev.learnica.domain.TechCatalog;

/**
 * Custom Objectify Service that this application should use.
 */
public class OfyService {
    /**
     * This static block ensure the entity registration.
     */
    static {
        // factory().register(Conference.class);
        factory().register(Profile.class);
        factory().register(SkillCatalog.class);
        factory().register(TechCatalog.class);
        factory().register(Skill.class);
        factory().register(Tech.class);
        
    }

    /**
     * Use this static method for getting the Objectify service object in order to make sure the
     * above static block is executed before using Objectify.
     * @return Objectify service object.
     */
    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    /**
     * Use this static method for getting the Objectify service factory.
     * @return ObjectifyFactory.
     */
    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
