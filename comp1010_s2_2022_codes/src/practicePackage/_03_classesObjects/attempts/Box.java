package practicePackage._03_classesObjects.attempts;

/**
 * 
 * @author gauravgupta
 * Box represents a three dimensional cuboid. We use the front perspective
 * such that 
 * the side from front to back is depth
 * the side from top to bottom is height
 * the side from left to right is width
 * 
 * IMPORTANT: Do NOT override equals()
 */
public class Box {
	public int depth, height, width;
	
	


	/**
	 * May be helpful for other methods
	 * 
	 * NOTE: if any of the values are less than 1, they should be made 1 before copying into 
	 * corresponding instance variable
	 * @param d (for depth)
	 * @param h (for height)
	 * @param w (for width)
	 */
	public Box(int d, int h, int w) {
		 if ((d <1)||(h<1)||(w<1)){
			 if(d<1) {
				 d =1;
			 }
			 if (h<1) {
				 h = 1;
			 }
			 if (w<1) {
				 w =1;
			 }
		
		 }
		 this.depth = d;
		 this.height = h;
		 this.width = w;
				 
	}

	/**
	 * May be helpful for other methods
	 * 
	 * copy constructor to create an instance copy of the passed object
	 * @param original
	 */
	public Box(Box original) { //this is the copy constructor so that if Box is called as a parameter, it assigns the variables of original
		this.depth = original.depth;
		this.height = original.height;
		this.width = original.width;
		
	}

	/**
	 * May be helpful for other methods
	 * 
	 * @return the volume of the box
	 */
	public int volume() {
		
		return this.depth *this.height*this.width;
	}

	/**
	 * May be helpful for other methods
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: volume -> surface area
	 *
	 */
	public int compareTo(Box other) { //volume -> surface area
		if (this.volume() < other.volume()) {
			return -1;
		}
		if (this.volume() == other.volume()) {
			if (this.surfaceArea()<other.surfaceArea()) {
				return -1;
			}
			if (this.surfaceArea()>other.surfaceArea()) {
				return 1;
			}
			else return 0;
		}
		if (this.volume() > other.volume()) {
			return 1;
		}
		return 0;
	}

	/**
	 * May be helpful for other methods
	 * 
	 * HD
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: volume -> surface area -> longest sides -> second longest sides -> shortest side
	 */
	public int compareToAdvanced(Box other) { 
		return 0;
	}

	/**
	 * 
	 * @return the longest side of the box
	 */
	public int longestSide() {
		if ((this.depth >= this.height)&&(this.depth > this.width)) {
			return this.depth;
		}
		if ((this.height >= this.depth)&& (this.height > this.width)) {
			return this.height;
		}
		if ((this.width >= this.height)&& (this.width > this.depth)) {
			return this.width;
		}
		if ((this.width == this.height)&&(this.width == this.depth)&& (this.depth == this.height)) {
			return this.width;
		}
		return 0;
	}

	/**
	 * 
	 * @return area of the front (or the back face)
	 */
	public int frontArea() {
		return this.width*this.height;
	}

	/**
	 * 
	 * @return the surface area of the box
	 */
	public int surfaceArea() {
		int surface1 = this.width * this.height;
		int surface2 = this.height * this.depth;
		int surface3 = this.depth * this.width;
		
		if ((this.width == this.height)&&(this.width == this.depth)&& (this.depth == this.height)) {
			return this.width*this.width*6;
		}
		
		return surface1*2 + surface2*2 + surface3*2;
	}

	/**
	 * D
	 * @param b
	 * @return true if the box represented by the calling object
	 * can fit inside the box represented by the parameter object, false otherwise.
	 * Note that a box cannot fit inside the box of the same dimension.
	 */
	public boolean canFitInside(Box b) {
		if (this.volume()>= b.volume()) {
			return false;
		}
		int canFit = this.compareTo(b);
		if (canFit ==-1) {
			if (this.longestSide()>)
		}
		if ((canFit == 0)||(canFit==1)) {
			return false;
		}
		
		return false;
	}
}