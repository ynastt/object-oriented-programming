#include <vector>

using namespace std;

template <int M, int N>
class Matrix
{
private:
    vector< vector <int> > mat;
public:
    Matrix();
    int& at(int i, int j);
    void square(Matrix<M,N>&c, Matrix<M,N>& a);
};