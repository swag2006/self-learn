package com.arnskesh.toggle.config;

import com.arnskesh.toggle.features.AppFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.user.UserProvider;

import java.util.stream.Collectors;

@Configuration
public class TogglzConfiguration {


}