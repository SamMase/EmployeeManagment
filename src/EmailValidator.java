public class EmailValidator {

	public static void main(String[] args) {

		System.out.println(isValidEmail("abc") ? "Failed" : "Passed");
		System.out.println(isValidEmail("abc@") ? "Failed" : "Passed");
		System.out.println(isValidEmail("@dfdhvh") ? "Failed" : "Passed");
		System.out.println(isValidEmail(".hgxs") ? "Failed" : "Passed");
		System.out.println(isValidEmail("fdvdf.") ? "Failed" : "Passed");
		System.out.println(isValidEmail("jg@bh@") ? "Failed" : "Passed");
		System.out.println(isValidEmail("fffv.fvdf.") ? "Failed" : "Passed");
		System.out.println(isValidEmail("jdncj@.dcd") ? "Failed" : "Passed");
		System.out.println(isValidEmail("fvf.fvf@.vd.vc") ? "Failed" : "Passed");
		System.out.println(isValidEmail("abc@bn.i") ? "Passed" : "Failed");
		System.out.println(isValidEmail("bshxb@hjb.in") ? "Passed" : "Failed");
		System.out.println(isValidEmail("bsdjs.dcd@jhbj.in") ? "Passed" : "Failed");
		System.out.println(isValidEmail("ab@i.i") ? "Failed" : "Passed");
		System.out.println(isValidEmail("a@i.i") ? "Failed" : "Passed");
		System.out.println(isValidEmail("hjg9@gnm.i") ? "Passed" : "Failed");
		System.out.println(isValidEmail("bcnc@nc0.i") ? "Failed" : "Passed");
		System.out.println(isValidEmail("hghg@nnj.i9") ? "Failed" : "Passed");
		System.out.println(isValidEmail("jnn@bhj9.i6n") ? "Failed" : "Passed");
		System.out.println(isValidEmail("9dvd@dc.i") ? "Passed" : "Failed");
		System.out.println(isValidEmail("shubhma@gmail.com") ? "Passed" : "Failed");
	}

	public static boolean isValidEmail(String email) {

		boolean isValid = false;
		char[] emailArray = email.toCharArray();
		int atTheRatePosition = -1;
		int dotPositionAfterAtTheRate = -1;

		if ((email.startsWith("@") || email.endsWith("@")) || (email.startsWith(".") || email.endsWith("."))) {

			return isValid;

		}

		for (int i = 0; i < emailArray.length; i++) {

			if (!(emailArray[i] >= 'a' && emailArray[i] <= 'z')) {

				if (emailArray[i] == '@') {

					if (atTheRatePosition == -1) {

						isValid = true;
						atTheRatePosition = i + 1;

					} else {

						isValid = false;
						return isValid;

					}

					if (emailArray[i + 1] == '.') {

						isValid = false;
						return isValid;

					}

				} else if (emailArray[i] == '.') {

					if (atTheRatePosition != -1) {

						if (dotPositionAfterAtTheRate == -1) {

							dotPositionAfterAtTheRate = i - atTheRatePosition;
							isValid = true;

						} else {

							isValid = false;
							return isValid;

						}

					}

					if (emailArray[i + 1] == '@') {

						isValid = false;
						return isValid;

					}

				} else if (emailArray[i] >= '1' || emailArray[i] <= '9') {

					if (i > email.indexOf("@")) {

						isValid = false;
						return isValid;

					}

				} else {

					isValid = false;
					return isValid;

				}

			}

		}

		if (atTheRatePosition < 3 || dotPositionAfterAtTheRate < 2) {

			isValid = false;

		}

		return isValid;

	}

}
