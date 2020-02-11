package com.lpras.lombok.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "email")
@Data
public class Email implements Serializable {
    private static final long serialVersionUID = 4L;
    String to;
    //String from;
    String subject;
    String body;
    String phone;
}
