package com.Sainz.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

    /*
 - id
- Brand
- Model
- Date of Manufacture (you should be able to use this as a date)
- In stock (this should be a boolean value)
    */

    @Entity
    public class Toy implements Serializable {

        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        private long id;
        private String model;
        private String brand;
        //(you should be able to use this as a date - see below...)
        private String Date;
        private boolean inStock;

public Toy() {
}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            Date = date;
        }

        public boolean isInStock() {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }
    }
