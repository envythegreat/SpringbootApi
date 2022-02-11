package com.productapi.productapi.model;

import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Document("Products")
public class Product {
    @Id
    private String id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private double rating;
    private Date createdAt;

    public Product(String title,
                   double price,
                   String description,
                   String category,
                   String image,
                   double rating
    )
    {
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
        this.createdAt = new Date();
    }
}
