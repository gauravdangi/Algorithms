#include <iostream>

using namespace std;

int top=-1;
int top1=-1;
int stack[10];
int stack1[10];
void push(int* t,int s[],int data){

   if(*t == 9){
      cout<<"**Stack Overflow**\n";
      return;
   }
   *t = *t+1;
   s[*t] = data;
}

int pop(int *t,int s[]){
    if(*t==-1){
        cout<<"**Stack Under-Flow**\n";
    }
    else{
     int x = s[*t];
     *t = *t-1;
     return x;
    }
}

void print(int* y,int s[]){
    int t = *y;
    while(t>-1){
       cout<<"|"<<s[t]<<"|"<<endl;
       t--;
    }
    cout<<"---\n";
}

void sortStack(){
    push(&top1,stack1,pop(&top,stack));
    while(top>-1){
        cout<<"(stack1[top1]) : "<<stack1[top1]<<" ||   (stack[top2]) : "<<stack[top]<<"  \n";
       int curr = pop(&top,stack);
       if(curr>stack1[top1]){
        push(&top1,stack1,curr);
       }
       else{
            int z = pop(&top1,stack1);
            while(curr<z){
                cout<<"(stack1[top1]) : {"<<stack1[top1]<<"} ||   (stack[top2]) : {"<<stack[top]<<"}  \n";
                push(&top,stack,z);
                if(top1!=-1)
                    z = pop(&top1,stack1);
                else
                    break;


            }
            push(&top1,stack1,curr);
    }
  }
 // top = top1;
}

int main()
{
  push(&top,stack,30);
  push(&top,stack,-5);
  push(&top,stack,18);
  push(&top,stack,14);
  push(&top,stack,-3);
  cout<<"Before Sorting\n";
  print(&top,stack);

  sortStack();

  cout<<"After Sorting\n";
  print(&top1,stack1);
}
