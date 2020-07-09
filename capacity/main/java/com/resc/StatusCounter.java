package com.resc;

public class StatusCounter {

	
	
	public static boolean takeSignUps=true;
	
	
	public static boolean isTakeSignUps() {
		return takeSignUps;
	}
	public static void setTakeSignUps(boolean tsu) {
		takeSignUps = tsu;
	}
	public static boolean isShiftOne = true;
	
	public static boolean isShiftOne() {
		return isShiftOne;
	}
	public static void setShiftOne(boolean isShiftOne) {
		StatusCounter.isShiftOne = isShiftOne;
	}
	private static String shiftOne="11:30-3:15";
	private static String shiftTwo="3:45-7:30";
	private static int maxCapacity=250;
	
	
	public static int getSignUpsForMyShift() {
		if(isShiftOne) {
			return getShiftOneSignUps();
		}else {
			return getShiftTwoSignUps();
		}
	}
	private static int shiftOneSignUps = 0;
	private static int shiftTwoSignUps = 0;
	public static String getShiftOne() {
		return shiftOne;
	}
	public static void setShiftOne(String shiftOne) {
		StatusCounter.shiftOne = shiftOne;
	}
	public static String getShiftTwo() {
		return shiftTwo;
	}
	public static void setShiftTwo(String shiftTwo) {
		StatusCounter.shiftTwo = shiftTwo;
	}
	public static int getMaxCapacity() {
		return maxCapacity;
	}
	public static void setMaxCapacity(int maxCapacity) {
		StatusCounter.maxCapacity = maxCapacity;
	}
	public static int getShiftOneSignUps() {
		return shiftOneSignUps;
	}
	public static void setShiftOneSignUps(int shiftOneSignUps) {
		StatusCounter.shiftOneSignUps = shiftOneSignUps;
	}
	public static int getShiftTwoSignUps() {
		return shiftTwoSignUps;
	}
	public static void setShiftTwoSignUps(int shiftTwoSignUps) {
		StatusCounter.shiftTwoSignUps = shiftTwoSignUps;
	}
	
	
}
