/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Driver.cpp
 * Author: Cierra
 *
 * Created on March 1, 2018, 9:37 PM
 */

#include <iostream>
#include <cstdlib>
#include <thread>
#include <chrono>
#include "VictorSP.h"

using namespace std;
int counter = 0;
int iteration = 0;

void drive(int number_of_motors, VictorSP left[], VictorSP right[], double leftspeed, double rightspeed, bool reverseleft, bool reverseright, int durationOfTravel);

/*
 * 
 */



int main(int argc, char** argv) {

    while (iteration<500) {
        VictorSP leftmotor1 = VictorSP(0);
        VictorSP leftmotor2 = VictorSP(1);
        VictorSP leftmotor3 = VictorSP(2);
        VictorSP rightmotor1 = VictorSP(3);
        VictorSP rightmotor2 = VictorSP(4);
        VictorSP rightmotor3 = VictorSP(5);

        VictorSP leftmotors[3] = {leftmotor1, leftmotor2, leftmotor3};
        VictorSP rightmotors[3] = {rightmotor1, rightmotor2, rightmotor3};

        drive(3, leftmotors, rightmotors, 896, 675, false, true, 5);  
        
        iteration++;
        std::this_thread::sleep_for (std::chrono::milliseconds(20));
    }
   
    
}

// number_of_motors is the number of motors per side, not in total
void drive(int number_of_motors, VictorSP left[], VictorSP right[], double leftspeed, double rightspeed, bool reverseleft, bool reverseright, int durationOfTravel) {
    
    if(counter < durationOfTravel*50) {
        
        for (int i = 0; i < number_of_motors; i++) {
            
            if(reverseleft) {
                leftspeed = -leftspeed;
            }
            left[i].set(leftspeed);
        
            if(reverseright) {
                rightspeed = -rightspeed;
            }
            right[i].set(rightspeed);
            
            std::cout << "The robot is moving." << std::endl;
        }     
        
    }
    else {
        for (int i = 0; i < number_of_motors; i++) {
            left[i].set(0.0);
            right[i].set(0.0);
        }
        std::cout << "The robot has stopped." << std::endl;
    }    
        
    counter++;
    std::cout << counter << std::endl;
    
}