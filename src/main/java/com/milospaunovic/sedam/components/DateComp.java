/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milospaunovic.sedam.components;

import java.util.Date;

/**
 *
 * @author Paun
 */
public class DateComp {
    public String getDatum(){
        return new Date().toString();
    }
}
