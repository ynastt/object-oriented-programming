#include "Matrix.h"
#include <iostream>
#include <vector>
#include <cassert>
using namespace std;

template<int M, int N>
Matrix<M,N>::Matrix(){
    mat.resize(M);
    for(int i=0;i<M;i++)
        for(int j=0;j<N;j++)
            mat[i].push_back(i*N+j);
}

template<int M, int N>
int& Matrix<M,N>::at(int i, int j){
    assert(i >= 0 && i < M && j >= 0 && j < N );
    return mat[i][j];
}

//template< template<int , int> class Matrix, int M, int N>
template <int M, int N>
void Matrix<M,N>::square(Matrix<M,N>& c,Matrix<M,N>& a){
//void square ( Matrix<M,N>&c, Matrix<M,N>& a){
    if(M != N) cout<<"Matrix dimencions should be same"<<endl;
    else{
        Matrix<M,N> res;
        for(int i = 0; i<M; i++) {
            for(int l = 0; l<M; l++) {
                res.at(i,l) = 0;
                for (int j = 0; j<M; j++) {
                    res.at(i,l) += a.at(i,j) * a.at(j,l);
                }
            }
        }
        c = res;
    }
}