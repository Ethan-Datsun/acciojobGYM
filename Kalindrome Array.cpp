#include <bits/stdc++.h>
using namespace std;

#define MAX 200000

bool
can_form_palindrome (int arr[], int n)
{

  string str = "";

  for (int i = 0; i < n; i++)
    {
      str += arr[i];
    }

  int freq[MAX] = { 0 };
  for (int i = 0; str[i]; i++)
    {
      freq[str[i]]++;
    }
  int count = 0;

  for (int i = 0; i < MAX; i++)
    {
      if (freq[i] & 1)
	{
	  count++;
	}
      if (count > 1)
	{
	  return false;
	}
    }

  return true;
}

int
main ()
{
  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
    cin >> arr[i];
  can_form_palindrome (arr, n) ? cout << "YES" : cout << "NO";
  return 0;
}
