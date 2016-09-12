#include<stdio.h>
#define max 50
int queue[max];
int head=-1,rear=-1;
void enque(){
	if(rear==max){
		printf("queue is full\n");
	}
	else{
		if(head==-1){
			head=head+1;
		}
		int el;
		printf("enter the element to be enqued\n");
		scanf("%d",&el);
		rear=rear+1;
		queue[rear]=el;
		
		
	}
}
void deque(){
	if(head==-1 || head>rear){
		printf("queue underflow\n");
		return;
	}
	else{
		printf("element deleted is %d\n",queue[head]);
		head=head+1;
	}
}
void display(){
	int i;
	for(i=head;i<=rear;i++)
	printf("%d  ",queue[i]);
}
int main(){
	printf("MAIN MENU\n");
	int ch;
	printf("1.enque\n2.deque\n3.display\n");
	printf("PRESS 4 TO EXIT\n");

	while(ch!=4){
			printf("enter your choice\n");
	scanf("%d",&ch);
		switch(ch){
			case 1:
				enque();
				break;
			case 2:
				deque();
				break;
			case 3:
				display();
				break;
			default:
				break;
				
		}
	}
	
	return 0;
}

