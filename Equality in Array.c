#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() {
    int i,n,l;
scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++){scanf("%d",&arr[i]);}
    int brr[101]={0};
    for(i=0;i<n;i++){brr[arr[i]]++;}
    l=0;
    for(i=0;i<101;i++){
        if(brr[i]>l){l=brr[i];}
    }
    printf("%d",n-l);
        
    return 0;
}