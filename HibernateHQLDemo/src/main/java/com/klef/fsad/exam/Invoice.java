package com.klef.fsad.exam;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "invoice")
public class Invoice 
{
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private String status;

    // Default Constructor
    public Invoice() 
    {
        
    }

    // Parameterized Constructor
    public Invoice(int id, String name, String date, String status) 
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }
}