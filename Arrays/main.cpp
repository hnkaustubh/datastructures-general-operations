//
//  main.cpp
//  ComplexNumberOperations
//
//  Created by Kaustubh Hassan Narasimhan on 30/09/18.
//  Copyright © 2018 Kaustubh Hassan Narasimhan. All rights reserved.
//

#include <iostream>
#include<fstream>
#include<cstdlib>
using namespace std;
#include "complexArray.hpp"

int main(){
    complexNumber c1,c2,c3,c4,c5,csub;
    
    ifstream inFile;
    inFile.open("input.txt");
    if(inFile.fail()){
        cerr<<"Error opening the Input File input.txt....pls check..."<<endl;
    }
        
    inFile>>c1>>c2>>c3>>c4>>c5;
    
    arrayOfComplexNums ar(10);
    ar.insertAtEnd(c1);
    ar.insertAtEnd(c2);
    ar.insertAtEnd(c3);
    ar.insertAtEnd(c4);
    ar.insertAtEnd(c5);
    ar.deleteAt(2);
    
    ar.printArray();
    
    ofstream outFile;                                                                   // Save Function
    outFile.open("output.txt");
    if(outFile.fail())
        cerr<<"Error opening the Output File output.txt....pls check..."<<endl;
    
    for(int i=0; i<ar.length; i++)
        outFile<<ar.list[i];
    }
























