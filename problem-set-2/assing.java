//Question 1 - C
// "We broke even"

//Question 2
// "I guess you like cats more"

//Question 3
boolean canSeePlayer = true
boolean playerPowerdUp = false

//Question 4
boolean isSnowing = false;
boolean isRaining = true;
double temperature = 60.0;
if(isSnowing || isRaining || temperature < 50) {
	System.out.println("Let’s stay home.");
} else {
	System.out.println("Let's go out!");
}

//Question 5
//Assume this could have any value between 0 and 24:
int time = 18;
String timeOfDay;
//TODO: set timeOfDay to the correct String value.
if (time >= 5 && time < 12) {
	timeOfDay = "morning";
} else if(time >= 12 && time < 20) {
	timeOfDay = "daytime";
} else {
	timeOfDay = "night";
}

//Question 6
//Assume these could have any value:
int weekday = 5;
boolean holiday = false;

if(holiday) {
	System.out.println("Sleep in");
} else if (weekday > 5) {
	System.out.println("Sleep in");
} else {
	System.out.println("Wake up at 7:00");
}

//Question 7
double playbackPosition = 120;
boolean rewinding = true;

if (rewinding) {
	double rewindAmount = 0.1;
	playbackPosition = playbackPosition - rewindAmount;
}

//Question 8
//Assume this can have any value from 1 to 7:
int dayOfWeek = 1;

//TODO: declare a String variable called schedule.
String schedule;

//TODO: write a switch statement that give schedule a different
//value for each day of the week based on the dayOfWeek variable.
//Don’t forget to "break" after each case, and don’t forget to
//provide a default case!

switch(dayOfWeek) {
	case 1:
		schedule = "Gym in the morning.";
		break;
	case 2:
		schedule = "Class after work.";
		break;
	case 3:
		schedule = "Meetings all day";
		break;
	case 4:
		schedule = "Work from home.";
		break;
	case 5:
		schedule = "Game night after work.";
		break;
	case 6:
	case 7:
	default:
		schedule = "Free!"
		break;
}
