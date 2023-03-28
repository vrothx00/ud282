//Question 1 - D - 80

//Question 2
public int factorial(int n) {
	int total = 1;
	for(int i = 1; i <= n; i++) {
		total *= i;
	}
	return total;
}

//Question 3
public int indexOfFirstOccurrence(String[] stringArray, String target)
{
	int idx = -1;
	for(int i = 0; i < stringArray.length; i++) {
		if(target.equals(stringArray[i])) {
			idx = stringArray[i];
			break;
		}
	}
	return idx;
}

//Question 4
public int yearsTilOneMillion(double initialBalance) {
	int years = 0;
	while(initialBalance >= 1000000) {
		initialBalance *= 1.5;
		year += 1;
	}
	return years;
}

//Question 5
public void printInReverse(String[] stringArray) {
	for(let i = stringArray.length - 1; i >= 0; i--) {
		System.out.println(stringArray[i]);
	}
}

//Question 6
public int findRange(int[] intArray) {
	int range = -1;
	int minArr = intArray[0];
	int maxArr = intArray[0];
	for(int i = 1; i < intArray.length; i++) {
		if (minArr > intArray[i]) {
			minArr = intArray[i];
		}
		if (maxArr < intArray[i]) {
			maxArr = intArray[i];
		}
	}
	range = maxArr - minArr;
	return range;
}


//Question 7
// #
// ##
// ###

//Question 8
public int randomNum(int sides) {
	int x = (int) Math.random() * sides;
	return x;
}
public int monopolyRoll() {
	int sum = 0;
	int x = randomNum(6);
	int y = randomNum(6);
	if (x != y) {
		sum = x + y;
	} else {
		int z = randomNum(6);
		int w = randomNum(6);
		sum = x + y + z + w;
	}
	return sum;
}
