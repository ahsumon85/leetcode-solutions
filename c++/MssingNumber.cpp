#include <iostream>

using namespace std;

int main()
{
    long long n, l, t=0;
    cin >> n;
    for(int i = 0; i< n -1 ; i++){
        cin >> l;
        t += l;
    }
    cout << n * (n+1) / 2 - t;
    return 0;
}

