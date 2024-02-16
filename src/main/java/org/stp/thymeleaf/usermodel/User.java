package org.stp.thymeleaf.usermodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table (name = "users")
public class User {

    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;
    private boolean married;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birthday;
    @Id
    private Long id;
}


