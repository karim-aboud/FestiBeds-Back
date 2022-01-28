package fr.uga.miage.m1.festibeds.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Region {

    @Id
    String nomRegion;

    @OneToMany
    @JoinColumn(name = "nomRegion")
    List<Festival> festivals = new ArrayList<>();
    
}
