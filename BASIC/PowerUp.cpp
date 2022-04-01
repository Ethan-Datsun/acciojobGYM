#include <iostream>
using namespace std;
int main() {
    int base, expo;
    long long result = 1.0;
    while (expo!= 0) {
        result *= base;
        --expo;
    }
    cout<<result;
    return 0;
}