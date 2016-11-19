//
//  main.c
//  堆排序
//
//  Created by mac on 16/6/5.
//  Copyright © 2016年 mac. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define Swap(a,b) {int tmp=a;a=b;b=tmp;}
#define INF -2147483648
#define Num 101
void HeapAdjust(int *data,int N){
    int startIndex=N/2;
    if(!(N%2)){
        if(data[N]>data[startIndex]){
            Swap(data[N], data[startIndex]);
        }
        startIndex--;
    }//如果最后一个节点无兄弟节点，则调整其与父节点。起始节点前移
    for(int i=startIndex;i>0;i--){
        if(data[i]<data[2*i])Swap(data[i], data[2*i]);
        if(data[i]<data[2*i+1])Swap(data[i], data[2*i+1]);
    }//调整
}
void HeapSort(int *data,int N){
    for(int i=N;i>1;i--){
        HeapAdjust(data, i);
        Swap(data[1], data[i]);
    }
}
int main(int argc, const char * argv[]) {
    // insert code here...
//    srand((unsigned int)time(NULL));
//    int data[Num];
//    for(int i=0;i<Num;i++){
//        data[i]=rand()%1000;
//    }
//    printf("**********************\n");
//    for(int i=0;i<Num;i++){
//        printf("%3d ",data[i]);
//    }
//    printf("\n");
//    data[0]=INF;
//    HeapSort(data, Num-1);
//    
//    printf("**********************\n");
//    for(int i=0;i<Num;i++){
//        printf("%3d ",data[i]);
//    }
//    printf("\n");
//    int b[11]={0,3,2,8,5,4,5,5,6,1,9};
//    HeapSort(b, 10);
//    printf("**********************\n");
//    for(int i=0;i<11;i++){
//        printf("%3d ",b[i]);
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
    HeapSort(a, n);
    //Print(a, n);
    
    end_t = clock();
    printf("End of the function, end_t = %ld\n", end_t);
    double total_t = (double)(end_t - start_t) / CLOCKS_PER_SEC;
    printf("Total seconds time taken by CPU: %f\n", total_t  );

    return 0;
}
