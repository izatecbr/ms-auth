package com.iza.access.user;

import com.iza.access.Session;
import com.iza.access.profile.ProfileEntity;
import com.iza.access.profile.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private ProfileRepository profileRepository;
    public Session login(String login){
        Session session = new Session();
        session.setLogin(login);
        UserEntity user = repository.findById(login).orElse(null);
        ProfileEntity profile = profileRepository.findById(user.getProfile()).orElse(null);
        session.setRoles(profile.getRoles());
        return session;
    }
}
