package recursion;

public class TowerOFHanoiUse {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		
		if(disks == 0) {
			return ;
		}
		
		towerOfHanoi(disks-1,source,destination,auxiliary);
		System.out.println(source + " " + destination);
		//towerOfHanoi(disks-1,,destination,source);
		towerOfHanoi(disks-1, auxiliary, source, destination);
		
	}

}

// 2
// a b
// a c
// b c