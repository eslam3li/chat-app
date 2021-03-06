/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.common;

import java.io.Serializable;


public enum GenderEnum implements Serializable {
    MALE("male"),
    FEMALE("female");
    String gender;

    private GenderEnum(String gender) {
        this.gender = gender;
    }

    public String getGender(GenderEnum genderEnum) {
        return genderEnum.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
