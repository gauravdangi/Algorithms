// Detect a cycle in a linked list
// Author : Gaurav Dangi
#include <iostream>
#include "MyNode.h"
using namespace std;

MyNode::MyNode(){
head = NULL;
}
// Print function
void MyNode::PrintNode(){
  if(head==NULL) cout<<"NULL";
  else{
  Node* p = new Node();
  p = head;
  while(p->next!=NULL){
    cout<<p;
  }
  cout<<endl;
  }

}

// Insert function
void MyNode::insertAtEnd(int d){
    Node* temp1 = new Node();
    temp1->data=d;
    temp1->next=NULL;

    if(head==NULL){
      head = temp1;
    }
    else{
    Node* temp2 = new Node();
    temp2 = head;
    while(temp2->next!= NULL){
        temp2 = temp2->next;
    }
    temp2->next = temp1;
   }
}

// detectCycle function
bool MyNode::detectCycle(){
 if(head==NULL) return false;
 Node fast = head->next;
 Node slow = head;
 while(fast!=NULL && fast->next!=NULL && slow!=NULL){

    if(fast==slow) return true;
    fast = fast->next->next;
    slow = slow->next;
 }
 return false;
}

int main()
{   insertAtEnd(10);
    insertAtEnd(20);
    insertAtEnd(30);
    PrintNode();
    cout<<"Is there any cycle present in the linked list?"<<endl<<"-> "<<detectCycle();
    return 0;
}
