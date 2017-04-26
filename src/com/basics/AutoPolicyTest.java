package com.basics;

public class AutoPolicyTest {
	public static void main(String[] args) {
		AutoPolicy policy1 = new AutoPolicy(1111111, "Honda Accord", "MA");
		AutoPolicy policy2 = new AutoPolicy(2222222, "Ford fusion", "CA");
		AutoPolicy policy3 = new AutoPolicy(3333333, "Toyato cambry", "WA");
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		policyInNoFaultState(policy3);
		}		
		public static void policyInNoFaultState(AutoPolicy policy){
		System.out.printf("Account # %d%n Model and Make : %s%n %s a no-fault state%n%n",
						  policy.getAccountNumber(),policy.getMakeAndModel(),
						  (policy.isNofaultstate() ? "is" : "is not"));	
		}

}
