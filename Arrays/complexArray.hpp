//
//  complexArray.hpp
//  ComplexNumberOperations
//
//  Created by Kaustubh Hassan Narasimhan on 30/09/18.
//  Copyright © 2018 Kaustubh Hassan Narasimhan. All rights reserved.
//

#ifndef complexArray_hpp
#define complexArray_hpp

#include <stdio.h>
#include<iostream>
using namespace std;

#endif /* complexArray_hpp */

class complexNumber{
    friend ostream& operator<<(ostream&,complexNumber&);
    friend istream& operator>>(istream&,complexNumber&);
private:
    float real;
    float imaginary;
    
public:
    void print();
    complexNumber(float real = 0,float imaginary = 0);
    complexNumber operator-(complexNumber&);
};

#define MAX_SIZE 10
class arrayOfComplexNums{
public:
    complexNumber list[MAX_SIZE];
    int length;
    int maxSize;
    
public:
    void printArray();
    void insertAtEnd(complexNumber&);
    void deleteAt(int);
    arrayOfComplexNums(int);
};
