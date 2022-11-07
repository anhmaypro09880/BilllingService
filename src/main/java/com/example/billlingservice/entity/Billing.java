package com.example.billlingservice.entity;



import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Billing")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Billing implements Serializable {
    @Id
    private int bid;
    private String name;
    private String price;
    @Column(name = "passenger_id")
    private int passengerId;
}
