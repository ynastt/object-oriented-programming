//объявлением класса Полином степени n
#include <iostream>
using namespace std;
class Polynom{
private:
    int deg; //степень полинома
    int *koef; //указатель на массив коэффициентов полинома
                //koef[i] - коэффициент при i-й степени
public:
    Polynom(int n); //конструктор класса
    //1.вычисление значения для заданного x
    int value(int x);
    //2.получение степени полинома
    int degree();
    //3.получение ссылки на указанный коэффициент полинома
    int& access(int i);
    int& operator[] (int index);
    //4.домножение на полином
    Polynom operator * ( Polynom &P) ; //оператор умножения двух полиномов
    Polynom mul(Polynom i);
    
    Polynom(const Polynom &obj); //копирующий контсруктор
    virtual ~ Polynom();//деструктор
    Polynom& operator = (const Polynom &P); //оператор присваивания
    friend ostream &operator<< (ostream &os, const Polynom &a);
};