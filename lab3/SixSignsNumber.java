/*Класс, представляющий шестизначный номер, который составлен из десятичных цифр,
 с порядком на основе счастливости номера.
 Счастливость определяется разностью сумм цифр левой и правой половины номера*/
public class SixSignsNumber implements Comparable<SixSignsNumber>{
    int n, d;
    public SixSignsNumber(int n) {
        this.n = n;
        difference(n);
    }
    //int getDiff() {return d;}
    //count the difference
    public int difference(int n) {
        int  left, right;
        right = n%10 + n/10%10 + n/100%10;
        n/=1000;
        left = n%10 + n/10%10 + n/100%10;
        d = left - right;
        return d;
    }
    public int compareTo(SixSignsNumber obj) {
        return this.d - obj.d;
    }
}
