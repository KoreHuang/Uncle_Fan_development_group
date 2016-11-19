//
//  main.c
//  Kruskal
//
//  Created by mac on 15/11/29.
//  Copyright © 2015年 mac. All rights reserved.
//

#include<stdio.h>
#include<stdlib.h>
#define Maxsize 20
typedef struct Arcnode{
    int vex;
    int weight;
    struct Arcnode *next;
}ArcNode;
typedef struct{
    char data;
    ArcNode *Head;
}VexType;
typedef struct {
    VexType vertex[Maxsize];
    int vexnum;
    int arcnum;
}AdjList;
typedef struct {
    int start;
    int end;
    int weight;
}EdgeType;
/*creat the graph*/
void CreatGraph(AdjList *G){
    int i;
    int c;
    ArcNode *p=NULL;
    printf("请输入顶点数:");
    scanf("%d",&(G->vexnum));
    printf("请输入边数:");
    scanf("%d",&(G->arcnum));
    getchar();
    for(i=0;i<G->vexnum;i++){
        printf("请输入第%d个顶点:",i+1);
        scanf("%c",&(G->vertex[i].data));
        G->vertex[i].Head=p;
        printf("请输入该顶点的邻接顶点，孤立点输入99:\n");
        scanf("%d",&c);
        if(c==99) continue;
        else while(c!=99){
            p=(ArcNode * )malloc(sizeof(ArcNode));
            p->vex=c;
            printf("输入该边权值");
            scanf("%d",&c);
            getchar();
            p->weight=c;
            p->next=G->vertex[i].Head;
            G->vertex[i].Head=p;
            p=NULL;
            printf("下一个临界点");
            scanf("%d",&c);
            getchar();
        }
    }
}
/*创建Edge边集，扫描临接表中的边存到Edge表中，并用选择排序将表升序排列*/
void CpArc(AdjList *G,EdgeType *Edge){
    int i,j=0,tag;
    ArcNode *p=NULL;
    EdgeType temp;
    for(i=0;i<G->vexnum;i++){
        p=G->vertex[i].Head;
        while(p!=NULL){
            if(p->vex>i){
                Edge[j].start=i;
                Edge[j].end=p->vex;
                Edge[j].weight=p->weight;
                j++;
            }
            p=p->next;
        }
    }
    tag=j;
    for(i=0;i<tag;i++){
        for(j=i;j<tag;j++){
            if(Edge[j].weight<Edge[i].weight){
                temp=Edge[i];
                Edge[i]=Edge[j];
                Edge[j]=temp;
            }
        }
    }
}
int Search(int p[],int t){
    while(p[t]>0){
        t=p[t];
    }
    return t;
}
/*Kruskal算法*/
void Kruskal(EdgeType *Edge,AdjList *G){
    int m,n,i,j;
    int *Parent;
    Parent=(int *)malloc((G->vexnum)*sizeof(int));
    for(i=0;i<G->vexnum;i++)
        Parent[i]=0;
    for(j=0;j<G->arcnum;j++){
        n=Search(Parent,Edge[j].start);
        m=Search(Parent,Edge[j].end);
        if(m!=n){
            Parent[n]=m;
            printf("%c<--->%c该边权值为:%d\n",G->vertex[(Edge[j].start)].data,G->vertex[(Edge[j].end)].data,Edge[j].weight);
        }
    }
    free(Parent);
}
int main(void){
    printf("hello,world\n");
    AdjList G;
    EdgeType Edge[20];
    CreatGraph(&G);
    CpArc(&G, Edge);
    Kruskal(Edge, &G);
    return 0;
}