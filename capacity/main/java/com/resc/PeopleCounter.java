package com.resc;

public class PeopleCounter {
	private static int signedUpEntered;
	private static int signedUpLeft;
	private static int walkInEntered;
	private static int walkInLeft;
	
	public static int howManySignedUpRemaining() {
		
		int howManyLeft= signedUpLeft>signedUpEntered?signedUpEntered:signedUpLeft;
		int howManySpotsRemaining = StatusCounter.getSignUpsForMyShift()-PeopleCounter.getSignedUpOnGrounds() -howManyLeft;
		return howManySpotsRemaining;
	}
	
	public static int howManyWalkInsRemaining() {
		int howManyLeftSignedUp= signedUpLeft>signedUpEntered?signedUpEntered:signedUpLeft;
		int spotsRemaining = StatusCounter.getMaxCapacity()-StatusCounter.getSignUpsForMyShift()-PeopleCounter.getWalkInOnGrounds()+howManyLeftSignedUp ;
		return spotsRemaining;
	}
	
	
	public static void resetCounter() {
		signedUpEntered=0;
		signedUpLeft=0;
		walkInEntered=0;
		walkInLeft=0;
	}
	public static void signedUpWalkedIn() {
		signedUpEntered++;
	}
	public static void signedUpWalkedOut() {
		signedUpLeft++;
		if(signedUpLeft >signedUpEntered) {
			signedUpLeft=signedUpEntered;
		}
	}
	public static void walkedUpWalkedIn() {
		walkInEntered++;
	}
	public static void walkedUpWalkedOut() {
		walkInLeft++;
		if(walkInLeft >walkInEntered) {
			walkInLeft=walkInEntered;
		}
	}


	public static int getSignedUpOnGrounds() {
		return signedUpEntered - signedUpLeft<0?0:signedUpEntered - signedUpLeft;
	}

	public static int getWalkInOnGrounds() {
		return walkInEntered - walkInLeft<0?0:walkInEntered - walkInLeft;
	}

	public static int getSignedUpEntered() {
		return signedUpEntered;
	}

	public static void setSignedUpEntered(int signedUpEntered) {
		PeopleCounter.signedUpEntered = signedUpEntered;
	}

	public static int getSignedUpLeft() {
		return signedUpLeft;
	}

	public static void setSignedUpLeft(int signedUpLeft) {
		PeopleCounter.signedUpLeft = signedUpLeft;
	}

	public static int getWalkInEntered() {
		return walkInEntered;
	}

	public static void setWalkInEntered(int walkInEntered) {
		PeopleCounter.walkInEntered = walkInEntered;
	}

	public static int getWalkInLeft() {
		return walkInLeft;
	}

	public static void setWalkInLeft(int walkInLeft) {
		PeopleCounter.walkInLeft = walkInLeft;
	}

}
