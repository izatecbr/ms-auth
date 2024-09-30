package com.aml.auth.feature;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tab_feature")
@Data
public class FeatureEntity {
    @Id
    private String id;
    private String label;
    private String description;
}
