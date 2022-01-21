#include <iostream>

#include "Matrix.cpp"
//#include "Matrix.h"
using namespace std;

int main()
{
	Matrix < 2, 3 > A;
	cout<<"Matrix A:"<<endl;
	for(int i = 0; i < 2; i++){
    		for(int j = 0; j < 3; j++)
        		cout<<A.at(i,j)<<" ";
    		cout<<endl;
    	}
	cout << "A[0][1] = " << A.at (0, 1) << endl;
	cout << "A[1][2] = " << A.at (1, 2) << endl;
	Matrix<2,2> B;
  	cout<<"Matrix B:"<<endl;
  	for (int i = 0; i < 2; i++){
    		for(int j = 0; j < 2; j++)
        		cout<<B.at(i,j)<<" ";
    		cout<<endl;
    	}
  	Matrix<2,2> C;
  	B.square(C, B);
  	cout<< "B^2 = " << endl;
  	for(int i = 0; i < 2; i++){
    		for(int j = 0; j < 2; j++)
        		cout<<C.at(i,j)<<" ";
		cout<<endl;
	}	
	cout<< "A^2 = " << endl;
	Matrix < 2, 3 > D;
    	A.square (D, A);
	return 0;
}