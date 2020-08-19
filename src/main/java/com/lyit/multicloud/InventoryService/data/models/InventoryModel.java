package com.lyit.multicloud.InventoryService.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import lombok.*;

@Table
@Entity
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class InventoryModel {

    @Id
    @GeneratedValue
    private UUID id;
    private String category;

    private String inventoryName;

    private String inventoryCount;

    private String priceModel;

    }
}