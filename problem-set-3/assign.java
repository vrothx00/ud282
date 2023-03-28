//Question 1 - B float

//Question 2 -
public boolean isPrime(int x)

//Question 3 - A. public getAccountBalanace(long accountNumber)

//Question 4
public double absoluteValue(double n) {
	if(n < 0) {
		return -n;
	} else {
		return n;
	}
}

//Question 5
public double calculateTip(double cost) {
	double tip = cost * 0.15;
	return tip;
}

//Question 6
public String nametagText(String name) {
	return "Hello, my name is " + name;
}

//Question 7
public double fahrenheitToCelsius(double temp) {
	// C = (F − 32) × 5/9.
	double celsius = (temp - 32) * 5 / 9;
	return celsius;
}


public void printTemperature(double temp) {
	System.out.println("F " + temp);
	System.out.println("C " + fahrenheitToCelsius(temp));
}


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
