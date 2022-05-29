package comparisonOperators;

public class AndOperatorExample {

	public static void main(String[] args) {
		
		int totalMarks = 500;
		
		int requiredTotalMarks = 600;
		
		boolean isTotalMarkSufficient = totalMarks>=requiredTotalMarks;
		
		int marksInBiology = 80;
		
		int requiredMarksinBiology = 90;
		
		boolean isMarksinBiologySuffficent = marksInBiology>=requiredMarksinBiology;
		
		boolean isEligibleForAdmission = isTotalMarkSufficient && isMarksinBiologySuffficent;
		
		System.out.println("is Eligible for admission : "+isEligibleForAdmission);
		

	}

}
