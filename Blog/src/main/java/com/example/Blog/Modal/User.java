package com.example.Blog.Modal;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

                                                                                                                                                                                                                                                                                                      
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "users")
public class User {
    @Id

    private String id;

    private String name;
    private String title;
    private String content;
    private Date publishedDate = new Date(System.currentTimeMillis());

}
