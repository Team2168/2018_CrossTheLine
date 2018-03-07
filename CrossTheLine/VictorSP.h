/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VictorSP.h
 * Author: Cierra
 *
 * Created on March 2, 2018, 6:53 PM
 */

#ifndef VICTORSP_H
#define VICTORSP_H

class VictorSP {
public:
    VictorSP(int PWM);
    ~VictorSP();
    void set(float speed);
    
private:
    int motorPin;
};

#endif /* VICTORSP_H */

