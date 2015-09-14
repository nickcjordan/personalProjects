#include <stdio.h>
#include <string.h>

typedef struct {
	char *q;
	char *a;
	int val;
	int used;
} question;

int a=0, b=0, count=0, score=0, input, i=0, j=0, num, playing=1, ccount=0, scount=0, fcount=0, rcount=0;
double perc;
char answer[20], que[150], ans[150];
question q[4][15];
FILE *r;


void say(input){
//print title of category
	switch (input){
		case 0: printf("					The Category is:    Nick's Childhood\n\n\n 			Now pick your question...\n"); ccount++; break;
		case 1: printf("					The Category is:    Nick's School Life\n\n\n 			Now pick your question...\n"); scount++; break;
		case 2: printf("					The Category is:    Nick's Favorite Things\n\n\n 			Now pick your question...\n"); fcount++; break;
		case 3: printf("					The Category is:    Random Facts About Nick\n\n\n 			Now pick your question...\n"); rcount++; break;
	}
//print available questions after each difficulty
	printf("\n			Easy:\n");
	for(i = 0; i < (!(input%2)*5+10); i++) {
		if (i==5) {
			if (input%2==0) printf("\n			Medium:\n");
			else printf("\n			Hard:\n");
		}
		if (i==10)  printf("\n			Hard:\n");
		if (q[input][i].used==0)  printf("			  Question %d\n", i+1);
	}
}

void check(input, num){
//print question, user inputs answer
	printf("\n  	Here is your question:\n\n\n\n 	%s\n\n\n\n				Enter Answer: ", q[input][num].q);
	scanf("%s", answer);
//if answer is correct
	if (!strcmp(answer, q[input][num].a)){
		printf("\n					Correct!\n\n");
		score+= q[input][num].val;
	}
//if answer is wrong
	else printf("\n			      I'm sorry, that is incorrect. \n\n			    The correct answer was \"%s\"\n\n", q[input][num].a);
//mark question "used", print score
	q[input][num].used = 1;
	perc = ((double)score/count)*100;
//if the game is over
	if (count==50){ 
		playing = 0;
		printf("			You have finished the trivia game.\n\n			Your final score was %d/%d, or %%%3.0f\n\n", score, count, perc);
		return;
	}
//if game is not over
	printf("				Points: %d/%d\n				Percentage: %%%3.0f\n\n			Now to the next question...\n\n", score, count, perc);
}

int main(){
// childhood questions
	q[0][0].q = "The name of my pee-wee soccer team was The _______.";
	q[0][0].a = "sharks";
	q[0][0].val = 1;
	q[0][0].used = 0;
	q[0][1].q = "The elementary school I went to was _________ Creek Elementary.";
	q[0][1].a = "denton";
	q[0][1].val = 1;
	q[0][1].used = 0;
	q[0][2].q = "What game was played at the birthday party of mine that was held inside a basketball gym?";
	q[0][2].a = "dodgeball";
	q[0][2].val = 1;
	q[0][2].used = 0;
	q[0][3].q = "My lacrosse number was twenty-_______. (type the word, ex. \"nine\")";
	q[0][3].a = "five";
	q[0][3].val = 1;
	q[0][3].used = 0;
	q[0][4].q = "I graduated high school in two thousand and _______. (type the word, ex. \"nine\")";
	q[0][4].a = "twelve";
	q[0][4].val = 1;
	q[0][4].used = 0;
	q[0][5].q = "What was my position in lacrosse? (must be exact termonology)";
	q[0][5].a = "midi";
	q[0][5].val = 2;
	q[0][5].used = 0;
	q[0][6].q = "Who was my very best friend as a child? (first name only)";
	q[0][6].a = "hunter";
	q[0][6].val = 2;
	q[0][6].used = 0;
	q[0][7].q = "I was number ________-six in football my senior year of high school. (type the word, ex. \"nine\")";
	q[0][7].a = "eighty";
	q[0][7].val = 2;
	q[0][7].used = 0;
	q[0][8].q = "What was the last name of our neighbors directly across the street at 308 Park Meadow Way?";
	q[0][8].a = "cook";
	q[0][8].val = 2;
	q[0][8].used = 0;
	q[0][9].q = "What was the very first position I played in football?";
	q[0][9].a = "quarterback";
	q[0][9].val = 2;
	q[0][9].used = 0;
	q[0][10].q = "What was the first sport that I ever quit playing?";
	q[0][10].a = "baseball";
	q[0][10].val = 3;
	q[0][10].used = 0;
	q[0][11].q = "What was the name of my grey hamster?";
	q[0][11].a = "sammy";
	q[0][11].val = 3;
	q[0][11].used = 0;
	q[0][12].q = "The name of the group Chris, Will, and I formed was called the ____ pack.";
	q[0][12].a = "rat";
	q[0][12].val = 3;
	q[0][12].used = 0;
	q[0][13].q = "What repeated word made up the name of the character from The Three Ninjas that I would pretend to be?";
	q[0][13].a = "tum";
	q[0][13].val = 3;
	q[0][13].used = 0;
	q[0][14].q = "What game was I playing (in the living room) when I had to get stiches between my eyes?";
	q[0][14].a = "soccer";
	q[0][14].val = 3;
	q[0][14].used = 0;

//school questions
	q[1][0].q = "My degree is a part of the College of _________ Science.";
	q[1][0].a = "natural";
	q[1][0].val = 1;
	q[1][0].used = 0;
	q[1][1].q = "What was the last name of the coach who recruited me to UT?";
	q[1][1].a = "applewhite";
	q[1][1].val = 1;
	q[1][1].used = 0;
	q[1][2].q = "Which subject have I always enjoyed the most?";
	q[1][2].a = "science";
	q[1][2].val = 1;
	q[1][2].used = 0;
	q[1][3].q = "My senior year of high school, I was a _________ Aid.";
	q[1][3].a = "office";
	q[1][3].val = 1;
	q[1][3].used = 0;
	q[1][4].q = "The name of my first dorm was San _________ Dorm.";
	q[1][4].a = "jacinto";
	q[1][4].val = 1;
	q[1][4].used = 0;
	q[1][5].q = "What state houses the university that gave me my first official scholarship offer?";
	q[1][5].a = "illinois";
	q[1][5].val = 3;
	q[1][5].used = 0;
	q[1][6].q = "What is the first computer language I learned to program in?";
	q[1][6].a = "java";
	q[1][6].val = 3;
	q[1][6].used = 0;
	q[1][7].q = "What type of operating system is installed on my Acer laptop? (think general, not specific flavor/version)";
	q[1][7].a = "linux";
	q[1][7].val = 3;
	q[1][7].used = 0;
	q[1][8].q = "What was the last name of my kindergarten teacher?";
	q[1][8].a = "creel";
	q[1][8].val = 3;
	q[1][8].used = 0;
	q[1][9].q = "In what subject did I get my first college class credit?";
	q[1][9].a = "spanish";
	q[1][9].val = 3;
	q[1][9].used = 0;

//favorites questions
	q[2][0].q = "What is my favorite fruit?";
	q[2][0].a = "strawberry";
	q[2][0].val = 1;
	q[2][0].used = 0;
	q[2][1].q = "What is my favorite color? (general colors)";
	q[2][1].a = "blue";
	q[2][1].val = 1;
	q[2][1].used = 0;
	q[2][2].q = "What is my favorite food?";
	q[2][2].a = "sushi";
	q[2][2].val = 1;
	q[2][2].used = 0;
	q[2][3].q = "in what month was I born?";
	q[2][3].a = "october";
	q[2][3].val = 1;
	q[2][3].used = 0;
	q[2][4].q = "My favorite super hero is ____ Man.";
	q[2][4].a = "iron";
	q[2][4].val = 1;
	q[2][4].used = 0;
	q[2][5].q = "What is my all time favorite tv show?";
	q[2][5].a = "lost";
	q[2][5].val = 2;
	q[2][5].used = 0;
	q[2][6].q = "What is the last name of my biggest celebrity crush?";
	q[2][6].a = "watson";
	q[2][6].val = 2;
	q[2][6].used = 0;
	q[2][7].q = "What is my favorite number? (type the word, ex. \"nine\")";
	q[2][7].a = "five";
	q[2][7].val = 2;
	q[2][7].used = 0;
	q[2][8].q = "What is my favorite type of cake?";
	q[2][8].a = "strawberry";
	q[2][8].val = 2;
	q[2][8].used = 0;
	q[2][9].q = "What is the first word of my favorite cartoon?";
	q[2][9].a = "adventure";
	q[2][9].val = 2;
	q[2][9].used = 0;
	q[2][10].q = "What is my favorite make of cars?";
	q[2][10].a = "audi";
	q[2][10].val = 3;
	q[2][10].used = 0;
	q[2][11].q = "What is my favorite medium to create art with? (medium, not utensil)";
	q[2][11].a = "graphite";
	q[2][11].val = 3;
	q[2][11].used = 0;
	q[2][12].q = "What was the name of my favorite Beanie Baby as a child?";
	q[2][12].a = "cheeser";
	q[2][12].val = 3;
	q[2][12].used = 0;
	q[2][13].q = "What is my favorite animal?";
	q[2][13].a = "penguin";
	q[2][13].val = 3;
	q[2][13].used = 0;
	q[2][14].q = "What is my LEAST favorite food?";
	q[2][14].a = "tomatoes";
	q[2][14].val = 3;
	q[2][14].used = 0;

//random questions
	q[3][0].q = "What is the last name of my first college room mate?";
	q[3][0].a = "holtz";
	q[3][0].val = 1;
	q[3][0].used = 0;
	q[3][1].q = "What is the first word of the nick name my sisters call me?";
	q[3][1].a = "fig";
	q[3][1].val = 1;
	q[3][1].used = 0;
	q[3][2].q = "What is the make of my first car?";
	q[3][2].a = "pontiac";
	q[3][2].val = 1;
	q[3][2].used = 0;
	q[3][3].q = "What was the first sport I ever played competitively?";
	q[3][3].a = "soccer";
	q[3][3].val = 1;
	q[3][3].used = 0;
	q[3][4].q = "How many steps back do I take when kicking a field goal? (type the word, ex. \"nine\")";
	q[3][4].a = "three";
	q[3][4].val = 1;
	q[3][4].used = 0;
	q[3][5].q = "The name of the club soccer team I played for was The Dallas Texans West _____.";
	q[3][5].a = "red";
	q[3][5].val = 3;
	q[3][5].used = 0;
	q[3][6].q = "What was the name of the fish I had in college?";
	q[3][6].a = "dino";
	q[3][6].val = 3;
	q[3][6].used = 0;
	q[3][7].q = "If I could be any animal, what would it be?";
	q[3][7].a = "eagle";
	q[3][7].val = 3;
	q[3][7].used = 0;
	q[3][8].q = "What is my least favorite season?";
	q[3][8].a = "winter";
	q[3][8].val = 3;
	q[3][8].used = 0;
	q[3][9].q = "I worked at a _________ store in highschool. (the type, ex. clothing)";
	q[3][9].a = "hardware";
	q[3][9].val = 3;
	q[3][9].used = 0;


//intro post
	printf("\n\n					Welcome to Nick Trivia!\n\n 	    Type the answer to each question and hit enter, at the end you will recieve a score.\n  			     The higher the score, the better you know me!\n\n				(type all entries entirely in lower case)\n\n\n			  		     Let's begin...\n\n\n");
//begin gameplay loop
	while (playing){
//category page
		printf("	  	Topics:	   1) Childhood   -   2) School   -   3) Favorites   -   4) Random\n\n\n			Enter topic number: ");
//user picks category, checks if any q's available
		scanf("%d", &input); input--; printf("\n\n");
		if ((input==0 && ccount>=15) || (input==1 && scount>=10) || (input==2 && fcount>=15) || (input==3 && rcount>=10)){
			printf("		Sorry, this category is out of questions. Please pick another.\n\n");
			continue;
		}
//print questions left in category
		say(input);
//user picks question, prints question
		printf("\n 		Enter question number:  ");
		scanf("%i", &num);
		count+= q[input][num-1].val;
//user inputs answer, checks answer, returns right/wrong
		check(input, num-1);
	} //end gameplay loop
} //end main