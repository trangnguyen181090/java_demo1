
public class SortStars {
	public void sort(int n, Boolean increase) {
		if (increase) {
			for(int i = 0; i<=n; i++ ) {
				String stars = "";
				for(int j = 0; j < i; j++) {
					stars+="*";
					// System.out.println(stars);
				}
				System.out.println(stars);
				// System.out.println("\n");
			}
		} else {
			for(int i = n; i>=0; i-- ) {
				String stars = "";
				for(int j = 0; j < i; j++) {
					stars+="*";
					// System.out.println(stars);
				}
				System.out.println(stars);
				// System.out.println("\n");
			}
		}
		
	}
}
