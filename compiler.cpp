//
//  1401150124卫鑫.cpp
//  编译原理
//
//  Created by wx on 2017/11/5.
//  Copyright © 2017年 wx. All rights reserved.
//

#include "1401150124卫鑫.hpp"

using namespace std;

int curline=0;
//string keyword[]={"int","if","else","while","do","main"};

//string op[]={"=","+","-","*","／","j"};// 编号:1,2,3,4,5,6

//int count=0; //寄存器计数


//string add[]={"+","-"};
//string mul[]={"*","／"};
//string rel[]={"<",">","!=",">=","<=","=="};


int judgeChar(char ch)
{
    int flag;
    if(ch=='!'||ch=='*'||ch=='('||ch==')'||ch=='-'||
       ch=='+'||ch=='='||ch=='|'||ch=='{'||ch=='}'||ch==';'||
       ch=='<'||ch==','||ch=='>'||ch=='.'||ch=='/' )
        flag=1;
    
    else if('0'<=ch&&ch<='9')
        flag=2;
    
    else if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z'))
        flag=3;
    
    else if(ch==' ')
        flag=4;
    
    else if(ch=='\n')
        flag=5;
    
    else if(feof(f_read))
        flag=6;
    
    else
        flag=0;
    return flag;
}

void Scanner_words()     // ##1为符号 ##2为数字 ##3为字母 ##4为空格 ##5为转行 ##6结束##0 报错
{
    char ch;
    int flag;
    int i=-1;
    while(!feof(f_read))
    {
        ch=fgetc(f_read);
        flag=judgeChar(ch);
        cout<<ch;
        if(flag==1||flag==2||flag==3)
        {
            i++;
            temp[i]=ch;
            line[i]=row;
        }
        else if(flag==4)
        {
            i++;
            temp[i]='?';
            line[i]=row;
        }
        else if(flag==5)
        {
            i++;
            temp[i]='~';
            row++;
        }
        else if(flag==6)
            continue;
        /**
         else
         {
         cout<<"\n The symbol in "<<row<<"行"<<"'"<<ch<<"'"<<"is illegal!"<<endl;
         //   cout<<ch<<endl;  ???
         }
         **/
        
    }
    word_num=i+1;   //buffer中字符个数
    
    int temp1,temp2,k;
    k=0;
    for(i=0;i<word_num;i++)
    {
        temp1=judgeChar(temp[i]);
        temp2=judgeChar(temp[i+1]);
        if((temp1!=temp2&&!((temp1==2&&temp2==3) || (temp1==3&&temp2==2))&&temp[i]!='?'&&temp[i]!='~')||temp1==1)
        {
            Lin[k]=line[i];
            k++;
        }
        
        
    }
    
    //  cout<<"*******"<<k<<endl;
}

struct Wordtable *InitWord(){
    struct Wordtable *head,*start,*news,*p;
    struct Symbol *s_first,*s_look;
    s_first=s_look=new  Symbol;
    s_first->mark='\0';
    s_first->name[0]='\0';
    news=head=start= new Wordtable;
    start->link=s_first;
    start->next=NULL;
    //分割单词
    int i=0,k,flag;
    for(k=0;k<word_num;k++)
    {
        flag=judgeChar(temp[k]);
        if(flag==2||flag==3)
        {
            news->name[i]=temp[k];
            news->name[++i]='\0';
        }
        else
        {
            i=0;
            start=news;
		          if(news->name[0]>=33&&news->name[0]<=125) //  合法字符就创建空间
                  {
                      news=new Wordtable;
                      start->next=news;
                      news->next=NULL;
                  }
            if(flag==1){
                news->name[i]=temp[k];
                if((temp[k]=='='&&temp[k+1]=='=')||(temp[k]=='>'&&temp[k+1]=='=')||(temp[k]=='<'&&temp[k+1]=='=')||(temp[k]=='!'&&temp[k+1]=='='))
                {
                    k=k+1;
                    i=i+1;
                    news->name[i]=temp[k];
                }
                news->name[1+i]='\0';
                start=news;
                news=new Wordtable;
                start->next=news;
                news->next=NULL;
            }
        }
    }
    start->next=NULL;
    
    start=head;//单词转换成标识符
    while(start)
    {
        if(strcmp(start->name,"main")==0)
        {
            start->mark='m';
        }
        else if(strcmp(start->name,"while")==0)
        {
            start->mark='w';
        }
        else if(strcmp(start->name,"if")==0)
        {
            start->mark='f';
        }
        else if(strcmp(start->name,"else")==0)
        {
            start->mark='e';
        }
        else if(strcmp(start->name,"int")==0)
        {
            start->mark='a';
        }
        else if(start->name[0]>='0'&&start->name[0]<='9')
        {
            start->mark='n';
        }
        else if(start->name[0]=='+'||start->name[0]=='-'||start->name[0]=='*'||start->name[0]=='/'||start->name[0]=='='||start->name[0]=='<'||start->name[0]=='>'||start->name[0]==','||start->name[0]==';'||start->name[0]=='('||start->name[0]==')'||start->name[0]=='{'||start->name[0]=='}')
        {
            start->mark=start->name[0];
        }
        else if(strcmp(start->name,">=")==0)
        {
            start->mark='%';
        }
        else if(strcmp(start->name,"<=")==0)
        {
            start->mark='^';
        }
        else if(strcmp(start->name,"!=")==0)
        {
            start->mark='@';
        }
        else if(strcmp(start->name,"==")==0)
        {
            start->mark='#';
        }
        else if(strcmp(start->name,"\n")==0||strcmp(start->name,"\r")==0||strcmp(start->name,"\t")==0)
        {
            start=start->next;
        }
        else {
            start->mark='i';
        }
        start=start->next;
    }
    
    i=0;//初始化单词表的序号和行号
    start=head;
    while(start)
    {
        start->num=i;
        start->line=Lin[i];
        i++;
        start=start->next;
    }
    
    start=head;	//初始化符号表
    char word_type;
    while(start){
        if(start->mark=='a')
        {
            p=start->next;
            word_type=start->mark;
            while(p->mark!=';')
            {
                if(p->mark!=',')//判断变量定义没结束
                {
                    s_look=new Symbol;
                    s_look->mark=word_type;
                    strcpy(s_look->name,p->name);
                    s_first->next=s_look;
                    s_first=s_look;
                    s_look->next=NULL;
                }
                p=p->next;
            }
        }
        start=start->next;
    }
    return(head);// 数据传递: head返回单词表的头指针
    
    
}

void Error(const char buffer[])
{
    cout<<"第"<<LINE<<"行出错\t" ;
    cout<<buffer<<";\n";
    error_n++;
    
    
}

void GetWord(){
    sym=word->mark;
    sym_name=word->name;
    LINE=word->line;
    word_before=word;
    word=word->next;
}

void isexist()
{
    struct Symbol *s_first;
    s_first=head->link;
    int flag=1;
    while(s_first)
    {
        if(strcmp(s_first->name, word_before->name)==0)
        {
            flag=0;
            break;
        }
        else
            s_first=s_first->next;
    }
    
    
    if(s_first==NULL&&flag)
    {
        cout<<"错误！第"<<word_before->line<<"行，变量"<<word_before->name<<"没有被声明！"<<endl;
        error_n++;
    }
    
}



void print(Wordtable *head)
{
    struct Wordtable *word_cur;
   // struct Symbol *sym_cur;
    cout<<"词法分析表："<<endl;
    word_cur=head;
    cout<<"字符序号     字符行号      字符名   "<<endl;
    while(word_cur)
    {
        cout<<" "<<word_cur->num<<"\t\t\t"<<word_cur->line<<"\t\t\t"<<word_cur->name<<"\t\t"<<endl;
        word_cur=word_cur->next;
    }
    cout<<endl<<"变量名："<<endl;
     /**
    sym_cur=head->link;
    cout<<"变量类型"<<"    "<<"变量名";
    while(sym_cur!=NULL)
    {
        cout<<"  "<<sym_cur->mark<<"\t\t"<<sym_cur->name<<endl;
        sym_cur=sym_cur->next;
    }
     **/
}



void InsertGen(string op,string data1,string data2,string res)
{
    if(gen_num<100&&fg)
    {
        gen[gen_num].op=op;
        gen[gen_num].data1=data1;
        gen[gen_num].data2=data2;
        gen[gen_num].result=res;
        gen_num++;
    }
}
void AddJumpLine(int num, int jumpline) {  //插入跳转标号
    if (fg) {
        if (gen[num].op == "goto")
            gen[num].data1 = to_string(jumpline);
        else
        {
            for(int i=num-1;i>=0;i--) {
                if(gen[i].tag==1) {
                    gen[i].result = to_string(jumpline);
                    gen[i].tag=2;
                    break;
                }
            }
            //gen[num].result = to_string(jumpline);
         }
              }
}

void  print_Gen()
{
    for(int i= 0; i<=gen_num;i++)
    {
        cout<<setw(5)<<i<<setw(5)<<gen[i].op<<setw(10)<<gen[i].data1
        <<setw(9)<<gen[i].data2<<setw(5)<<gen[i].result<<endl;
    }
}
/**
 P::＝main(){M}
 M::= a i A; S H
 A::=,i A
 A::=ε
 S::＝i= E;| f(T) S e S | w (T)  S | { S H}
 H::= S H
 H::=ε
 T::= E F E
 E::=K E1
 E1::= + K E1
 E1::= - K E1
 E1::=ε
 K::=J K1
 K1::= * J K1
 K1::=/ J K1
 K1::=ε
 J::＝i|n|( E)
 F::=<
 F::=>
 F::=@
 F::=%
 F::=^
 F::=#
 num::=0|1|2|3|4|5|6|7|8|9
 
 a：int
 i:标识字母
 n：数字
 
 
 
 
 **/



/**
 void P()  //  程序
 {
 if(sym=='m')
 {
 GetSymbol();
 
 if(sym=='(')
 {
 GetSymbol();
 if(sym==')')
 {
 GetSymbol();
 if(sym=='{')
 {
 GetSymbol();
 M();
 if(sym=='}')
 cout<<"分析结束！" <<endl;
 else
 Error("缺少}");
 }
 else
 Error("缺少{");
 
 }
 
 else
 Error("缺少)");
 
 
 }
 else
 Error("缺少(");
 
 }
 
 }**/

void  Parse_P()//程序
{
    if(sym=='m')
        GetWord();
    else
        Error("缺少main");
    if(sym=='(')
        GetWord();
    else
        Error("缺少(");
    if(sym==')')
        GetWord();
    else
        Error("缺少)");
    if(sym=='{')
        GetWord();
    else
        Error("缺少{");
    Parse_M();
    if(sym=='}')
    {
        cout<<"分析结束!"<<endl;
        return ;
    }
    else
    {
        Error("缺少}");
        return ;
    }
}


void Parse_M() //中间程序
{
    if(sym=='a')
        GetWord();
    else
        Error("变量申明不正确！");
    if(sym=='i')
    {
        isexist();
        GetWord();
    }
    else
        Error("变量申明不正确！");
    Parse_A();
    if(sym==';')
        GetWord();
    else
        Error("缺少；");
    Parse_S();
    Parse_H();
}

void Parse_A()// 标识符表
{
    if(sym==',')
    {
        GetWord();
        if(sym=='i')
        {
            isexist();
            GetWord();
            Parse_A();
        }
        else
        {
            Error("变量申明使用错误");
            GetWord();
            if(sym==';')
            {
            }
            else
            {
                while (sym!='i') {
                    if(sym==';')
                        break;
                    GetWord();
                }
                if(sym=='i')
                {
                    isexist();
                    GetWord();
                    Parse_A();
                }
                
                
            }
            
        }
        
    }
    
}

string Parse_J()//因子
{
    string res;
    if(sym=='i')
    {
        res=sym_name;
        isexist();
        GetWord();
        return res;
    }
    else if(sym=='n')
    {
        res=sym_name;
        GetWord();
        return res;
    }
    else if(sym=='(')
    {
        GetWord();
        res=Parse_E();
        if(sym==')')
            GetWord();
        else
            Error("缺少)");
        return  res;
    }
    else
    {
        Error("因子表达式错误");
        hasError=true;
        while(sym!=';')
        {
            GetWord();
        }
        return "";
    }
    
    
}

string newtemp()//生成唯一的临时变量
{
    return "T" + to_string(p_temp++);
}


string K1(string &arg1)
{
    
    string op;
    string res1;
    string t;
    if((sym=='*')||(sym=='/'))
    {
        op=sym_name;
        GetWord();
        res1=Parse_J();
        if(hasError)
            return res1;
        t=newtemp();
        InsertGen(op, arg1, res1, t);
        return K1(t);
        
    }
    
    return arg1;
}

/**
 string K2()
 {
 string op;
 string res1;
 string res;
 string t;
 if((sym=='^')||(sym=='*'))
 {
 op=sym_name;
 GetSymbol();
 res1=J();
 if(Eorror)
 {
 return res1;
 }
 }
 
 return res;
 }
 **/

string Parse_K()//项
{
    string res;
    string res1 = Parse_J();
    //	cout<<"K"<<endl;
    if (hasError)
        return res1;
    res = K1(res1);
    if (hasError)
        return res;
    return res;
}



/**
 string E2(string &arg2)
 {
 string op;
 string res1;
 string t;
 if(sym=='+'||sym=='-')
 {
 op=sym_name;
 GetSymbol();
 res1=K();
 }
 
 return t;
 
 }
 **/

string E1(string &arg2)//表达式1
{
    string op;
    string res1;
    string t;
    if((sym=='+')||(sym=='-'))
    {
        op =sym_name;
        GetWord();
        res1 = Parse_K();
        if (hasError)
            return res1;
        t = newtemp();
        if(gen_num < 100 && fg)
        {
            gen[gen_num ].op = op;
            gen[gen_num ].data1 = arg2;
            gen[gen_num ].data2 = res1;
            //	cout<<t;
            gen[gen_num].result = t;
                ++gen_num;
        }
        return E1(t);
    }
    return arg2;
    
}


string Parse_E()//  表达式
{
    string res;
    string res1 = Parse_K();
    if (hasError)
        return res1;
    res = E1(res1);
    if (hasError)
        return res;
    return res;
}

string Parse_T()//条件
{
    string res;
    string res1;
    string op;
    int temp;
    res1 = Parse_E();
    if (hasError)
        return res1;
    if((sym=='<')||(sym=='>')||(sym=='@')||(sym=='%')||(sym=='^')||(sym=='#'))
    {
        op=sym_name;
        GetWord();
    }
    else
    {
        Error("逻辑运算符书写不正确");
        hasError = true;
        return "";
    }
    string res2 = Parse_E();
    if (hasError)
        return res2;
    temp=gen_num;
    if(op==">")
    {
        InsertGen("<=", res1, res2, "");
        gen[temp].tag=1;
        
    }
    if(op=="<")
    {
        InsertGen(">=", res1, res2, "");
        gen[temp].tag=1;
        
    }
    if(op==">=")
    {
        InsertGen("<", res1, res2, "");
        gen[temp].tag=1;
        
    }
    if(op=="<=")
    {
        InsertGen(">", res1, res2, "");
        gen[temp].tag=1;
        
    }
    if(op=="==")
    {
        InsertGen("!=", res1, res2, "");
        gen[temp].tag=1;
        
    }
    if(op=="!=")
    {
        InsertGen("==", res1, res2, "");
        gen[temp].tag=1;
        
    }
    return res;
    
}


void Parse_H()//语句部分
{
    if(sym=='i'||sym=='f'||sym=='w'||sym=='{') {
        Parse_S();
        Parse_H();
    }
    else if(sym=='}'||sym=='0') {}
    else {//遇到其他字符，忽略该字符，读取下一个
        cout<<"第"<<LINE<<"行有错误！有多余的非法字符！"<<endl;
        error_n++;
        GetWord();
        Parse_H();
    }
}

void Parse_S()//语句
{
    //	cout<<"S"<<endl;
    if(sym=='i')
    {
        string id=sym_name;
        
        isexist();
        GetWord();
        if(sym=='=')
            GetWord();
        else
            Error("缺少赋值符号=");
        string res = Parse_E();
        if (hasError)
        {
            hasError = false;
            return;
        }
        if(sym==';')
            GetWord();
        //	cout<<sym<<'\t'<<symbol->name<<endl;
        else
            Error("缺少;");
        InsertGen("=", res, "", id);
    }
    else if(sym=='f')
    {
        string res;
        GetWord();
        if(sym=='(')
            GetWord();
        else
            Error("缺少(");
        res = Parse_T();
        if (hasError)
        {
            hasError = false;
        }
        else if(sym==')')
            GetWord();
        else
            Error("缺少)");
        int ifline = gen_num;
        Parse_S();
        AddJumpLine(ifline, gen_num);
        if(sym=='e')
        {
            int elseline = gen_num;
            InsertGen("goto", "", "", "");
            AddJumpLine(ifline, gen_num);
            GetWord();
            Parse_S();
            AddJumpLine(elseline, gen_num);
        }
        else
        {
            Error("缺少else语句");
            Parse_S();
        }
    }
    else if(sym=='w')
    {
        string res;
        int curwhilecode = gen_num;
        GetWord();
        if(sym=='(')
            GetWord();
        else
            Error("缺少(");
        res = Parse_T();
        if (hasError)
        {
            hasError = false;
        }
        if(sym==')')
            GetWord();
        else
            Error("缺少)");
        int curcodeline = gen_num;
        Parse_S();
        InsertGen("goto", to_string(curwhilecode), "", "");
        AddJumpLine(curcodeline, gen_num);
    }
    else if(sym=='{')
    {
        GetWord();
        Parse_S();Parse_H();
        if(sym=='}')
            GetWord();
        else
            Error("缺少}");
    }
    else
    {
        Error("不是合法的语句");
        // cout<<sym<<endl;
        if(sym=='}')
            GetWord();
        
    }
}


void printMenue()
{
    cout<<"***************************************"<<endl;
    cout<<"*                编译原理               *"<<endl;
    cout<<"*            计算机150124 卫鑫          *"<<endl;
    cout<<"***************************************"<<endl;
  
}



int main() {
    head=new Wordtable;
    head->next=NULL;
    char path[50];
    printMenue();
    cout<<"请输入文件的路径+文件名.后缀：";//      /Users/wx/Desktop/1.cpp
    cin>>path;
    if((f_read=fopen(path, "rt"))==NULL)
    {
        cout<<"文件不存在！"<<endl;
        exit(0);
    }
    if(head->next==NULL)
    {
        Scanner_words();
        head=InitWord();
    }
    print(head);
    word=head;
    GetWord();
    Parse_P();
    
    if(error_n==0)
    {
        cout<<"语法分析正确!"<<endl;
        print_Gen();
        
    }
    else
    {
        //cout<<error<<endl;
        cout<<endl<<"程序中有语法问题，请检查您的代码。" <<endl;
    }
    fclose(f_read);
    return 0;
}
