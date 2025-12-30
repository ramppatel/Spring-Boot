package com.ram.journalApp.service;

import com.ram.journalApp.entity.JournalEntry;
import com.ram.journalApp.entity.User;
import com.ram.journalApp.repository.JournalEntryRepository;
import com.ram.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service   // ✅ Better than @Component for service layer
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
        // ✅ Save entry into MongoDB
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }

    public void deleteByUserName(String userName){
        userRepository.deleteByUserName(userName);
    }
}


// controller -> service -> repository