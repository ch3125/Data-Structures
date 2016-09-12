#include<stdio.h>
#define max 50
int stack[max],top=0;
void push(int element){
	if(top==max){
		printf("overflow");
	}
	else{
		stack[top]=element;
		top++;
	}
}
void pop(){
	if(top==0){
		printf("underflow");
	}
	else{
		 printf("%d",stack[--top]);
	}
}
void peek(){
	printf("%d",stack[top-1]);
}

int main(){
	int ch;

	printf("main menu\n");
	printf("1.push\n2.pop\n3.peek\n");
		while(ch!=4){
		printf("enter your choice");
	
	scanf("%d",&ch);

		switch(ch){
			case 1:
				int el;
				printf("\nenter the element to be pushed");
				scanf("%d",&el);
				push(el);
				break;
			case 2:
				pop();
				break;
			case 3:
				peek();
				break;
		}
		
	}
	return 0;
}
