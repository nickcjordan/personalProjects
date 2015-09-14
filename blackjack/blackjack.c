#include <stdio.h>
#include <string.h>
#include <unistd.h>

typedef struct {
	char suit;
	char *num;
	int used;
	int val;
} deck;

deck game[4][13];
deck player[10]; deck playerSplit[10]; deck dealer[10];
int newSuit, newNum;
int aceP, aceC, loopy, pcount, ccount, chips, input, bet, playing=1, playCount=0, randVal1, randVal2;
int playerID; //player=0 for human, player=1 for dealer
int playerCardNum=0, dealerCardNum=0;

void pad(x){
	int i;
	for (i=0; i<x; i++) printf(" ");
}

int setSeed(){
		srand ((unsigned)time(NULL));
}

int randomCardValue(){
	int a = rand();
	return (a)%13;
}

int randomSuitValue(){
	int x = rand();
	return (x)%4;
}

void shuffle(){
	//shuffle deck
		//clubs
			game[0][0].suit = 'C';
			game[0][0].num = "2";
			game[0][0].used = 0;
			game[0][0].val = 2;

			game[0][1].suit = 'C';
			game[0][1].num = "3";
			game[0][1].used = 0;
			game[0][1].val = 3;

			game[0][2].suit = 'C';
			game[0][2].num = "4";
			game[0][2].used = 0;
			game[0][2].val = 4;

			game[0][3].suit = 'C';
			game[0][3].num = "5";
			game[0][3].used = 0;
			game[0][3].val = 5;

			game[0][4].suit = 'C';
			game[0][4].num = "6";
			game[0][4].used = 0;
			game[0][4].val = 6;

			game[0][5].suit = 'C';
			game[0][5].num = "7";
			game[0][5].used = 0;
			game[0][5].val = 7;

			game[0][6].suit = 'C';
			game[0][6].num = "8";
			game[0][6].used = 0;
			game[0][6].val = 8;

			game[0][7].suit = 'C';
			game[0][7].num = "9";
			game[0][7].used = 0;
			game[0][7].val = 9;

			game[0][8].suit = 'C';
			game[0][8].num = "10";
			game[0][8].used = 0;
			game[0][8].val = 10;

			game[0][9].suit = 'C';
			game[0][9].num = "J";
			game[0][9].used = 0;
			game[0][9].val = 10;

			game[0][10].suit = 'C';
			game[0][10].num = "Q";
			game[0][10].used = 0;
			game[0][10].val = 10;

			game[0][11].suit = 'C';
			game[0][11].num = "K";
			game[0][11].used = 0;
			game[0][11].val = 10;

			game[0][12].suit = 'C';
			game[0][12].num = "A";
			game[0][12].used = 0;
			game[0][12].val = 11;
		//spades
			game[1][0].suit = 'S';
			game[1][0].num = "2";
			game[1][0].used = 0;
			game[1][0].val = 2;

			game[1][1].suit = 'S';
			game[1][1].num = "3";
			game[1][1].used = 0;
			game[1][1].val = 3;

			game[1][2].suit = 'S';
			game[1][2].num = "4";
			game[1][2].used = 0;
			game[1][2].val = 4;

			game[1][3].suit = 'S';
			game[1][3].num = "5";
			game[1][3].used = 0;
			game[1][3].val = 5;

			game[1][4].suit = 'S';
			game[1][4].num = "6";
			game[1][4].used = 0;
			game[1][4].val = 6;

			game[1][5].suit = 'S';
			game[1][5].num = "7";
			game[1][5].used = 0;
			game[1][5].val = 7;

			game[1][6].suit = 'S';
			game[1][6].num = "8";
			game[1][6].used = 0;
			game[1][6].val = 8;

			game[1][7].suit = 'S';
			game[1][7].num = "9";
			game[1][7].used = 0;
			game[1][7].val = 9;

			game[1][8].suit = 'S';
			game[1][8].num = "10";
			game[1][8].used = 0;
			game[1][8].val = 10;

			game[1][9].suit = 'S';
			game[1][9].num = "J";
			game[1][9].used = 0;
			game[1][9].val = 10;

			game[1][10].suit = 'S';
			game[1][10].num = "Q";
			game[1][10].used = 0;
			game[1][10].val = 10;

			game[1][11].suit = 'S';
			game[1][11].num = "K";
			game[1][11].used = 0;
			game[1][11].val = 10;

			game[1][12].suit = 'S';
			game[1][12].num = "A";
			game[1][12].used = 0;
			game[1][12].val = 11;
		//diamonds
			game[2][0].suit = 'D';
			game[2][0].num = "2";
			game[2][0].used = 0;
			game[2][0].val = 2;

			game[2][1].suit = 'D';
			game[2][1].num = "3";
			game[2][1].used = 0;
			game[2][1].val = 3;

			game[2][2].suit = 'D';
			game[2][2].num = "4";
			game[2][2].used = 0;
			game[2][2].val = 4;

			game[2][3].suit = 'D';
			game[2][3].num = "5";
			game[2][3].used = 0;
			game[2][3].val = 5;

			game[2][4].suit = 'D';
			game[2][4].num = "6";
			game[2][4].used = 0;
			game[2][4].val = 6;

			game[2][5].suit = 'D';
			game[2][5].num = "7";
			game[2][5].used = 0;
			game[2][5].val = 7;

			game[2][6].suit = 'D';
			game[2][6].num = "8";
			game[2][6].used = 0;
			game[2][6].val = 8;

			game[2][7].suit = 'D';
			game[2][7].num = "9";
			game[2][7].used = 0;
			game[2][7].val = 9;

			game[2][8].suit = 'D';
			game[2][8].num = "10";
			game[2][8].used = 0;
			game[2][8].val = 10;

			game[2][9].suit = 'D';
			game[2][9].num = "J";
			game[2][9].used = 0;
			game[2][9].val = 10;

			game[2][10].suit = 'D';
			game[2][10].num = "Q";
			game[2][10].used = 0;
			game[2][10].val = 10;

			game[2][11].suit = 'D';
			game[2][11].num = "K";
			game[2][11].used = 0;
			game[2][11].val = 10;

			game[2][12].suit = 'D';
			game[2][12].num = "A";
			game[2][12].used = 0;
			game[2][12].val = 11;
		//hearts
			game[3][0].suit = 'H';
			game[3][0].num = "2";
			game[3][0].used = 0;
			game[3][0].val = 2;

			game[3][1].suit = 'H';
			game[3][1].num = "3";
			game[3][1].used = 0;
			game[3][1].val = 3;

			game[3][2].suit = 'H';
			game[3][2].num = "4";
			game[3][2].used = 0;
			game[3][2].val = 4;

			game[3][3].suit = 'H';
			game[3][3].num = "5";
			game[3][3].used = 0;
			game[3][3].val = 5;

			game[3][4].suit = 'H';
			game[3][4].num = "6";
			game[3][4].used = 0;
			game[3][4].val = 6;

			game[3][5].suit = 'H';
			game[3][5].num = "7";
			game[3][5].used = 0;
			game[3][5].val = 7;

			game[3][6].suit = 'H';
			game[3][6].num = "8";
			game[3][6].used = 0;
			game[3][6].val = 8;

			game[3][7].suit = 'H';
			game[3][7].num = "9";
			game[3][7].used = 0;
			game[3][7].val = 9;

			game[3][8].suit = 'H';
			game[3][8].num = "10";
			game[3][8].used = 0;
			game[3][8].val = 10;

			game[3][9].suit = 'H';
			game[3][9].num = "J";
			game[3][9].used = 0;
			game[3][9].val = 10;

			game[3][10].suit = 'H';
			game[3][10].num = "Q";
			game[3][10].used = 0;
			game[3][10].val = 10;

			game[3][11].suit = 'H';
			game[3][11].num = "K";
			game[3][11].used = 0;
			game[3][11].val = 10;

			game[3][12].suit = 'H';
			game[3][12].num = "A";
			game[3][12].used = 0;
			game[3][12].val = 11;
}
void setup(){
	printf("\n\n\n\n");
	input=0; ccount=0; pcount=0; bet=0; aceP=0; aceC=0; playerCardNum=0; dealerCardNum=0; //reset values
	if (playCount>7){
		shuffle();
		playCount=0;
	}
}

void win(){
//collect and display winnings
	chips += bet;
	pad(20); printf("You Won!\n\n");
	pad(15); printf("Chip Count: %d\n\n", chips);
}

void lose(){
//lose and display player bet 
	chips -= bet;
	if (chips<=0){ 
		pad(20); printf("Game Over!\n\n");
		pad(15); printf("You are out of chips.\n\n");
		playing=0;
	}
	else {
		pad(10); printf("You Lose!\n\n	Chip Count: %d\n\n", chips);
	}
}

int bust(){
//check if bust, return T or F
	if (pcount>21){
		pad(10); printf("You Bust!\n");
		lose();
		return 1;
	}	
	return 0;
}

void makeBet(){
	//player makes bet
	do {pad(10); printf("You Have %d Chips Left. Make Your Bet: ", chips);
		scanf("%d", &bet);  printf("\n\n");
		loopy=0;
		if (bet>chips){
			printf("You do not have enough chips. Enter a number between 0 and %d.\n\n", chips+1);
			loopy=1;
		}
	} while (loopy==1);
}

void beginGame(){
	chips=1000; //set initial chip count
	printf("\n\n\n\n"); 
	pad(10); printf("Let's Play.\n\n"); 
	pad(10); printf("You start with 1000 chips.\n");
}

void drawCard(int ID){
	do{ newSuit=randomSuitValue(); newNum=randomCardValue();}
		while (game[newSuit][newNum].used==1);
	if (ID==0){
		player[playerCardNum].suit = game[newSuit][newNum].suit;
		player[playerCardNum].num = game[newSuit][newNum].num;
		player[playerCardNum].val = game[newSuit][newNum].val;
		game[newSuit][newNum].used = 1;
		pcount+= player[playerCardNum].val;
		if (player[playerCardNum].num=="A") aceP++;
		playerCardNum++;
	}
	if (ID==1){
		dealer[dealerCardNum].suit = game[newSuit][newNum].suit;
		dealer[dealerCardNum].num = game[newSuit][newNum].num;
		dealer[dealerCardNum].val = game[newSuit][newNum].val;
		game[newSuit][newNum].used = 1;
		ccount+= dealer[dealerCardNum].val;
		if (dealer[dealerCardNum].num=="A") aceC++;
		dealerCardNum++;
	}
}

void dealBlackJack(){
	drawCard(1); showHand(1);
	drawCard(0);  
	drawCard(1);
	sleep(1.5);
	drawCard(0); showHand(0);
}

int playerBlackjack(){
	if (pcount==21) {
		pad(15); printf("Blackjack!\n\n");
		bet += bet/2;
		return 1;
	}
	return 0;
}

void cardCount(int ID){
	pad(5);
	if (ID==0) printf("Your Card Count: %d\n\n", pcount);
	if (ID==1) printf("Dealer's Card Count: %d\n\n", ccount);
}

void aceCheck(int ID){
	if (ID==1 && ccount>21 && aceC>0){ //if dealer busted but has ace
		ccount -= 10;
		aceC--;
	}
	else if (ID==0 && pcount>21 && aceP>0){ //if player busted but has ace
		pcount -= 10;
		aceP--;
	}
}

showHand(int ID){
	int i;
	if (ID==0){ 
		pad(5); printf("Your Hand: \n");
		pad(10); for (i=0; i<playerCardNum; i++){ printf(" _____ "); pad(3);} printf("\n"); 
		pad(10); for (i=0; i<playerCardNum; i++){ printf("|     |"); pad(3);} printf("\n"); 
		pad(10); for (i=0; i<playerCardNum; i++){ printf("|%c    |", player[i].suit); pad(3);} printf("\n");
		pad(10); for (i=0; i<playerCardNum; i++){ 
			if (player[i].num=="10"){ printf("|  %s |", player[i].num); pad(3);}
			else{ printf("|  %s  |", player[i].num); pad(3);}} printf("\n");
		pad(10); for (i=0; i<playerCardNum; i++){ printf("|    %c|", player[i].suit); pad(3);} printf("\n");
		pad(10); for (i=0; i<playerCardNum; i++){ printf("|_____|"); pad(3);} printf("\n\n");
	}
	if (ID==1){ 
		pad(5); printf("Dealer's Hand: \n");
		pad(10); for (i=0; i<dealerCardNum; i++){ printf(" _____ "); pad(3);} printf("\n"); 
		pad(10); for (i=0; i<dealerCardNum; i++){ printf("|     |"); pad(3);} printf("\n"); 
		pad(10); for (i=0; i<dealerCardNum; i++){ printf("|%c    |", dealer[i].suit); pad(3);} printf("\n");
		pad(10); for (i=0; i<dealerCardNum; i++){ 
			if (dealer[i].num=="10"){ printf("|  %s |", dealer[i].num); pad(3);}
			else{ printf("|  %s  |", dealer[i].num); pad(3);}} printf("\n");
		pad(10); for (i=0; i<dealerCardNum; i++){ printf("|    %c|", dealer[i].suit); pad(3);} printf("\n");
		pad(10); for (i=0; i<dealerCardNum; i++){ printf("|_____|"); pad(3);} printf("\n\n");
	}
}

void hit(int ID){
	sleep(1.5);
	pad(5); printf("Hit, the next card is drawn.\n");
	drawCard(ID);
	showHand(ID);
	aceCheck(ID);
	cardCount(ID);
}

void startDealer(){
	sleep(1.5);
	pad(5); printf("You chose to stay. It is now the dealer's turn.\n\n");
	showHand(1);
	cardCount(1);
	cardCount(0);
}

void playDealer(){
	startDealer();
	while (ccount<16){ 
		hit(1);
	}
}

void endRound(){
	if (ccount>21){	//if dealer busts
		sleep(1.5);
		pad(20); printf("The dealer busted!\n");
		win();
	}
	else if (ccount<pcount){ //neither bust, player wins
		sleep(1.5);
		pad(20); printf("Your card total of %d is higher than the dealers total of %d.\n", pcount, ccount);
		win();
	}
	else if (ccount>pcount) { //neither bust, dealer wins
		sleep(1.5);
		pad(20); printf("Your card total of %d is lower than the dealers total of %d.\n", pcount, ccount);
		lose();
	}
	else if (ccount==pcount){ //if its a tie
		sleep(1.5);
		pad(20); printf("Both you and the dealer had total card count of %d.\n", pcount);
		pad(20); printf("It's a Push. Your Chips Are Returned.\n\n");
		pad(15); printf("Chip Count: %d\n\n", chips);
	}
}

void action(){
	sleep(1);
	pad(13); printf("Actions:\n");
	pad(15); printf("1) Hit\n");
	pad(15); printf("2) Stay\n");
	if (playerCardNum==2){ //if this is the first action of the round
		pad(15); printf("3) Double Down\n");
		if (player[0].num == player[1].num){
			pad(15); printf("4) Split Hand\n");
		}
	}
	printf("\n"); pad(13); printf("Enter Action Number: "); 
	scanf("%d", &input); printf("\n\n");
}

void doubleDown(){
	if (2*bet<=chips){
		bet+=bet;
		pad(5); printf("You chose to double down. Your bet has been doubled.\n");
	}
	else {
		bet = chips;
		pad(5); printf("You chose to double down. Your bet has been maxed.\n");
	}
	hit(0);
	if (bust()){ input=0;}
}

void splitHand(void);

void play(){
	action();
	if (input==3) doubleDown();
	if (input==4) splitHand();
	while (input==1){
		hit(0);
			if (bust()){ input=0;}
			else { action();}
	}
}

void splitHand(){
	if (2*bet<=chips){
		sleep(1.5);
		pad(5); printf("You chose to split your cards.\n");
		pad(10); printf("Starting First Split Hand:\n\n");
		playerSplit[0] = player[1]; //save second card
		pcount = player[0].val; 
		playerCardNum--;
		if (player[1].num=="A") aceP--;
		drawCard(0);
		showHand(0);
		cardCount(0);
		play();
		if (input!=0){ //if player didnt bust or blackjack
			playDealer();
			endRound();
		}
		pad(10); printf("Starting Second Split Hand:\n");
		player[0] = playerSplit[0];
		pcount=playerSplit[0].val; playerCardNum=1; ccount=0; dealerCardNum=0; //reset values
		drawCard(1);
		showHand(1);
		if (player[0].num=="A") aceP=1;
		else aceP=0;
		drawCard(0);
		showHand(0);
		drawCard(1);
		cardCount(0);
		play();
	}
	else{
		pad(5); printf("You do not have enough chips to split hand. Hit or Stay.\n\n");
	action();
	}
}

int main(){
	setSeed(); //set random number seed
	beginGame(); //set chips=1000, print intro 
	shuffle();
	while (playing) {
		setup(); //shuffle deck, reset starting values
		makeBet(); //give initial bet amount
		dealBlackJack(); //deal player and dealer hands
		if (playerBlackjack()){ //check for player blackjack
			win();
			input=0;
		}
		else
			play(); //player plays Hand

		if (input!=0){ //if player didnt bust or blackjack
			playDealer();
			endRound();
		}

		if (playing) { 	//continue to next round
			pad(15); printf("Next Round...\n\n");
		}
	}
}
