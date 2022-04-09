#include<iostream>
using namespace std;


void swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}

void selectionsort(int a[],int n){
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(a[j]<a[min]){
                min=j;
            }
        }
        swap(&a[i],&a[min]);
    }
}


void printArray(int array[], int size) 
{
  for (int i = 0; i < size; ++i) 
  {
  cout<<array[i]<<" ";
  }
  cout<<"\n";
}

int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    selectionsort(a,n);
    printArray(a,n);
    
}