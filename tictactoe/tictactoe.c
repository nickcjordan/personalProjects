#include <stdio.h>
#include <stdlib.h>
#include <string.h>

	char grid[9];
	char inp[2];
	int validf, count, game, hscore, cscore, play, turn;

	void printed(char grid[]){
	printf("\n\n     %c | %c | %c \n", grid[0], grid[1], grid[2]);
	printf("    -----------   \n");
	printf("     %c | %c | %c \n", grid[3], grid[4], grid[5]);
	printf("    -----------   \n");
	printf("     %c | %c | %c \n\n\n", grid[6], grid[7], grid[8]);
}

void valid(char grid[], char inp[]){
			if(!strcmp(inp, "a1")){ if (grid[0]==' '){ grid[0] = 'X'; validf = 1; }
				else { printf("Move already taken. Try again:  "); return; } }
			if(!strcmp(inp, "a2")){ if (grid[1]==' '){ grid[1] = 'X'; validf = 1; }
				else { printf("Move already taken. Try again:  "); return; } }
			if(!strcmp(inp, "a3")){ if (grid[2]==' '){ grid[2] = 'X'; validf = 1; }
				else { printf("Move already taken. Try again:  "); return; } }
				if(!strcmp(inp, "b1")){ if (grid[3]==' '){ grid[3] = 'X'; validf = 1; }
					else { printf("Move already taken. Try again:  "); return; } }
				if(!strcmp(inp, "b2")){ if (grid[4]==' '){ grid[4] = 'X'; validf = 1; }
					else { printf("Move already taken. Try again:  "); return; } }
				if(!strcmp(inp, "b3")){ if (grid[5]==' '){ grid[5] = 'X'; validf = 1; }
					else { printf("Move already taken. Try again:  "); return; } }
					if(!strcmp(inp, "c1")){if (grid[6]==' '){ grid[6] = 'X'; validf = 1; }
						else { printf("Move already taken. Try again:  "); return; } }
					if(!strcmp(inp, "c2")){if (grid[7]==' '){ grid[7] = 'X'; validf = 1; }
						else { printf("Move already taken. Try again:  "); return; } }
					if(!strcmp(inp, "c3")){if (grid[8]==' '){ grid[8] = 'X'; validf = 1; }
						else { printf("Move already taken. Try again:  "); return; } }
			if(validf==0) {printf("Invalid Move. Try again: "); return;}
}

void compMove(char grid[], char two, char one){
	if((grid[0]== two) && (grid[1]== two) && (grid[2]==' ')) {grid[2] = one; validf = 1; return;}
	if((grid[0]== two) && (grid[4]== two) && (grid[8]==' ')) {grid[8] = one; validf = 1; return;}
	if((grid[0]== two) && (grid[3]== two) && (grid[6]==' ')) {grid[6] = one; validf = 1; return;}
	if((grid[1]== two) && (grid[2]== two) && (grid[0]==' ')) {grid[0] = one; validf = 1; return;}
	if((grid[1]== two) && (grid[4]== two) && (grid[7]==' ')) {grid[7] = one; validf = 1; return;}
	if((grid[2]== two) && (grid[4]== two) && (grid[6]==' ')) {grid[6] = one; validf = 1; return;}
	if((grid[2]== two) && (grid[5]== two) && (grid[8]==' ')) {grid[8] = one; validf = 1; return;}
	if((grid[3]== two) && (grid[4]== two) && (grid[5]==' ')) {grid[5] = one; validf = 1; return;}
	if((grid[4]== two) && (grid[6]== two) && (grid[0]==' ')) {grid[0] = one; validf = 1; return;}
	if((grid[4]== two) && (grid[5]== two) && (grid[3]==' ')) {grid[3] = one; validf = 1; return;}
	if((grid[4]== two) && (grid[8]== two) && (grid[0]==' ')) {grid[0] = one; validf = 1; return;}
	if((grid[4]== two) && (grid[7]== two) && (grid[1]==' ')) {grid[1] = one; validf = 1; return;}
	if((grid[4]== two) && (grid[6]== two) && (grid[2]==' ')) {grid[2] = one; validf = 1; return;}
	if((grid[5]== two) && (grid[8]== two) && (grid[2]==' ')) {grid[2] = one; validf = 1; return;}
	if((grid[6]== two) && (grid[7]== two) && (grid[8]==' ')) {grid[8] = one; validf = 1; return;}
	if((grid[7]== two) && (grid[8]== two) && (grid[6]==' ')) {grid[6] = one; validf = 1; return;}
	if((grid[0]== two) && (grid[8]== two) && (grid[4]==' ')) {grid[4] = one; validf = 1; return;}
	if((grid[1]== two) && (grid[7]== two) && (grid[4]==' ')) {grid[4] = one; validf = 1; return;}
	if((grid[2]== two) && (grid[6]== two) && (grid[4]==' ')) {grid[4] = one; validf = 1; return;}
	if((grid[5]== two) && (grid[3]== two) && (grid[4]==' ')) {grid[4] = one; validf = 1; return;}
	if((grid[0]== two) && (grid[2]== two) && (grid[1]==' ')) {grid[1] = one; validf = 1; return;}
	if((grid[6]== two) && (grid[8]== two) && (grid[7]==' ')) {grid[7] = one; validf = 1; return;}
	if((grid[0]== two) && (grid[6]== two) && (grid[3]==' ')) {grid[3] = one; validf = 1; return;}
	if((grid[2]== two) && (grid[8]== two) && (grid[5]==' ')) {grid[5] = one; validf = 1; return;}
}

int check(char grid[], char check){
if((grid[0]== check) && (grid[1]== check) && (grid[2]== check)){ return 1; }
if((grid[0]== check) && (grid[3]== check) && (grid[6]== check)){ return 1; }
if((grid[0]== check) && (grid[4]== check) && (grid[8]== check)){ return 1; }
if((grid[1]== check) && (grid[4]== check) && (grid[7]== check)){ return 1; }
if((grid[2]== check) && (grid[4]== check) && (grid[6]== check)){ return 1; }
if((grid[2]== check) && (grid[5]== check) && (grid[8]== check)){ return 1; }
if((grid[3]== check) && (grid[4]== check) && (grid[5]== check)){ return 1; }
if((grid[6]== check) && (grid[7]== check) && (grid[8]== check)){ return 1; }
return 0;
}

void fill(char grid[]){
	int flag = 0;
	int i = 0;	if (grid[i] == ' ') {grid[i] = 'O'; flag = 1; return;}
	 		i = 2;	if (grid[i] == ' ') {grid[i] = 'O'; flag = 1; return;}
			i = 6;	if (grid[i] == ' ') {grid[i] = 'O'; flag = 1; return;}
			i = 8;	if (grid[i] == ' ') {grid[i] = 'O'; flag = 1; return;}
	for (i = 0; i<9; i++) if (grid[i] == ' ') {grid[i] = 'O'; flag = 1; return;}
}

void player(char grid[]){
	printf("Your move:  ");
				validf = 0;
					while(validf == 0){
						scanf("%s", inp);
							valid(grid, inp);
					}
					printf("\n\n");
						count++;
						printed(grid);
						if (count==9) { printf("It's a draw!\n\n"); return;}
						if (check(grid, 'X')==1){ printf("You win!!\n\n\n"); hscore++; count=9; return;}
}

void computer(char grid[]){
				printf("My move: \n\n");
				validf = 0;
				  if (validf==0) compMove(grid, 'O', 'O');  //offensive
					if (validf==0) compMove(grid, 'X', 'O');  //defensive
					if (validf==0) fill(grid);
						count++;
						printed(grid);
						if (count==9) { printf("It's a draw!\n\n"); return;}
						if (check(grid, 'O')==1){ printf("You lose!!\n\n\n"); cscore++; count=9; return;}
}

int main(){

printf("\n\nWelcome to Tic Tac Toe. This is the layout of the board:\n\n");
	printf("     a1 | a2 | a3 \n");
	printf("     -------------   \n");
	printf("     b1 | b2 | b3 \n");
	printf("     -------------   \n");
	printf("     c1 | c2 | c3 \n\n\n");
printf("When you make your move, enter it in the form \"a1\"\n\n");
	
	play = 0;
	game = 0;
	while (game== 0){
		count = 0;
		grid[0] = ' ';  grid[1] = ' ';  grid[2] = ' ';  grid[3] = ' ';  grid[4] = ' ';  grid[5] = ' ';  grid[6] = ' ';  grid[7] = ' ';  grid[8] = ' '; 

if (play % 2 == 0){
	while(count<9){
		player(grid);
			if(count==9) break;
		computer(grid);
			if(count==9) break;
	}
}
if (play % 2 == 1){
	while(count<9){
		computer(grid);
			if(count==9) break;
		player(grid);
			if(count==9) break;
	}
}
		printf("The score is: Me - %d,  You - %d\n\n", cscore, hscore);
		printf("Play again? Enter 0 for Yes, or 1 for No   ");
		scanf("%d", &game);
		play++;
		printf("\n\n");
	}
}