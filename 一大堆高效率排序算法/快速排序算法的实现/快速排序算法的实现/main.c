//
//  main.c
//  快速排序算法的实现
//
//  Created by mac on 16/3/27.
//  Copyright © 2016年 mac. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define Swap(a,b) {int t;t=a;a=b;b=t;}

void quick_sort(int *date,int left,int right){
    int le=left;
    int ri=right;
    int povit=date[(left+right)/2];
    while (le<=ri) {
        for(;date[le]<povit;le++);
        for(;date[ri]>povit;ri--);
        if (le<=ri) {
            Swap(date[le], date[ri]);
            le++;
            ri--;
        }
    }
    if (le<right) {
        quick_sort(date, le, right);
    }
    if(ri>left){
        quick_sort(date, left, ri);
    }
}
int main(int argc, const char * argv[]) {
    // insert code here...
    //printf("Hello, World!\n");
//    int a[100];
//    srand(time(NULL));
//    for (int i=0; i<100; i++) {
//        a[i]=rand()%1000;
//    }
//    for (int i=0; i<100; i++) {
//        printf("%3d ",a[i]);
//    }
//    printf("*********************************\n");
//    quick_sort(a, 0, 99);
//    for (int i=0; i<100; i++) {
//        printf("%3d ",a[i]);
//    }
//    printf("\n");
    clock_t start_t, end_t;
    start_t = clock();
    printf("Starting of the program, start_t = %ld\n", start_t);
    
    int a[200000];
    for(int i=0;i<200000;i++)
    {
        a[i]=100-i;
    }
    
    int n=200000;
    
    //Print(a, n);
    quick_sort(a,0,n-1);
    //Print(a, n);
    
    end_t = clock();
    printf("End of the function, end_t = %ld\n", end_t);
    double total_t = (double)(end_t - start_t) / CLOCKS_PER_SEC;
    printf("Total seconds time taken by CPU: %f\n", total_t  );

    return 0;
}
