package com.aml.auth.profile;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tab_profile")
@Data
public class ProfileEntity {
    @Id
    private String id;
    private String label;
    private String description;
    @ElementCollection
    @CollectionTable(schema = "public", name="tab_profile_role",
            joinColumns=@JoinColumn(name="profile")
    )
    @Column(name = "role")
    private List<String> roles;
}
