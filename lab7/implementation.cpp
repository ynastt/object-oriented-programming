//файл с определениями методов класса
#include "declaration.h"
#include <iostream>
#include <cmath>

using namespace std;
//конструктор классa
// new_deg - степень создаваемого полинома
Polynom::Polynom(int new_deg) {
    deg = new_deg;
    koef = new int[deg+1];
}

//деструктор
Polynom::~Polynom() {
    delete [] koef;
}

//копирующий конструктор
Polynom::Polynom(const Polynom &p) {
    this->deg = p.deg;
    this->koef = new int[this->deg + 1];
    for (int i = 0; i <= deg; i++) {
        koef[i] = p.koef[i];
    }
}

//оператор присваивания
Polynom &Polynom::operator= (const Polynom &p) {
    this->deg = p.deg;
    this->koef = new int[this->deg + 1];
    for (int i = 0; i <= deg; i++) {
        koef[i] = p.koef[i];
    }
    return *this;
}
//1.вычисление значения полинома для заданного x
int Polynom::value(int v) {
    int val = koef[0];
    for( int i = 1; i <= deg; i++)
        val += koef[i] * pow(v,i);
    return val;
}

//2.получение степени полинома
int Polynom::degree() {
    return deg;
}

//3.получение ссылки на указанный коэффициент
int &Polynom::operator[](int index) {
    return (this)->koef[index];
}

int &Polynom::access(int i) {
    if (i<=deg)
        return koef[i];
    else {
        cout << "Error" << endl;
    }
}

ostream &operator<< (ostream& os, const Polynom& a) {
        if (a.koef[0] != 0)
            os << a.koef[0] << " ";
        else os << "0" << " ";
        for(int i = 1; i < a.deg + 1; i++) {
            if (a.koef[i]==0)
                continue;
            else {
                if (a.koef[i]<0)
                    os << "-" << " " << a.koef[i] << "*" << "x^" << i << " ";
                else os << "+" << " " << a.koef[i] << "*" << "x^" << i << " ";
            }
        }
        os << endl;
        return os;
}

//4.домножение на полином
Polynom Polynom::mul(Polynom g) {
    int d = g.degree() + this->deg;
    Polynom help(d);
    for(int i = 0; i <=d; i++) 
        help.koef[i] = 0;
    for (int i=0; i<= this->deg; i++) {
        for(int j = 0; j <= g.deg; j++){
            help.koef[i + j] += g.koef[j] * koef[i];
        }
    }
    return help;
}
    
Polynom Polynom::operator* ( Polynom &obj) {
        return Polynom(this->mul(obj));
}