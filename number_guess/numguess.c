#include <stdio.h> 
#include <string.h>

int main(){
	char word[6];
	int count = 0;
	int high = 1000;
	int low = 1;
	
		printf("\n \n     Pick a number, 1 through 1000\n");
		printf("     I will guess your number in 10 or less tries!\n \n");
		printf("     I will guess. If I am right, enter yes. otherwise, tell me higher or lower. \n \n");

		int flag = 0;
		int jen = 0;
		
		while(flag == 0){
			int guess = (high + low)/2;
			printf("          Is your number %d?   ", guess);
			
			jen = 0;
			while(jen == 0){
				scanf("%s", word);
				if (((!strncmp(word, "yes", 6))||(!strncmp(word, "lower", 6))||(!strncmp(word, "higher", 6)))){
					jen = 1;
				}
				else
					printf("Sorry, wrong input. Try again. \n");
			}
			if (count>10){
				printf("Ok, you are cheating now. if %d isn't your number then you messed up. \n", guess);
				break;
			}
			count++;
		

			if(!strncmp(word, "yes", 6)){
				printf("I told you! only took %d tries! \n \n", count);
				flag = 1;
			}

			if(!strncmp(word, "higher", 6)){
				low = guess + 1;
			}

			if(!strncmp(word, "lower", 6)){
				high = guess - 1;
			}

		}
}