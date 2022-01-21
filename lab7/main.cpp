/*Полином степени n с целочисленными
коэффициентами и операциями:
1. вычисление значения для заданного x;
2. получение степени полинома;
3. получение ссылки на указанный
коэффициент полинома;
4. домножение на полином.*/
#include <iostream>
#include "declaration.h"

using namespace std;

void newValue(Polynom X) {
    X.access(1) = 5; //ссылка на указанный коэффициент 
    cout<<X;
}

int main() {
    int n, m;
    cout<<"Введите степень полинома: ";
    cin >> n;
    Polynom polynom1(n);
    Polynom z(n);
    cout<<"Введите коэффициенты полинома: ";
    for(int i = 0; i <= n; i++) {
        cin >> polynom1[i];//ссылка на указанный коэффициент 
    }
    cout << "A(x): " << polynom1;
    cout <<"Полученная степень полинома: "<<polynom1.degree()<<endl;
    cout <<"Значение полинома для x = 10: "<< polynom1.value(10) << endl;
    cout << "Проверка работы функции" << endl;
    z = polynom1;//присвоим объект класса переменной
    newValue(polynom1);//передаем объект функции
    cout << z;
    cout<<"==Умножение полиномов=="<<endl;
    cout<<"Создайте второй полином: введите степень и коэффициенты"<<endl;
    cin>>m;
    Polynom polynom2(m);
    for(int j = 0; j <= m; j++) {
        cin >> polynom2[j];//ссылка на указанный коэффициент 
    }
    cout<<"B(x): "<<polynom2<<" степень B(x): "<< polynom2.degree()<<endl;
    cout<<"mul"<<endl;
    cout<<polynom1.mul(polynom2)<<endl;
    cout<<"operator*"<<endl;
    cout <<"До умножения "<<polynom2;
    polynom2 =  polynom2 * polynom1;
    cout <<"После умножения "<< polynom2;
    cout << "Закончил!" << endl;
    return 0;
}