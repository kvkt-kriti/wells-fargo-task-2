package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;


    protected Portfolio() {

    }

    public Portfolio(String creationDate) {
        this.creationDate = creationDate;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDateName() {
        return creationDate;
    }

    public void setCreationDateName(String firstName) {
        this.creationDate = creationDate;
    }
}
