/*
 Author : Gaurav Dangi
 Created on 03-11-2016
*/
#ifndef MyNode
#define MyNode

class MNode{
 private:
  struct Node{
   int data;
   Node* next;
 };
   Node* head;
 public:
   MNode();
   void insertAtEnd(int data);
   bool detectCycle();
   void PrintNode();
};
#endif
