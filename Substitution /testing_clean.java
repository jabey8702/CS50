class testing_clean{

	static boolean repetition_check(String input) {
		String checking_progress = "";
		for (int i = 0; i < input.length() - 1; ++i) {
			checking_progress += input.charAt(i);
			for(int j = 0; j < checking_progress.length(); ++j) {
				if (checking_progress.charAt(j) == input.charAt(i+1)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String word = "";
		if (repetition_check(word)) {
			System.out.println("Repetition Detected");
		} else {
			System.out.println("No Repetition Detected");
		}
	}
}