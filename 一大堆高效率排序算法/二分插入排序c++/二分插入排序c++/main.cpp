//
//  main.cpp
//  二分插入排序c++
//
//  Created by mac on 16/6/6.
//  Copyright © 2016年 mac. All rights reserved.
//

#include <algorithm>
#include <iostream>
#include <iterator>
#include <ctime>
using namespace std;
template <typename RandomAccessIterator>
void InsertionSort(RandomAccessIterator begin, RandomAccessIterator end) {
    for (auto i = begin; i != end; ++i) {
        rotate(upper_bound(begin, i, *i, less<typename iterator_traits<RandomAccessIterator>::value_type>()), i, i + 1);
    }
}

int main() {
    int start_s=clock();
    int a[200000];
    for(int i=0;i<200000;i++)
    {
        a[i]=100-i;
    }
    cout << "\n";
    InsertionSort(std::begin(a), std::end(a));
    cout << "\n";
    int stop_s=clock();
    cout << "seconds time: " << (stop_s-start_s)/double(CLOCKS_PER_SEC) << "\n";
    for (int i=0; i<200000; i++) {
        printf("%d",a[i]);
    }
    return 0;  
}