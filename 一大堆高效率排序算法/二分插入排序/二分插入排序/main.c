//
//  main.c
//  二分插入排序
//
//  Created by mac on 16/6/6.
//  Copyright © 2016年 mac. All rights reserved.
//

#include <stdio.h>
#include <time.h>
void binary_insert_sort(int a[],int n){
    for(int i =1;i<n;i++){
        int temp = a[i];
        int low  = 0 ;
        int high = i;
        //二分查找插入位置
        while(low <= high){
            int mid = (low + high) >> 1;
            if(temp > a[mid])low = mid + 1;
            else high = mid - 1;
        }
        //向后移动数据
        for(int j = i - 1;j >= high + 1;j--)a[j+1] = a[j];
        
        a[high+1] = temp; //插入
    }
}
int main(int argc, const char * argv[]) {
    // insert code here...
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
    binary_insert_sort(a, n);
    //Print(a, n);
    
    end_t = clock();
    printf("End of the function, end_t = %ld\n", end_t);
    double total_t = (double)(end_t - start_t) / CLOCKS_PER_SEC;
    printf("Total seconds time taken by CPU: %f\n", total_t  );
    
    return 0;
}
