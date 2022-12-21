import java.util.Random;

public class Computer extends Player {
    public static void main(String[] args){}


	private String value;

	public String getValue() {

		return value;
	}

	public void setValue() {
		Random random = new Random();

		int num = random.nextInt(3) + 1;

		if (num == 1)
			value = "Rock";
		else if (num == 2)
			value = "Paper";
		else
			value = "Scissors";
	}

}