package stacks;

public class StackTesting {

	public static void main(String[] args) throws StackFullException {

		StacksUsingArrays stack = new StacksUsingArrays(10);

		for (int i = 0; i < stack.size(); i++) {
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				System.out.println("Empty Stack");
			}
		}

	}
}
