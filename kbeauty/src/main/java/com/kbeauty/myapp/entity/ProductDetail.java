package com.kbeauty.myapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_details")
@Getter @Setter
@NoArgsConstructor
public class ProductDetail {
	
	@Id
    private Long detailId;
    private Long productId;
    private String detailImages;
    private Integer sortOrder;

}