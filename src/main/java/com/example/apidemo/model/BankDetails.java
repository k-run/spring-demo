package com.example.apidemo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by karanc on 14-02-2019.
 */
@Entity
@Table(name  = "bank_details")

@EntityListeners(AuditingEntityListener.class)

public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bank_id;

    @Column(name = "bank_name")
    private String bank_name;

    @Column(name = "bank_ifsc")
    private String bank_ifsc;

    @Column(name = "bank_branch")
    private String bank_branch;

    @Column(name = "bank_address")
    private String bank_address;

    @Column(name = "bank_city")
    private String bank_city;

    @Column(name = "bank_district")
    private String bank_district;

    @Column(name = "bank_state")
    private String bank_state;

    public Long getBank_id() {
        return bank_id;
    }

    public void setBank_id(Long bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_ifsc() {
        return bank_ifsc;
    }

    public void setBank_ifsc(String bank_ifsc) {
        this.bank_ifsc = bank_ifsc;
    }

    public String getBank_branch() {
        return bank_branch;
    }

    public void setBank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    public String getBank_address() {
        return bank_address;
    }

    public void setBank_address(String bank_address) {
        this.bank_address = bank_address;
    }

    public String getBank_city() {
        return bank_city;
    }

    public void setBank_city(String bank_city) {
        this.bank_city = bank_city;
    }

    public String getBank_district() {
        return bank_district;
    }

    public void setBank_district(String bank_district) {
        this.bank_district = bank_district;
    }

    public String getBank_state() {
        return bank_state;
    }

    public void setBank_state(String bank_state) {
        this.bank_state = bank_state;
    }
}
