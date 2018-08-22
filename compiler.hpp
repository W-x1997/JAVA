//
//  1401150124卫鑫.hpp
//  编译原理
//
//  Created by wx on 2017/11/5.
//  Copyright © 2017年 wx. All rights reserved.
//
#ifndef _401150124___hpp
#define _401150124___hpp
#include<iostream>
#include<cstdlib>
#include<fstream>
#include<string>
#include<math.h>
#include<cstring>
#include <vector>
#include<iomanip>
using namespace std;

FILE *f_read;               //文件指针
bool hasError=false;
bool fg=true;     //判断
int LINE;//    行号
char temp[1000];// 扫描内容放入的数组
int error_n=0;   //错误数量
char sym;
string sym_name;
int gen_num=0; //四元式总数
int p_temp=0;   //四元式的行

//string add[]={"+","-"};
//string mul[]={"*","／"};
//string rel[]={"<",">","!=",">=","<=","=="};

struct Wordtable    // 用于存放每一个扫描后分割开的单词
{
    char name[20];   //内容
    char mark;        //自定义的标号
    int num;           //序号
    int line;              //行号
    struct Symbol *link;
    struct Wordtable *next;
};
Wordtable *word;
Wordtable *word_before;
struct Wordtable *head;

struct Symbol   //  用于检查变量是否被申明过 保存自定义的变量
{
    char name[10];
    char mark;
    struct Symbol *next;
};


int row=1;                //字符行变量
int line[1000];           //字符行
int Lin[300];              //单词所在行
int word_num;                //Wordtable中分割的字符数目
int judgeChar(char ch);// 判断字符，变量flag返回字符类别       ##1为符号 ##2为数字 ##3为字母 ##4为空格 ##5为转行 ##6结束##0 报错
void Scanner_words();//词法扫描
void Gen_make();// 生成四元式代码
void print(Wordtable *head);
void GetWord();
void Error(const char doc[]);// 报错
void isexist(); // 检查变量名是否被声明



void Parse_P();  //程序
void Parse_M();  //分程序
void Parse_A();  //标识符表
void Parse_S();  //语句
void Parse_H();  //语句部分
string Parse_T();  //条件
string Parse_E();  //表达式
string Parse_K();  //项
string Parse_J();//因子


struct GEN{        //四元式结构
    string op;
    string data1;
    string data2;
    string  result;
    int tag;
    
};
GEN  gen[100];

void InsertGen(string op,string data1,string data2,string res);//生存四元式
void AddJumpLine(int num, int jumpline); //插入跳转标号
void  print_Gen();//打印四元式

#endif /* _401150124___hpp */
