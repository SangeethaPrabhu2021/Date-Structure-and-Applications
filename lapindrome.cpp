#include <iostream>
#include <algorithm>
using namespace std;

void f()
{
    string s;
    cout << "Enter string : ";
    cin >> s;
    string first,second;
    int n=s.length();
    for(int i=0;i<n/2;i++)
    {
        first+=s[i];
        second+=s[n-i-1];
    }
    sort(first.begin(),first.end());
    sort(second.begin(),second.end());

    if(first==second)
    cout << "It's a Lapindrome.\n";
    else
    cout << "It's not a lapindrome.\n";
}

int main() {
	int t;
	cout << "Enter number of testcases : ";
	cin >> t;
	while(t--)
	{
	    f();
	}
	return 0;
}
