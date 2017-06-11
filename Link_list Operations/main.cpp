#include <iostream>

using namespace std;

struct node{
int data;
node* link;
};

node* start=NULL;

void dump(){
node* temp = start;
cout<<"\n---------------------\n";
while(temp!=NULL){
    cout<<" "<<temp->data;
    temp = temp->link;
}
cout<<"\n---------------------\n";
}

void delete_node(int a){
 node* temp = start;
 node* temp2 = new node();
 temp2 = temp->link;
 while(temp2->data!=a && temp2->link!=NULL){
    temp2=temp2->link;
    temp=temp->link;
 }
 if(temp2->data==a){
    temp2 = temp2->link;
    temp->link = temp2;
 }
 else
    cout<<"\nElement Not Found\n";
}

int search_node(int a){
 node* temp = start;
 int flag = 1;
 while(temp->data!=a && temp->link!=NULL){
    temp = temp->link;
    flag++;
 }
 if(temp->data == a)
    return flag;
 else
    return -1;
}

int count_list(){
node* temp = start;
int count1 = 0;
while(temp!=NULL){
    temp = temp->link;
    count1++;
}
return count1;
}

void insert(int a){
node* temp = start;
node* temp2=new node();
temp2->data=a;
temp2->link=NULL;
if(start==NULL){
    start = temp2;
    return;
}
while(temp->link!=NULL){
    temp = temp->link;
}

temp->link = temp2;
temp2->link = NULL;
}

int main()
{   int c,l=1;
    start = NULL;
    //start->link=NULL;
    cout << "Link list Operations" << endl;
    do{
    cout<<"Enter operation you want to perform\n1]Insertion\n2]Deletion\n3]Searching\n4]Count\n-> ";
    cin>>c;
    switch(c){
       case 1: cout<<"\nInsertion";
            int d;
            cout<<"\nEnter data you want to insert: ";
            cin>>d;
            insert(d);
            dump();
            break;

       case 2: cout<<"\nDeletion";
            int e;
            cout<<"\nEnter data you want to delete: ";
            cin>>e;
            delete_node(e);
            dump();
            break;
       case 3:cout<<"\nSearching";
            int f,t;
            cout<<"\nEnter data you want to search: ";
            cin>>f;
            t = search_node(f);
            if(t==-1)
                cout<<"\nElement not found!";
            else{
                cout<<"\nElement found at position "<<t;
            }

            break;
      case 4:cout<<"\nCounting\n";
            cout<<"Number of element in your list = "<<count_list();
            break;
      default:cout<<"\nYou entered the wrong choice";
             break;
    }

    cout<<"\nDo you want to continue? (Press 1 for YES and others for NO)\n";
    cin>>l;
}while(l==1);
    return 0;
}
