package com.aml.auth.profile;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tab_profile")
@Data
public class ProfileEntity {
    @Id
    private String id;
    private String label;
    private String description;
}
