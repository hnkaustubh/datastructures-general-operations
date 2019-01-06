//
//  complexArray.cpp
//  ComplexNumberOperations
//
//  Created by Kaustubh Hassan Narasimhan on 30/09/18.
//  Copyright © 2018 Kaustubh Hassan Narasimhan. All rights reserved.
//

#include "complexArray.hpp"

ostream& operator<<(ostream& os,complexNumber& c){
    os<<"("<<c.real<<","<<c.imaginary<<")"<<endl;
    return os;
}

istream& operator>>(istream& is,complexNumber& c){
    char ch;
    is>>ch;
    is>>c.real;
    is>>ch;
    is>>c.imaginary;
    is>>ch;
    return is;
}

void complexNumber::print(){
    cout<<"("<<real<<","<<imaginary<<")"<<endl;
}

complexNumber::complexNumber(float real,float imaginary){
    real = real;
    imaginary = imaginary;
}

complexNumber complexNumber::operator-(complexNumber& c){
    complexNumber tempComp;
    tempComp.real = real - c.real;
    tempComp.imaginary = imaginary - c.imaginary;
    return tempComp;
}


void arrayOfComplexNums::printArray(){                                                          // Print Function
    for(int i=0; i<length; i++)
        list[i].print();
}

void arrayOfComplexNums::insertAtEnd(complexNumber& c){                                         // Add Function
    list[length] = c;
    length++;
}

void arrayOfComplexNums::deleteAt(int loc){                                                     // Delete Function
    for(int i=loc; i<length-1; i++)
        list[i] = list[i+1];
    length--;
}

arrayOfComplexNums::arrayOfComplexNums(int size){
    maxSize = size;
    length = 0;
    //    list[maxSize];
    assert(list != NULL);
}
