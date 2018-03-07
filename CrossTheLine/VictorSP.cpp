/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VictorSP.cpp
 * Author: Cierra
 * 
 * Created on March 2, 2018, 6:53 PM
 */

#include <iostream>
#include "VictorSP.h"
    
    VictorSP::VictorSP(int PWM) {
        this->motorPin = PWM;
    }
    
    void VictorSP::set(float speed) {
        std::cout << "The speed is " << speed << std::endl;
    }

    VictorSP::~VictorSP() {
    }

