package com.zik.cabbookuser.services;

import com.zik.cabbookuser.config.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class LocationService {
    @Autowired
    private EmailSender emailSender;
    @KafkaListener(topics = "cab-location",groupId = "user-group")
    public void cabLocation(String location){
        emailSender.sendEmail(location);
        System.out.println(location);
    }
}
