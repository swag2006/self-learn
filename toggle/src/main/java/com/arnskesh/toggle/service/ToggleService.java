package com.arnskesh.toggle.service;

import com.arnskesh.toggle.features.AppFeature;
import com.arnskesh.toggle.vo.GreetingsEntity;
import org.springframework.stereotype.Service;
import org.togglz.core.Feature;
import org.togglz.core.context.FeatureContext;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@Service
public class ToggleService {



    public GreetingsEntity getMessage() {

        GreetingsEntity greetingsEntity = new GreetingsEntity();
        greetingsEntity.setGreeting("NO FEATURE FOUND");
        return greetingsEntity;
//
//        if( AppFeature.FEATURE_ONE.isActive() ) {
//            greetingsEntity.setGreeting("Hello This is FIRST FEATURE");
//            return greetingsEntity;
//        } else if (AppFeature.FEATURE_TWO.isActive()) {
//            greetingsEntity.setGreeting("Hello This is SECOND FEATURE");
//            return greetingsEntity;
//        }else {
//            greetingsEntity.setGreeting("NO FEATURE FOUND");
//            return greetingsEntity;
//        }

    }
}
